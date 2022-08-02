/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioprofiles.Portfolios.DAO;

import com.portfolioprofiles.Portfolios.Model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Loren
 */

@Repository
public interface ProfileDAO extends JpaRepository <Profile, Long> {
}
