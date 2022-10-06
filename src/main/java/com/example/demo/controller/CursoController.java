/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Curso;
import com.example.demo.service.CursoService;
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
@RequestMapping("/api/curso")
public class CursoController {
    @Autowired
     CursoService casasService;
    
@GetMapping("/lista")
public ResponseEntity<List<Curso>> listar(){
 return new ResponseEntity<>(casasService.findByAll(),HttpStatus.OK);
}



@PostMapping("/crear")
 public ResponseEntity<Curso>crear(Curso p){
     return new ResponseEntity<>(casasService.save(p),HttpStatus.CREATED);
 }
 @DeleteMapping("/eliminar/{id}")
 public ResponseEntity<Curso>eliminar(@PathVariable Long id){
     casasService.delete(id);
     return new ResponseEntity<>(HttpStatus.OK);
 }

 @PutMapping("/actualizar/{id}")
 public ResponseEntity<Curso> actualizar(@PathVariable Long id, @RequestBody Curso p){
     Curso casa = buscarCasas(id);
     if( casa==null){
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         
     }else{
         try{
             casa.setId(p.getId());
             casa.setProfe_id(p.getProfe_id());
             casa.setNombre(p.getNombre());
             casa.setNivel(p.getNivel());
             casa.setDescripcion(p.getDescripcion());

            
             
         return new ResponseEntity<>(casasService.save(casa),HttpStatus.CREATED);
         }catch (Exception e){
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }
 }
 
 
 public Curso buscarCasas(@PathVariable Long id){
     return casasService.findById(id);
}
 
// @GetMapping("/BuscarCodigo/{codigo}")
//public ResponseEntity<List<Persona>> listado(@PathVariable String codigo){
//
// return new ResponseEntity<>(casasService.listado(codigo),HttpStatus.OK);
//}
    
    
}
