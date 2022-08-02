/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Loren
 */
@Getter @Setter
@Entity
@Table(name="PROFILES")
public class Profile {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "Birth_Date")
    @Temporal(value = TemporalType.DATE)
    private Date birthDate;
   
    @Column(name = "Profession")
    private String profession;
    
    @Column(name = "About")
    private String about;
    
    @Column(name = "Avatar_Url")
    private String avatarUrl;
    
    @Column(name = "Banner_Url")
    private String bannerUrl;
    
    @Column(name = "Nationality")
    private String nationality;
            
    @Column(name = "Home_Id")
    private Long homeId;
    
    @Column(name = "Email")
    private String email;
    
    /*    @OneToMany(mappedBy= "profiles")
    private Set<Experience> experiences;
    
    @OneToMany(mappedBy= "profiles")
    private Set<Project> projects;
    
    @OneToMany(mappedBy= "profiles")
    private Set<Skill> skills;
    
    @OneToMany(mappedBy= "profiles")
    private Set<Education> educations;
    */
 
    
    public Profile (){
    }
    
    public Profile(Long id){
        this.id = id;
    }
    
    public Profile (
            Long id, 
            String name, 
            Date birthDate, 
            String profession, 
            String about, 
            String avatar_url,
            String banner_url, 
            String nationality,
            Long homeId,
            String email
    ){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.profession = profession;
        this.about = about;
        this.avatarUrl = avatar_url;
        this.bannerUrl = banner_url;
        this.nationality  = nationality;
        this.homeId = homeId;
        this.email = email;
    }
}

