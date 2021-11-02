/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author JuanLamasRubio
 */
public class Comandas implements Serializable {
    
    private Integer id;
    private String nombre;
    private String disponibilidad;
    private String prioridad;

    public Comandas() {
    }

    public Comandas(Integer id, String nombre, String disponibilidad, String prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.prioridad = prioridad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Comandas{" + "id=" + id + ", nombre=" + nombre + ", disponibilidad=" + disponibilidad + ", prioridad=" + prioridad + '}';
    }
    
}
