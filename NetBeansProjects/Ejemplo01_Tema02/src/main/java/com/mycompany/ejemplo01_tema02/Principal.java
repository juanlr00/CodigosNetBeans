/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo01_tema02;

/**
 *
 * @author JuanLamasRubio
 */
public class Principal {
  
   public static void main(String[] args) {
Concurrente c1 = new Concurrente("Tarea 1");
Concurrente c2 = new Concurrente("Tarea 2");
Concurrente c3 = new Concurrente("Tarea 3");
c1.start();
c2.start();
c3.start();
System.out.println("El thread de main se ha acabado");
}

}