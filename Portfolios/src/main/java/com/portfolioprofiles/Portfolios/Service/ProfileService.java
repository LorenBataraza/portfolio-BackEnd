/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;

import com.portfolioprofiles.Portfolios.Model.Profile;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolioprofiles.Portfolios.DAO.ProfileDAO;
import com.portfolioprofiles.Portfolios.Model.Experience;

/**
 *
 * @author Loren
 */
@Service
public class ProfileService implements IProfileService{
    
    @Autowired
    public ProfileDAO profileDTO;
    
    @Override
    public List<Profile> getAllProfiles() {
        return profileDTO.findAll();
    }
    
    @Override
    public void createProfile( Profile per){
        profileDTO.save(per); 
    }
    
    @Override
    public void deleteProfile(Long id){
        profileDTO.deleteById(id);
    }
    
    @Override
    public Profile searchProfile(Long id){
        return profileDTO.findById(id).get();
    }
    
    
    @Override
    public void updateProfile(Long id, Profile ex){
    profileDTO.save(ex);
    }
    
 
}
