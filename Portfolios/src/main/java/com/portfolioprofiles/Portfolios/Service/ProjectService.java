/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;

import com.portfolioprofiles.Portfolios.Model.Profile;
import com.portfolioprofiles.Portfolios.Model.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolioprofiles.Portfolios.DAO.ProfileDAO;
import com.portfolioprofiles.Portfolios.DAO.ProjectDAO;
import java.util.ArrayList;

/**
 *
 * @author Loren
 */
@Service
public class ProjectService implements IProjectService{
    
    @Autowired
    public ProjectDAO projectDTO;
    
    @Override
    public List<Project> getAllProjects() {
        return projectDTO.findAll();
    }
    
    @Override
    public void addProject( Project pro){
        projectDTO.save(pro); 
    }
    
    @Override
    public void deleteProject(Long id){
        projectDTO.deleteById(id);
    }
    

    @Override
    public  List<Project> getProfileProjects(Long profileId){
        List<Project> projects = new ArrayList<>();
        projectDTO.findAllByProfileId(profileId)
                .forEach(projects::add);
        return projects;
    }

    
    @Override
    public Project searchProject(Long id){
    return projectDTO.findById(id).get();
     }
    
     @Override
    public void updateProject(Long id, Project proj){
    projectDTO.save(proj);
    }
    
}
