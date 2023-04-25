package com.example.springmvc.dao;

import com.example.springmvc.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffDao {
    //获取所有员工信息
    List<Staff> getAllStaff();

    //根据id获取员工信息
    Staff getByStaffId(Integer staffId);

    //名字查询
    List<Staff> getByStaffName(String staffName);

    //部门查询
    List<Staff> getByDepartment(String department);

    //添加员工
    int insertStaff(Staff staff);

    //修改员工
    int updateStaff(Staff staff);

    //删除员工,根据工号
    int deleteStaff(int staffId);
}
