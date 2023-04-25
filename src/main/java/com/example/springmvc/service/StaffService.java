package com.example.springmvc.service;

import com.example.springmvc.pojo.Staff;

import java.util.List;

public interface StaffService {

    //获取所有员工信息
    List<Staff> getAllStaff();

    //根据id获取员工信息
    Staff getByStaffId(Integer staffId);

    //名字查询
    List<Staff> getByStaffName(String staffName);

    //部门查询
    List<Staff> getStaffByDepartment(String department);

    //添加员工
    int insertStaff(Staff staff);

    //修改员工
    int updateStaff(Staff staff);

    //删除员工,根据工号
    int deleteStaff(int staffId);


}
