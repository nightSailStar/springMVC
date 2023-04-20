package com.example.springmvc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class StaffJoinProject {
    private int id ;
    private Date gmtCreate ;
    private Date gmtModified;
    private int staffId;
    private int projectId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date supportBeginTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date supportEndTime;
    private double supportWeight;
}
