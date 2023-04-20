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
}
