/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Project {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "Profle_Id")
    private Long personID;
    
    @Column(name = "Title")
    private String title;
    
    @Column(name = "Details")
    private String description;
    
    @Column(name = "Start_Date")
    @Temporal(value = TemporalType.DATE)
    private Date startDate;
    
    @Column(name = "End_Date")
    @Temporal(value = TemporalType.DATE)
    private Date endDate;
   
    @ManyToOne()
    @JoinColumn(name= "profile_Id", nullable = false)
    public Profile profile; 
    
    public Project(){
    }
    
    public Project(Long id, String title,String description, Date startDate ,  Date endDate , String imgUrl){
        this.id = id;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
}
