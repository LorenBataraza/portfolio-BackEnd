/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Controller;

import com.portfolioprofiles.Portfolios.DTO.SkillDTO;
import com.portfolioprofiles.Portfolios.Model.Profile;
import com.portfolioprofiles.Portfolios.Model.Project;
import com.portfolioprofiles.Portfolios.Model.Skill;
import com.portfolioprofiles.Portfolios.Service.IProjectService;
import com.portfolioprofiles.Portfolios.Service.ISkillService;
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
@RequestMapping("/skills")
public class SkillController {
    
    @Autowired
    private ISkillService skillService;
    
     @GetMapping
     public List<Skill> getAllSkills(){
         return skillService.getAllSkills();
    }
        
     @GetMapping("/profile/{id}")
     public List<Skill> getProfileSkills(@PathVariable Long profile_id){
     return skillService.getProfileSkills( profile_id);
     }
     
     @GetMapping("/{id}")
     public Skill searchSkill(Long id){
     return skillService.searchSkill( id);
     }
     
    
     @GetMapping("/prueba")
     public String testFuncionamiento(){
         return "(Skill)";
    }
     
    @PostMapping("/new")
     public void addSkill(@RequestBody SkillDTO profileSkillObject){
         Skill skill = profileSkillObject.getEducation();
         Long profileId = profileSkillObject.getProfileId();
         skill.setProfile(new Profile(profileId));
         skillService.addSkill(skill);
    }
    
    @PostMapping("/new/{profile_id}")
     public void registerEducatonByUr(@RequestBody Skill skill,  @PathVariable Long profile_id){
     skill.profile.setId(profile_id);
     skillService.addSkill(skill);
     }
     
    @DeleteMapping("/delete/{id}")
    public void deleteSkill(@PathVariable Long id){
        skillService.deleteSkill(id);
    }    
    
}
