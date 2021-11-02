/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernatehello;

import java.util.ArrayList;
import models.Alumno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 *
 * @author JuanLamasRubio
 */
public class PrincipalHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        
        Alumno a = new Alumno(0L,"Christopher");
        
        Session s = sf.openSession();
        
//        Transaction t = s.beginTransaction();
//        s.save(a);      
//        t.commit();
//        
//        Alumno a1 = s.load(Alumno.class, 3L);
//        System.out.println(a1);
//        
//        s.beginTransaction();
//        s.remove(a1);
//        t.commit();
        
        Query total = s.createQuery("SELECT COUNT (a.id) FROM Alumno afg", long.class);
        System.out.println(total.list().get(0));
            
        Query q = s.createQuery("FROM Alumno a WHERE a.id<10", Alumno.class);
        ArrayList<Alumno> resultado = (ArrayList<Alumno>) q.list();
        
        resultado.forEach( (aa)->System.out.println(aa));
    }
    
}
