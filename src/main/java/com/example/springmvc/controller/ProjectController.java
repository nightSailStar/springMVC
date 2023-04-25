package com.example.springmvc.controller;
import com.example.springmvc.pojo.Project;
import com.example.springmvc.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/project/all")
    public List<Project> getAllProject(){
        return projectService.getAllProject();
    }

    @GetMapping("/project/projectId")
    public Project getProjectById(int projectId){
        return projectService.getProjectById(projectId);
    }

    @GetMapping("/project/projectName")
    public List<Project> getProjectByName(String projectName){
        return projectService.getProjectByName(projectName);
    }

    @GetMapping("/project/projectStatus")
    public List<Project> getProjectByStatus(String status){
        return projectService.getProjectByStatus(status);
    }

    @PostMapping("project/insert")
    public int insertProject( @RequestBody Project project){
        return projectService.insertProject(project);
    }

    @PostMapping("project/insertDouble")
    public int insertDoubleProject(@RequestBody List<Project> list){
        int count=0;
        for (Project project : list){
            count +=projectService.insertProject(project);
        }
        return count;
    }

    @PostMapping("project/update")
    public int updateProject( @RequestBody Project project){
        return projectService.updateProject(project);
    }

    @GetMapping("project/delete")
    public int deleteProject(int projectId){
        return projectService.deleteProject(projectId);
    }
}
