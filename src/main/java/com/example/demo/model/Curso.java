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
public class Curso {
    
    @Id
    private Long _id;
    private String profe_id;
    private String nombre;
    private String nivel;
    private String descripcion;

    public Curso() {
    }

    public Curso(long _id, String profe_id, String nombre, String nivel, String descripcion) {
        this._id = _id;
        this.profe_id = profe_id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    public long getId() {
        return _id;
    }

    public void setId(long _id) {
        this._id = _id;
    }

    public String getProfe_id() {
        return profe_id;
    }

    public void setProfe_id(String profe_id) {
        this.profe_id = profe_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
