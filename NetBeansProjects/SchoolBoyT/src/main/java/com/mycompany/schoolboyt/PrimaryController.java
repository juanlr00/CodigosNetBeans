package com.mycompany.schoolboyt;

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
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * FXML Controller class
 *
 * @author DanielMenaRodríguez
 */
public class PrimaryController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnAceptar;
    @FXML
    private Button btnCancelar;
    @FXML
    private Hyperlink link;
    @FXML
    private CheckBox mantenerAbierta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("FROM Usuario"); //Igual que la clase
        q.list().forEach( (e)->System.out.println(e) );
    }    

    @FXML
    private void aceptar(ActionEvent event) {
        System.out.println("Botón aceptar");
        System.out.println(txtUsuario.getText());
        System.out.println(txtPassword.getText()); //Cosas de accedos de datos, comprobar
        
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("FROM Usuario u WHERE u.username=:name AND u.password=:pass");
        //Select * From Usuario WHERE username LIKE "us" AND password LIKE "fsdsad"
        q.setParameter("name", txtUsuario.getText());
        q.setParameter("pass", txtPassword.getText());
        
        q.list().forEach( (a)->System.out.println(a) );
        
        if(q.list().size()>0){
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Aceptar");
            alerta.setHeaderText("Nuevo Login");
            alerta.setContentText("El usuario "+txtUsuario.getText() +" con contraseña " +txtPassword.getText()+ " ha iniciado sesión.");
            alerta.showAndWait(); // Apuntes hay cosa
            
            try {
                App.setRoot("secondary"); //Carga el el fxml y lo carga a la ventana actuAL
            } catch (IOException ex) {
                Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Usuario no válido");
            alerta.setContentText("El usuario "+txtUsuario.getText() 
                                    + " no existe " );
            alerta.showAndWait(); // Apuntes hay cosa
            
            
        }
        
     /* 
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Aceptar");
        alerta.setHeaderText("Nuevo Login");
        alerta.setContentText("El usuario "+txtUsuario.getText() +" con contraseña " +txtPassword.getText()+ " ha iniciado sesión.");
        alerta.showAndWait(); // Apuntes hay cosa
       }else{
           
       } */
       
    }

    @FXML
    private void cancelar(ActionEvent event) {
        System.out.println("Boton Cancelar");
        
    }

    @FXML
    private void recordar(ActionEvent event) {
        System.out.println("Enlace");
    }

    @FXML
    private void mantener(ActionEvent event) {
        System.out.println("Mantener abierta la sesion");
        System.out.println(mantenerAbierta.isSelected()); //Si activo o no
    }
    
//    @FXML
//    private void salir(ActionEvent event) {
//        tarea_actual=null;
//        Stage stage = (Stage) txt
//        System.out.println("Boton Cancelar");
//        
//    }
}
