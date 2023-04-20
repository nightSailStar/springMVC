package com.example.springmvc.service;

import com.example.springmvc.dao.ProjectDao;
import com.example.springmvc.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{
   @Autowired
    ProjectDao projectDao;

    @Override
    public Project getProjectById(int projectId) {
       return projectDao.getProjectById(projectId);
    }
}
