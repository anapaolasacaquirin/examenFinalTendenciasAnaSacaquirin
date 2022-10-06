/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Curso;
import com.example.demo.model.Profesor;
import com.example.demo.repository.CursoRepository;
import com.example.demo.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author raquel
 */
public class CursoServiceImpl extends GenericServiceImpl<Curso, Long> implements CursoService{
     @Autowired
    CursoRepository pr;
    
    @Override
    public CrudRepository<Curso,Long> getDao(){
        return pr;
    }
    

}
