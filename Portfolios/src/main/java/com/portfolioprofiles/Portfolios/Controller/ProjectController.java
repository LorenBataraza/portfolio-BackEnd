/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Controller;

import com.portfolioprofiles.Portfolios.DTO.ProjectDTO;
import com.portfolioprofiles.Portfolios.Model.Experience;
import com.portfolioprofiles.Portfolios.Model.Profile;
import com.portfolioprofiles.Portfolios.Model.Project;
import com.portfolioprofiles.Portfolios.Service.IExperienceService;
import com.portfolioprofiles.Portfolios.Service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Loren
 */
@RestController
@RequestMapping("/projects")
public class ProjectController {
            
    @Autowired
    private IProjectService projectService;
    
     @GetMapping
     public List<Project> getAllProjects(){
         return projectService.getAllProjects();
    }
        
     @GetMapping("/profile/{id}")
     public List<Project> getProfileProjects(@PathVariable Long profile_id){
     return projectService.getProfileProjects( profile_id);
     }
     
     @GetMapping("/{id}")
     public Project searchProject(Long id){
     return projectService.searchProject( id);
     }
     
    
     @GetMapping("/prueba")
     public String testFuncionamiento(){
         return "(Project)";
    }
     
    @PostMapping("/new")
     public void addProject(@RequestBody ProjectDTO profileProjectObject){
         Project project = profileProjectObject.getEducation();
         Long profileId = profileProjectObject.getProfileId();
         project.setProfile(new Profile(profileId));
         projectService.addProject(project);
    }
    
    @PostMapping("/new/{profile_id}")
     public void registerEducatonByUr(@RequestBody Project project,  @PathVariable Long profile_id){
     project.profile.setId(profile_id);
     projectService.addProject(project);
     }
     
     
    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable Long id){
        projectService.deleteProject(id);
    }    
    
}
