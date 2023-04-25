package com.example.springmvc.controller;

import com.example.springmvc.pojo.Staff;
import com.example.springmvc.service.ProjectService;
import com.example.springmvc.service.StaffJoinService;
import com.example.springmvc.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/staff/queryStaffAll")
    public List<Staff> getStaffAll() {
        return staffService.getAllStaff();
    }

    @GetMapping("/staff/queryStaffById")
    public Staff getStaffById(int staffId) {
        Staff staff = staffService.getByStaffId(staffId);
        return staff;
    }

    @GetMapping("/staff/queryStaffByName")
    public List<Staff> getStaffByName(String staffName){
        return staffService.getByStaffName(staffName);
    }

    @GetMapping("/staff/queryStaffByDepartment")
    public List<Staff> getStaffByDepartment(String name) {
        return staffService.getStaffByDepartment(name);
    }

    @PostMapping("/staff/insert")
    public int insertStaff(@Validated @RequestBody Staff staff) {
        try {
            return  staffService.insertStaff(staff);
        }catch (Exception exception){
            return 0;
        }
    }


    @PostMapping("/staff/update")
    public int updateStaff(@Validated @RequestBody Staff staff) {
        return staffService.updateStaff(staff);
    }


    @GetMapping("/staff/delete")
    public int deleteStaff(int staffId){
        return staffService.deleteStaff(staffId);
    }
}
