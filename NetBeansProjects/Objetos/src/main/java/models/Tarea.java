/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author JuanLamasRubio
 */
public class Tarea implements Serializable {
    private String nombre;
    private String prioridad;
    private String responsable;

    public Tarea(String nombre, String prioridad, String responsable) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.responsable = responsable;
        
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
        
    @Override
    public String toString() {
        return "Tarea{" + "nombre=" + nombre + ", prioridad=" + prioridad + ", responsable=" + responsable + '}';
    
    }

}
