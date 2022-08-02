/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioprofiles.Portfolios.Service;

import com.portfolioprofiles.Portfolios.Model.Profile;
import java.util.List;

/**
 *
 * @author Loren
 */
public interface IProfileService {
    public List<Profile> getAllProfiles() ;
    public void createProfile( Profile per);
    public void deleteProfile(Long id);
    public Profile searchProfile(Long id);
    public void updateProfile(Long id, Profile proj);
}
