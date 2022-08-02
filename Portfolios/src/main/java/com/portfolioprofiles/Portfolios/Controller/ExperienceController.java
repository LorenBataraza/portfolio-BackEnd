/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Controller;

import com.portfolioprofiles.Portfolios.Model.Education;
import com.portfolioprofiles.Portfolios.Model.Experience;
import com.portfolioprofiles.Portfolios.Service.IEducationService;
import com.portfolioprofiles.Portfolios.Service.IExperienceService;
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
@RequestMapping("/experiences")
public class ExperienceController {
    
        @Autowired
    private IExperienceService experienceService;
    
     @GetMapping
     public List<Experience> getAllExperiences(){
         return experienceService.getAllExperiences();
    }
        
     @GetMapping("/profile/{id}")
     public List<Experience> getProfileExperiences(@PathVariable Long profile_id){
     return experienceService.getProfileExperiences( profile_id);
     }
    
     @GetMapping("/prueba")
     public String testFuncionamiento(){
         return "(Experience)";
    }
     
    @PostMapping("/new")
     public void addExperience(@RequestBody Experience ed ){
            experienceService.addExperience(ed);
    }
    
     
    @DeleteMapping("/delete/{id}")
    public void deleteExperience(@PathVariable Long id){
        experienceService.deleteExperience(id);
    }    
    
}
