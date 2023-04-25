package com.example.springmvc.service;

import com.example.springmvc.pojo.Project;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProjectService {

    List<Project> getAllProject();

    Project getProjectById(int project_id);

    List<Project> getProjectByName(String projectName);

    List<Project> getProjectByStatus(String status);

    int insertProject(Project project);

    int updateProject(Project project);

    int deleteProject(int projectId);
}
