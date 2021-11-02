/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploswing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author JuanLamasRubio
 */
public class Ventana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JFrame ventana generica o estandar
       JFrame ventana = new JFrame();
       
       ventana.setSize(400, 400);
       ventana.setTitle("Hola a 2DAM");
       
       ventana.setLayout ( new BorderLayout() );
       
       JLabel label = new JLabel("...");
       //label.setHorizontalAlignment((int) Component.CENTER_ALIGNMENT);
       //ventana.add(label,BorderLayout.CENTER);
       
       Container arriba = new Container();
       arriba.setLayout( new FlowLayout() );
       
       JTextField texto = new JTextField(15);
       arriba.add(texto);
       
       JList lista = new JList();
       ventana.add(lista,BorderLayout.CENTER);
       
       DefaultListModel modelo = new DefaultListModel();
       lista.setModel(modelo);
       
       modelo.add(0, "Carlos");
       modelo.add(0, "David");
       modelo.add(0, "Canario");
       
       
       
       JButton boton2 = new JButton("añadir");
       arriba.add(boton2);
       
       
       ActionListener SegundoBoton = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println(texto.getText());
               modelo.addElement(texto.getText());
               System.out.println(e);
               
               texto.setText((String) lista.getSelectedValue());
               //label.setText(texto.getText());
           }
       };
       boton2.addActionListener(SegundoBoton);
       
       
       JButton boton = new JButton();
       boton.setText("Salir");
       
       //lAMBDA ---> ActionListener salir = (ActionEvent e) -> {
       ActionListener salir = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       };
       boton.addActionListener(salir);
       
       ventana.add(boton,BorderLayout.PAGE_END);
       ventana.add(arriba,BorderLayout.PAGE_START);
       
       
       ventana.setVisible(true);
       
       
       ArrayList<String> a = new ArrayList<String>();
       a.add("Luis");
       a.add("Pablo");
       a.add("Juan");
       a.add("Dani");
       
      
       modelo.addAll(a);
       
       a.forEach( (String s)->{
           System.out.println(s);
       });
    }
    
}
