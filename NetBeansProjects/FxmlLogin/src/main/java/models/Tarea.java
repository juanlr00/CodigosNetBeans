/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author JuanLamasRubio
 */
@Entity
@Table(name="tarea2")
public class Tarea implements Serializable {
    
    @Id
    @GeneratedValue(strategy=IDENTITY)
    
    private long id;
    
    private String nombre;
    
    private String prioridad;
    
  
    
    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public Tarea() {
    }

    public Tarea(long id, String nombre, String prioridad, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.usuario = usuario;
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

  

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", nombre=" + nombre + ", prioridad=" + prioridad + ", usuario=" + usuario.getUsername() + '}';
    }
    
    
    
}
