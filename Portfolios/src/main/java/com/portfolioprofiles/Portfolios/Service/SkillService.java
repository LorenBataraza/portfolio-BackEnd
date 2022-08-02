/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;

import com.portfolioprofiles.Portfolios.Model.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolioprofiles.Portfolios.DAO.SkillDAO;
import com.portfolioprofiles.Portfolios.Model.Project;

/**
 *
 * @author Loren
 */
@Service
public class SkillService implements ISkillService{
    
    @Autowired
    public SkillDAO skillDTO;
    
    @Override
    public List<Skill> getAllSkills() {
        return skillDTO.findAll();
    }
    
    @Override
    public void addSkill( Skill skill){
        skillDTO.save(skill); 
    }
    
    @Override
    public void deleteSkill(Long id){
        skillDTO.deleteById(id);
    }
    

    @Override
    public  List<Skill> getProfileSkills(Long id){
        return skillDTO.findAllByProfileId(id);
    }

    
    @Override
    public Skill searchSkill(Long Id){
        return skillDTO.findById(Id).get();
    }
            
    @Override
    public void updateSkill(Long id, Skill skill){
    skillDTO.save(skill);
    }
}
