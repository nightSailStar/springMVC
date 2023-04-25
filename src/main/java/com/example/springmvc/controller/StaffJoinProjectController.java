package com.example.springmvc.controller;


import com.example.springmvc.pojo.ProjectAndStaff;
import com.example.springmvc.pojo.StaffAndProject;
import com.example.springmvc.service.StaffJoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class StaffJoinProjectController {
    @Autowired
    StaffJoinService staffJoinService;

//    查询该员工id 的所有参与项目
    @GetMapping("/staff/queryProject")
    public List<StaffAndProject> getAllProjectByStaffId(int staffId) {
        return staffJoinService.getAllProjectByStaffId(staffId);
    }

//    查询该员工id 某段时间内 所有参与项目
    @GetMapping("/staff/queryProjectByTime")
    public List<StaffAndProject> getAllProjectByTime(int staffId,
                                                        @DateTimeFormat(pattern ="yyyy-MM-dd")
                                                        Date beginTime,
                                                        @DateTimeFormat(pattern ="yyyy-MM-dd")
                                                        Date endTime) {
        return staffJoinService.getAllProjectByTime(staffId, beginTime, endTime);
    }


    @GetMapping("/project/queryStaff")
    public List<ProjectAndStaff> getAllStaffByProjectId(int projectId){
        return staffJoinService.getAllStaffByProjectId(projectId);
    }

    @GetMapping("/project/queryStaffByTime")
    public List<ProjectAndStaff> getStaffByTime(int projectId,
                                                @DateTimeFormat(pattern ="yyyy-MM-dd")
                                                        Date beginTime,
                                                @DateTimeFormat(pattern ="yyyy-MM-dd")
                                                            Date endTime){
        return staffJoinService.getAllStaffByTime(projectId,beginTime,endTime);
    }


}
