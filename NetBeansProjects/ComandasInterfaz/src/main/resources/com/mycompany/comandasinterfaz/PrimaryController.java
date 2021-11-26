/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandasinterfaz;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Carta;
/**
 * FXML Controller class
 *
 * @author JuanLamasRubio
 */
public class PrimaryController implements Initializable {


    @FXML
    private TableView<?> tvTabla;
    @FXML
    private TableColumn<Carta, String> CCiclo;
    @FXML
    private TableColumn<Carta, String> CAlumno;
    @FXML
    private TableColumn<Carta, String> CTipo;
    @FXML
    private TableColumn<Carta, String> CProducto;
    @FXML
    private TableColumn<Carta, Integer> CPrecio;
    @FXML
    private TableColumn<Carta, String> CEstado;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CCiclo.setCellValueFactory(new PropertyValueFactory<>("ciclo"));
         CAlumno.setCellValueFactory(new PropertyValueFactory<>("alumno"));
          CTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
           CProducto.setCellValueFactory(new PropertyValueFactory<>("producto"));
            CPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
              CEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
    }    
    
}
