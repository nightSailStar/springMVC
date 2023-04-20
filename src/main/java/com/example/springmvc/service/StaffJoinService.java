package com.example.springmvc.service;

import com.example.springmvc.pojo.StaffAndProject;
import com.example.springmvc.pojo.StaffJoinProject;

import java.util.Date;
import java.util.List;

public interface StaffJoinService {
    List<StaffAndProject> getAllProjectByStaffId(int staffId);
    List<StaffAndProject> getAllProjectByTime(int staffId, Date beginTime,Date endTime);
}
