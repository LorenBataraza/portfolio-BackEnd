/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="EDUCATIONS")
public class Education {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long educationId;
    
    @Column(name = "Title")
    private String title;
    
    @Column(name = "Organization_Title")
    private String organization;
    
    @Column(name = "Score")
    private Double score;
    
    
    @Column(name = "Start_Date")
    private String startDate;
    
    @Column(name = "End_Date")
    private String endDate;
    
    @Column(name = "Image_Url")
    private String imgUrl;
    
    
    @ManyToOne()
    @JoinColumn(name= "profile_Id", nullable = false)
    public Profile profile;
    
   
    
    public Education(){
    }
    
    
    public Education(
            Long educationId, 
            String title, 
            String organization, 
            String imgUrl, 
            Double score, 
            String startDate, 
            String endDate){
        this.educationId= educationId;
        this.title= title;
        this.organization= organization;
        this.imgUrl= imgUrl;
        this.score= score;
        this.startDate= startDate;
        this.endDate= endDate;
    }
}
