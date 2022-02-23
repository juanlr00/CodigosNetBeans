/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ApiSpringBoot.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JuanLamasRubio
 */
@RestController
@RequestMapping("/api")
public class LibroController {
    
    @Autowired
    private LibroRepository repo;
    
    @GetMapping("/")
    public List<models.libro> list() {
        return repo.findAll();
    }
}
