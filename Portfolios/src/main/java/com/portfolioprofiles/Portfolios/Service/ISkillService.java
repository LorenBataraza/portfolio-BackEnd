/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;

import com.portfolioprofiles.Portfolios.Model.Skill;
import java.util.List;

/**
 *
 * @author Loren
 */
public interface ISkillService {
    public List<Skill> getAllSkills() ;
    public List<Skill> getProfileSkills(Long profile_id) ;
    public void addSkill( Skill skill);
    public void deleteSkill(Long id);
    public Skill searchSkill(Long id);
    public void updateSkill(Long id, Skill skill);
}
