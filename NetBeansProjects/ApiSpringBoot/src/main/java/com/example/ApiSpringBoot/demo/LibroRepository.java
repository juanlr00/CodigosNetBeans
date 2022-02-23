/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ApiSpringBoot.demo;

import java.util.List;
import models.libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author JuanLamasRubio
 */
public interface LibroRepository extends JpaRepository<libro, Long> {
    
    @Query(value = "SELECT e FROM libro e WHERE titulo = '?1'")
    List<libro> findByTitulo(@Param("titulo") String titulo);
    
    List<libro> findByAutor(@Param("autor") String Autor);
    
    List<libro> findByCategoria(@Param("categoria") String categoria);
}
