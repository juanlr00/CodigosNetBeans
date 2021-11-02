package com.mycompany.daoejemplo;

import model.Tarea;

/**
 *
 * @author FranciscoRomeroGuill
 */
public class Principal {

    public static void main(String[] args) {

        var DAO = new TareaDAO();
        
//        Tarea t = new Tarea(3434,"Preparar Examen","Francisco","Importante");
//        
//        System.out.println(t);
//        t.setId( DAO.save(t));       
//        System.out.println( t );
        
       if (DAO.remove(3)); {
        System.out.println("Fila eliminada correctamente");
    }

        var listado = DAO.list();
        
        listado.forEach( (tar)->System.out.println(tar) );
        
//        System.out.println("\n\nTarea:");
//        Tarea t = DAO.get(2);
//        System.out.println(t);
    }
    
}
