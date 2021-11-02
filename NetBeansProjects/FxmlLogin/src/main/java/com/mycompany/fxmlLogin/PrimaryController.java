/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fxmlLogin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.Tarea;
import models.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
/**
 * FXML Controller class
 *
 * @author JuanLamasRubio
 */
public class PrimaryController implements Initializable {


    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContraseña;
    @FXML
    private Button btnAceptar;
    @FXML
    private Button btnCancelar;
    @FXML
    private Hyperlink LinkContraseña;
    @FXML
    private CheckBox mantenerAbierta;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Session s = HibernateUtil.getSessionFactory().openSession();
        
        Query q = s.createQuery("FROM Usuario");
        q.list().forEach( (e) ->System.out.println(e));
        
        Query qq = s.createQuery("FROM Tarea");
        q.list().forEach( (e) ->System.out.println(e));
        
//        Usuario u = new Usuario();
//        u.setUsername("Franc");
//        u.setPassword("0000");
//        u.setEmail("juan@hotmail.com");        
//        
//        Transaction tr = s.beginTransaction();
//        s.save(u);
//        tr.commit();
        
//      Tarea t = new Tarea();
//      t.setNombre("Estudiar");
//      t.setPrioridad("Media");
//      t.setUsuario ((Usuario) q.list().get(0));
//      
//       Transaction tr = s.beginTransaction();
//       s.save(t);
//       tr.commit();
       
    }    
    
    @FXML
    private void Aceptar(ActionEvent event) {
        System.out.println("Botón aceptar");
        System.out.println(txtUsuario.getText());
        System.out.println(txtContraseña.getText());
        
         Session s = HibernateUtil.getSessionFactory().openSession();
         Query q = s.createQuery("FROM Usuario u WHERE  u.username=:username AND u.password=:pass ");
         q.setParameter("username", txtUsuario.getText());
         q.setParameter("pass", txtContraseña.getText());
         
         
    if(q.list().size()>0) {
        
        Usuario u = (Usuario) q.list().get(0);
        
        System.out.println( u );
        System.out.println(u.getTareas() );
        
        
       Alert alerta = new Alert(Alert.AlertType.INFORMATION);
       alerta.setTitle("Aceptar");
       alerta.setHeaderText("Nuevo Login");
       alerta.setContentText("El usuario "+txtUsuario.getText()
               +" con contraseña " +txtContraseña.getText()+ " ha iniciado sesión.");
       alerta.showAndWait(); // Apuntes hay cosa
       
       SessionData.setUsuarioActual(u);
        
           try {
               App.setRoot("Secondary");
           } catch (IOException ex) {
               Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
           }
           
    }else {
           
           Alert alerta = new Alert(Alert.AlertType.ERROR);
       alerta.setTitle("Error");
       alerta.setHeaderText("Usuario no existe");
       alerta.setContentText("El usuario "+txtUsuario.getText()
               +" Usuario no existe " );
       alerta.showAndWait(); // Apuntes hay cosa
       }
 
         }


    @FXML
    private void Cancelar(ActionEvent event) {
        System.out.println("Botón cancelar");
        
    }

    @FXML
    private void Recordar(ActionEvent event) {
        System.out.println("Enlace");
    }

    @FXML
    private void Mantener(ActionEvent event) {
        System.out.println("Mantener abierta la sesión");
        System.out.println(mantenerAbierta.isSelected());
    }

}
