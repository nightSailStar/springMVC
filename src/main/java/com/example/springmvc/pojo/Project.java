package com.example.springmvc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Project {
    private int id;
    private Date gmtCreate ;
    private Date gmtModified;
    private int projectId;
    private String projectName;
    private String info;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date beginTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endTime;
    private String status;
    private String importance;
    private double contractAmount;
    private double progressValue;

}
