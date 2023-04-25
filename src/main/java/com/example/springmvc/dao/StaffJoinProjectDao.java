package com.example.springmvc.dao;

import com.example.springmvc.pojo.StaffJoinProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface StaffJoinProjectDao {
    //根据员工ID 查询该员工所有项目
    List<StaffJoinProject> getAllProjectByStaffId(int staffId);

    //    员工id，开始、结束时间查询
    List<StaffJoinProject> getProjectByTime(@Param("staffId") int staffId, @Param("beginTime") Date beginTime, @Param("endTime") Date endTime);

    //项目id 查询该项目所有支撑员工
    List<StaffJoinProject> getAllStaffByProjectId(int projectId);

    //项目id，开始、结束时间，查询
    List<StaffJoinProject> getStaffByTime(@Param("projectId") int projectId, @Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
}
