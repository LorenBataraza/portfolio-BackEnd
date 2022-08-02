/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioprofiles.Portfolios.DAO;

import com.portfolioprofiles.Portfolios.Model.Project;
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
public interface ProjectDAO extends JpaRepository <Project, Long> {
    
  public List<Project> findAllByProfileId(Long profileId);
  //@Query("SELECT r.id FROM porfolios.project r where r.name = :name") 
  //List<Project> findIdByProfileID(@Param("profileID") Long profileID);

    
}
