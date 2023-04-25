package com.example.springmvc.dao;

import com.example.springmvc.pojo.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectDao {
    //根据项目ID查询项目
    Project getProjectById(int projectId);

    //模糊查询项目名字
    List<Project> getProjectByName(String projectName);

    //    查询所有项目
    List<Project> getAllProject();

    //    根据状态查询所有项目
    List<Project> getProjectByStatus(String status);

    //插入项目
    int insertProject(Project project);

    //修改项目信息
    int updateProject(Project project);

    //删除项目信息
    int deleteProject(int projectId);
}
