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
public class Profesor {
    @Id
    private Long _id;
    private String depto_id;
    private String nombre;
    private String direccion;
    private String telefono;

    public Profesor() {
    }

    public Profesor(long _id, String depto_id, String nombre, String direccion, String telefono) {
        this._id = _id;
        this.depto_id = depto_id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public long getId() {
        return _id;
    }

    public void setId(long _id) {
        this._id = _id;
    }

    public String getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(String depto_id) {
        this.depto_id = depto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    
}
