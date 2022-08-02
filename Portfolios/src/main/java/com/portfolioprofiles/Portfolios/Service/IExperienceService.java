/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;

import com.portfolioprofiles.Portfolios.Model.Experience;

import java.util.List;

/**
 *
 * @author Loren
 */
public interface IExperienceService {
    
    public List<Experience>  getAllExperiences() ;
    public List<Experience> getProfileExperiences(Long profile_id) ;
    public void addExperience( Experience exp);
    public void deleteExperience(Long id);
    public Experience searchExperience(Long id);
   public void updateExperience(Long id, Experience exp);
    
}
