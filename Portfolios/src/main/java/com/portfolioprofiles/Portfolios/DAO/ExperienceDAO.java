/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioprofiles.Portfolios.DAO;

import com.portfolioprofiles.Portfolios.Model.Experience;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Loren
 */

@Repository
public interface ExperienceDAO extends JpaRepository <Experience, Long> {
    
   public List<Experience> findAllByProfileId(Long profileId);
    


}
