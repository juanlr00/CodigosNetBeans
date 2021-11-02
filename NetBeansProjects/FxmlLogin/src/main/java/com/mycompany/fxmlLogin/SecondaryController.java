package com.mycompany.fxmlLogin;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import models.Tarea;
import models.Usuario;
import org.hibernate.Session;

public class SecondaryController implements Initializable {

    @FXML
    private Label Label1;
    @FXML
    private TableView<Tarea> Tabla;
    @FXML
    private TableColumn<Tarea, Long> ColId;
    @FXML
    private TableColumn<Tarea, String> ColTarea;
    @FXML
    private TableColumn<Tarea, String> ColPrioridad;
    @FXML
    private Label Label2;
    @FXML
    private Button BtnSalir;
    @FXML
    private Button btnNueva;
    @FXML
    private Menu btnAcerca;
    @FXML
    private Label hora;

    @FXML
    private void switchToPrimary() throws IOException {
        SessionData.setUsuarioActual(null);
        App.setRoot("primary");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<Tarea> contenido = FXCollections.observableArrayList();
        Tabla.setItems(contenido);
        
        
        ColId.setCellValueFactory(new PropertyValueFactory<>("id"));
        ColTarea.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        ColPrioridad.setCellValueFactory(new PropertyValueFactory<>("prioridad"));
         
//         firstNameCol.setCellValueFactory(new Callback<CellDataFeatures<Person, String>, ObservableValue<String>>() {
//     public ObservableValue<String> call(CellDataFeatures<Person, String> p) {
//         // p.getValue() returns the Person instance for a particular TableView row
//         return p.getValue().firstNameProperty();
//     }
// });

        
        //contenido.add( new Tarea (0L,"Hacer cosas","alta", new Usuario()));
        
       // contenido.clear(); Para borrar
       
       Session s = HibernateUtil.getSessionFactory().openSession();
       
       Usuario u = s.load( Usuario.class, SessionData.getUsuarioActual().getId());
       SessionData.setUsuarioActual(u);
       
       contenido.addAll( u.getTareas());
       
       Label1.setText( u.getUsername() + " " + u.getEmail());
       Label2.setText( u.getTareas().size()+ " tareas");
       
       Timer timer = new Timer();
       TimerTask timerTask = new TimerTask() {
           
          
            @Override
            public void run() {
                Date fecha = new Date();
                hora.setText( fecha.toString());
            }
        }; 
       timer.scheduleAtFixedRate(timerTask, 0, 1000);
       {
        
    }
    }

    @FXML
    private void seleccionar(MouseEvent event) {
        Tarea t = Tabla.getSelectionModel().getSelectedItem();
        if (t!=null) {
           /* Alert alert = new Alert (Alert.AlertType.INFORMATION);
            alert.setHeaderText( t.getNombre());
            alert.setContentText(t.getPrioridad());
            alert.showAndWait();*/
           SessionData.setTareaActual(t);
            try {
                App.setRoot("editorTarea");
            } catch (IOException ex) {
                Logger.getLogger(SecondaryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void nueva(ActionEvent event) {
        
        SessionData.setTareaActual(null);
        try {
            App.setRoot("editorTarea");
        } catch (IOException ex) {
            Logger.getLogger(SecondaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void acerca(ActionEvent event) {
        
        Alert info = new Alert( Alert.AlertType.INFORMATION);
        info.setContentText("Programa de locos");
        info.showAndWait();
    }
}