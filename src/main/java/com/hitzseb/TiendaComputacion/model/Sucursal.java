package com.hitzseb.TiendaComputacion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sucursales")
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private float ventas;

    public Sucursal() {
    }

    public Sucursal(int id, String nombre, float ventas) {
        this.id = id;
        this.nombre = nombre;
        this.ventas = ventas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVentas() {
        return ventas;
    }

    public void setVentas(float ventas) {
        this.ventas = ventas;
    }
    
}