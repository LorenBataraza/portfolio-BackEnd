/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;


import com.portfolioprofiles.Portfolios.Model.Project;
import java.util.List;

/**
 *
 * @author Loren
 */
public interface IProjectService {
    public List<Project> getAllProjects() ;
    public List<Project> getProfileProjects(Long profile_id) ;
    public void addProject( Project proj);
    public void deleteProject(Long id);
    public Project searchProject(Long id);
    public void updateProject(Long id, Project proj);
}
