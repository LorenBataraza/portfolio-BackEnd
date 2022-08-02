/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;

import com.portfolioprofiles.Portfolios.Model.Education;
import java.util.List;

/**
 *
 * @author Loren
 */
public interface IEducationService {
    public List<Education> getAllEducations() ;
    public List<Education> searchProfileEducation(Long profile_id) ;
    public void registerEducaton( Education ed);
    public void deleteEducation(Long id);
    public void deleteAllEducations();
    public Education getEducationById(Long id);
    public void updateEducation(Long id, Education ed);
  
}
