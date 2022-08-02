/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Controller;

import com.portfolioprofiles.Portfolios.Model.Education;
import com.portfolioprofiles.Portfolios.Model.Profile;
import com.portfolioprofiles.Portfolios.Service.EducationService;
import com.portfolioprofiles.Portfolios.Service.IEducationService;
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
@RequestMapping("/educations")
public class EducationController {
    
    @Autowired
    private IEducationService educationService;
    
     @GetMapping
     public List<Education> getAllEducations (){
         return educationService.getAllEducations();
    }
        
     @GetMapping("/profile/{profile_id}")
     public List<Education> searchProfileEducation(@PathVariable Long profile_id){
     return educationService.searchProfileEducation(profile_id);
     }
    
     @GetMapping("/prueba")
     public String testFuncionamiento(){
         return "(Education)";
    }
     
    @PostMapping("/new")
     public void registerEducaton(@RequestBody Education education ){
            educationService.registerEducaton(education);
    }
    
     /*     @PostMapping("/new/{profile_id}")
     public void registerEducatonWithId(@RequestBody Education education,  @PathVariable Long profile_id){
     education.profile.setId(profile_id);
     educationService.registerEducaton(education);
     }*/
     
     @PostMapping("/new/{profileId}")
     public void registerEducatonWithId(@RequestBody Education education,  @PathVariable Long profileId){
            education.setProfile(new Profile(profileId));
            educationService.registerEducaton(education);
    }
    
     
    @DeleteMapping("/delete/{id}")
    public void deleteEducation(@PathVariable Long id){
        educationService.deleteEducation(id);
    }    
    
    @DeleteMapping("/delete")
    public void deleteAllEducation(){
        educationService.deleteAllEducations();
    }    
    
}
