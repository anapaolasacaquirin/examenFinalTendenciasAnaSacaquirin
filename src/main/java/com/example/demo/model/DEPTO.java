/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import org.springframework.data.annotation.Id;

/**
 *
 * @author raquel
 */
public class DEPTO {
     @Id
    private Long _id;
    private String nombre;
    private String director;
    private String descripcion;

    public DEPTO() {
    }

    public DEPTO(long _id, String nombre, String director, String descripcion) {
        this._id = _id;
        this.nombre = nombre;
        this.director = director;
        this.descripcion = descripcion;
    }

    public long getId() {
        return _id;
    }

    public void setId(long _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}
