/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.DEPTO;
import com.example.demo.service.DEPTOService;
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
@RequestMapping("/api/DEPTO")
public class DEPTOController {
    @Autowired
     DEPTOService casasService;
    
@GetMapping("/lista")
public ResponseEntity<List<DEPTO>> listar(){
 return new ResponseEntity<>(casasService.findByAll(),HttpStatus.OK);
}



@PostMapping("/crear")
 public ResponseEntity<DEPTO>crear(DEPTO p){
     return new ResponseEntity<>(casasService.save(p),HttpStatus.CREATED);
 }
 @DeleteMapping("/eliminar/{id}")
 public ResponseEntity<DEPTO>eliminar(@PathVariable Long id){
     casasService.delete(id);
     return new ResponseEntity<>(HttpStatus.OK);
 }

 @PutMapping("/actualizar/{id}")
 public ResponseEntity<DEPTO> actualizar(@PathVariable Long id, @RequestBody DEPTO p){
     DEPTO casa = buscarCasas(id);
     if( casa==null){
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         
     }else{
         try{
             casa.setId(p.getId());
             casa.setNombre(p.getNombre());
             casa.setDirector(p.getDirector());
             casa.setDescripcion(p.getDescripcion());


            
             
         return new ResponseEntity<>(casasService.save(casa),HttpStatus.CREATED);
         }catch (Exception e){
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }
 }
 
 
 public DEPTO buscarCasas(@PathVariable Long id){
     return casasService.findById(id);
}
 
// @GetMapping("/BuscarCodigo/{codigo}")
//public ResponseEntity<List<Persona>> listado(@PathVariable String codigo){
//
// return new ResponseEntity<>(casasService.listado(codigo),HttpStatus.OK);
//}
    
}
