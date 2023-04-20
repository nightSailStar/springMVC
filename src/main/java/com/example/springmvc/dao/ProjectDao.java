package com.example.springmvc.dao;

import com.example.springmvc.pojo.Project;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectDao {
//根据项目ID查询项目
    Project getProjectById(int projectId);
}
