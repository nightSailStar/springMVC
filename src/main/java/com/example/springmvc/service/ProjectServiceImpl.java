package com.example.springmvc.service;

import com.example.springmvc.dao.ProjectDao;
import com.example.springmvc.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{
   @Autowired
    ProjectDao projectDao;

    @Override
    public Project getProjectById(int projectId) {
       return projectDao.getProjectById(projectId);
    }

    @Override
    public List<Project> getProjectByName(String projectName) {
        return projectDao.getProjectByName(projectName);
    }

    @Override
    public List<Project> getAllProject() {
        return projectDao.getAllProject();
    }

    @Override
    public List<Project> getProjectByStatus(String status) {
        return projectDao.getProjectByStatus(status);
    }

    @Override
    public int insertProject(Project project) {
        //设置创造时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long l = System.currentTimeMillis();
        Date createTime = new Timestamp(l);
        project.setGmtCreate(createTime);
       return projectDao.insertProject(project);
    }

    @Override
    public int updateProject(Project project) {
        //设置修改时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long l = System.currentTimeMillis();
        Date modifiedTime = new Timestamp(l);
        project.setGmtModified(modifiedTime);
        return projectDao.updateProject(project);
    }

    @Override
    public int deleteProject(int projectId) {
        return projectDao.deleteProject(projectId);
    }
}
