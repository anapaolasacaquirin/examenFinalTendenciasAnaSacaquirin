/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.DEPTO;
import com.example.demo.model.Profesor;
import com.example.demo.repository.DEPTORepository;
import com.example.demo.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author raquel
 */
public class DEPTOServiceImpl extends GenericServiceImpl<DEPTO, Long> implements DEPTOService{
    
@Autowired
    DEPTORepository pr;
    
    @Override
    public CrudRepository<DEPTO,Long> getDao(){
        return pr;
    }

}
