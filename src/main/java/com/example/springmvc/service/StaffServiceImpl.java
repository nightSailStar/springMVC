package com.example.springmvc.service;

import com.example.springmvc.dao.StaffDao;
import com.example.springmvc.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService{

    @Autowired
    private StaffDao staffdao;

    @Override
    public List<Staff> getAllStaff() {
        List<Staff> list = staffdao.getAllStaff();
        return list;
    }

    @Override
    public Staff getByStaffId(Integer staffId) {
        return  staffdao.getByStaffId(staffId);
    }

    @Override
    public List<Staff> getByStaffName(String staffName) {
        return staffdao.getByStaffName(staffName);
    }

    @Override
    public List<Staff> getStaffByDepartment(String department) {
        return staffdao.getByDepartment(department);
    }

    @Override
    public int insertStaff(Staff staff) {
        //设置创造时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long l = System.currentTimeMillis();
        Date createTime = new Timestamp(l);
        staff.setGmtCreate(createTime);
        return staffdao.insertStaff(staff);
    }

    @Override
    public int updateStaff(Staff staff) {
        //设置修改时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long l = System.currentTimeMillis();
        Date modifiedTime = new Timestamp(l);
        staff.setGmtModified(modifiedTime);
        return staffdao.updateStaff(staff);
    }

    @Override
    public int deleteStaff(int staffId) {
        return staffdao.deleteStaff(staffId);
    }
}
