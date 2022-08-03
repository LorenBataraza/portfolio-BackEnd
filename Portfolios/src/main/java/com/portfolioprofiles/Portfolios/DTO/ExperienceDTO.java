/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.DTO;

import com.portfolioprofiles.Portfolios.Model.Experience;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Loren
 */
@Setter @Getter 
public class ExperienceDTO {
public Experience education;
public Long profileId;

public ExperienceDTO(Experience education, Long profileId){
    this.education = education;
    this.profileId = profileId;
}
public ExperienceDTO(){
}
}
