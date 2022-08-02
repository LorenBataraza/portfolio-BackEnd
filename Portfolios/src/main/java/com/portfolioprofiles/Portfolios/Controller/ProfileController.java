/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Controller;

import com.portfolioprofiles.Portfolios.Model.Education;
import com.portfolioprofiles.Portfolios.Model.Profile;
import com.portfolioprofiles.Portfolios.Service.EducationService;
import com.portfolioprofiles.Portfolios.Service.IProfileService;
import com.portfolioprofiles.Portfolios.Service.ProfileService;

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
@RequestMapping("/profiles")
public class ProfileController {
    
       // Profile Methods
    @Autowired
    private IProfileService profileService;
    
     @GetMapping("")
     public List<Profile> getAllProfiles (){
         return profileService.getAllProfiles();
    }
     
    @GetMapping("/prueba")
     public String testFuncionamiento(){
         return "(Profiles)";
    }
         
    @GetMapping("/{id}")
    public Profile verPersonas(@PathVariable Long id){
        return profileService.searchProfile(id);
    }    

    
    @PostMapping("/new")
     public void agregarPersona (@RequestBody Profile prof ){
            profileService.createProfile(prof);
    }
    
     
    @DeleteMapping("/delete/{id}")
    public void borrarPersonaById(@PathVariable Long id){
        profileService.deleteProfile(id);
    }    
    

    
}
