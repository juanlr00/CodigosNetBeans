/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Tarea;

/**
 *
 * @author JuanLamasRubio
 */
public class Objetos {
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String archivo = "listado.obj";
        
        ArrayList<Tarea> tareas = new ArrayList<Tarea>();
        tareas.add ( new Tarea("Ejercicio 1 de SGE", "ALTA","Luis"));
        tareas.add ( new Tarea("Ejercicio 2 de SGE", "MEDIA","Carlos"));
        tareas.add ( new Tarea("Ejercicio Grupal", "URGENTE","Alejandro"));
        
        System.out.println(tareas);
        
        File f = new File(archivo);
        
        if(!f.exists()) {
            Logger.getLogger("Objeto").info("Archivo no existe");
        
        
        try( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(archivo))) {
            oos.writeObject(tareas);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    } else {
            
       
        
        Logger.getLogger("Objetos").info("Archivo existe y el contenido es:");
        
        try ( var ois = new ObjectInputStream( new FileInputStream(archivo)) ) {
            System.out.println(ois.readObject());  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
       
        }
        
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        String prioridad = sc.nextLine();
        String responsable = sc.nextLine();
        
        Tarea t = new Tarea(nombre,prioridad,responsable);
        tareas.add(t);
        
        try( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(archivo))) {
            oos.writeObject(tareas);
        
        } catch (Exception ex) {
            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
}

    
    

    

