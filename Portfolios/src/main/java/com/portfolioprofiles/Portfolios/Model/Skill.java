/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Loren
 */
@Getter @Setter
@Entity
@Table(name="SKILLS")
public class Skill {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Title")
    private String title;
    
    @Column(name = "Proficiency")
    private SkillLevel skillLevel;
    
    
    @ManyToOne()
    @JoinColumn(name= "profile_Id", nullable = false)
    public Profile profile;
    
    public Skill(){
    }
    
    public Skill(Long id, String title, SkillLevel skillLevel){
        this.id = id;
        this.title = title;
        this.skillLevel = skillLevel;
    }
}
