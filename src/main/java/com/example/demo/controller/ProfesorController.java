/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Profesor;
import com.example.demo.service.ProfesorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author raquel
 */
@RestController
@RequestMapping("/api/Profesor")
public class ProfesorController {
    
    @Autowired
     ProfesorService casasService;
    
@GetMapping("/lista")
public ResponseEntity<List<Profesor>> listar(){
 return new ResponseEntity<>(casasService.findByAll(),HttpStatus.OK);
}



@PostMapping("/crear")
 public ResponseEntity<Profesor>crear(Profesor p){
     return new ResponseEntity<>(casasService.save(p),HttpStatus.CREATED);
 }
 @DeleteMapping("/eliminar/{id}")
 public ResponseEntity<Profesor>eliminar(@PathVariable Long id){
     casasService.delete(id);
     return new ResponseEntity<>(HttpStatus.OK);
 }

 @PutMapping("/actualizar/{id}")
 public ResponseEntity<Profesor> actualizar(@PathVariable Long id, @RequestBody Profesor p){
     Profesor casa = buscarCasas(id);
     if( casa==null){
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         
     }else{
         try{
             casa.setId(p.getId());
             casa.setDepto_id(p.getDepto_id());
             casa.setNombre(p.getNombre());
             casa.setDireccion(p.getDireccion());
             casa.setTelefono(p.getTelefono());

            
             
         return new ResponseEntity<>(casasService.save(casa),HttpStatus.CREATED);
         }catch (Exception e){
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }
 }
 
 
 public Profesor buscarCasas(@PathVariable Long id){
     return casasService.findById(id);
}
 

    
    
    
}
