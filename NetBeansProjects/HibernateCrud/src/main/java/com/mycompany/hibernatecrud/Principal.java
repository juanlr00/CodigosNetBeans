/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernatecrud;

import models.Pedido;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author juanl
 */
public class Principal {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        
        Pedido p = new Pedido(0L, "Ensalada");
        
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        s.save(p);
        t.commit();
        
    }
}
