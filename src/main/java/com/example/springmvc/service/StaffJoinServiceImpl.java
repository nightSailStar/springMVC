package com.example.springmvc.service;

import com.example.springmvc.dao.ProjectDao;
import com.example.springmvc.dao.StaffJoinProjectDao;
import com.example.springmvc.pojo.Project;
import com.example.springmvc.pojo.StaffAndProject;
import com.example.springmvc.pojo.StaffJoinProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StaffJoinServiceImpl implements StaffJoinService {

    @Autowired
    StaffJoinProjectDao staffJoinProjectDao;
    @Autowired
    ProjectDao projectDao;

//    通过员工信息，返回传递给前端的对象StaffAndProject类
    @Override
    public List<StaffAndProject> getAllProjectByStaffId(int staffId) {
        List<StaffJoinProject> list = staffJoinProjectDao.getAllProjectByStaffId(staffId);
        return getProjectInfo(list);
    }

    @Override
    public List<StaffAndProject> getAllProjectByTime(int staffId, Date beginTime, Date endTime) {
        List<StaffJoinProject> list = staffJoinProjectDao.getProjectByTime(staffId, beginTime, endTime);
        return getProjectInfo(list);
    }

    //通过（员工参与项目）列表，查询（列表里面所有项目）的信息。将需要的信息存在对象StaffAndProject
    private List<StaffAndProject> getProjectInfo(List<StaffJoinProject> list) {
        List<StaffAndProject> res = new ArrayList<>();
        for (StaffJoinProject sjp : list) {
            int projectId = sjp.getProjectId();
            Project project = projectDao.getProjectById(projectId);
            StaffAndProject staffAndProject = new StaffAndProject();
            staffAndProject.setProjectId(projectId);
            staffAndProject.setProjectName(project.getProjectName());
            staffAndProject.setStatus(project.getStatus());
            staffAndProject.setSupportBeginTime(sjp.getSupportBeginTime());
            staffAndProject.setSupportEndTime(sjp.getSupportEndTime());
            res.add(staffAndProject);
        }
        return res;
    }
}

