/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.DTO;

import com.portfolioprofiles.Portfolios.Model.Education;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Loren
 */
@Setter @Getter 
public class EducationDTO{
public Education education;
public Long profileId;

public EducationDTO(Education education, Long profileId){
    this.education = education;
    this.profileId = profileId;
}
public EducationDTO(){
}

}
