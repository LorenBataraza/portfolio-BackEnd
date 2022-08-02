/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;

import com.portfolioprofiles.Portfolios.Model.Education;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolioprofiles.Portfolios.DAO.EducationDAO;
import java.util.ArrayList;

/**
 *
 * @author Loren
 */

@Service
public class EducationService implements IEducationService{
    
   @Autowired
    public EducationDAO educationDTO;
    
    @Override
    public List<Education> getAllEducations() {
        return educationDTO.findAll();
    }
    
    @Override
    public void registerEducaton( Education ed){
        educationDTO.save(ed); 
    }
    
    @Override
    public void deleteEducation(Long id){
        educationDTO.deleteById(id);
    }
    
    @Override
    public void deleteAllEducations(){
        educationDTO.deleteAll();
    }
    
    @Override
    public Education getEducationById(Long id){
        return educationDTO.findById(id).get();
    }
        
    
    @Override
    public void updateEducation(Long id, Education ed){
        educationDTO.save(ed);
    }

    @Override
    public List<Education> searchProfileEducation(Long profileId){
        List<Education> educations = new ArrayList<>();
        educationDTO.findAllByProfileId(profileId).forEach(educations::add);
        return educations;
    }

   
}
