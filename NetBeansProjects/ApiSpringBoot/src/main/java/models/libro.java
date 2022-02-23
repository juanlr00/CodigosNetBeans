/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author JuanLamasRubio
 */
@Data
@Entity
@Table(name="libro")

public class libro implements Serializable{
   @Id
   @GeneratedValue 
   
   private Long id;
   private String titulo;
   private String autor;
   private String categoria;
   private Integer isbn;
   private String edicion;
}

