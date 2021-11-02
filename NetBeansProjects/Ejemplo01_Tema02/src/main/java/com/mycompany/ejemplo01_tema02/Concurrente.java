/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo01_tema02;

import java.security.SecureRandom;



/**
*
* @author DanielMenaRodríguez
*/
public class Concurrente extends Thread {

private final int tiempo;
private final String nombre;
private SecureRandom generador = new SecureRandom();

public Concurrente(String nombre){
this.nombre = nombre;
this.tiempo = generador.nextInt(5000);
}



/**
*
*/
@Override
public void run() {
System.out.printf("%s se ha ido a dormir %d milisegundos%n", nombre, tiempo);
try{
Thread.sleep(tiempo);
}catch (InterruptedException ex){
}
}

}