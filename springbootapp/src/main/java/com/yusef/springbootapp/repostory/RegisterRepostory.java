/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hassouna.springbootapp.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author HP
 */
public interface RegisterRepostory extends JpaRepository<com.hassouna.springboo.Models.Register_E, Integer>{
    
}
