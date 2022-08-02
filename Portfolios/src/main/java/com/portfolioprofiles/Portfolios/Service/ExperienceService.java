/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;


import com.portfolioprofiles.Portfolios.Model.Experience;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolioprofiles.Portfolios.DAO.ExperienceDAO;

/**
 *
 * @author Loren
 */
@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceDAO experienceDAO;
    
    @Override
    public List<Experience> getAllExperiences() {
        return experienceDAO.findAll();
    }
    
    @Override
    public void addExperience( Experience per){
        experienceDAO.save(per); 
    }
    
    @Override
    public void deleteExperience(Long id){
        experienceDAO.deleteById(id);
    }
    

    @Override
    public List<Experience> getProfileExperiences(Long profileId){
    return experienceDAO.findAllByProfileId(profileId);
    }

    
    @Override
    public Experience searchExperience(Long id){
        return experienceDAO.findById(id).get();
    }
   
    @Override
    public void updateExperience(Long id, Experience ex){
        experienceDAO.save(ex);
    }
}
