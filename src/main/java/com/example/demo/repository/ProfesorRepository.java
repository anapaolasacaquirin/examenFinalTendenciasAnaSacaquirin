/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.model.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author raquel
 */
public interface ProfesorRepository extends MongoRepository<Profesor, Long>{
    
}
