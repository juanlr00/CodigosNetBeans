/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestioncomandas;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Pedido;

/**
 * FXML Controller class
 *
 * @author JuanLamasRubio
 */
public class PrimaryController implements Initializable {


    @FXML
    private TableColumn<Pedido, String> CCiclo;
    @FXML
    private TableColumn<Pedido, String> CAlumno;
    @FXML
    private TableColumn<Pedido, String> nombreProd;
    @FXML
    private TableColumn<Pedido, Integer> precioProd; 
    @FXML
    private TableColumn<Pedido, String> estadoProd;
    @FXML
    private TableView<String> idTabla;
    
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
                  //Para actualizar pedidos
//        ObservableList<Pedido> pedido = FXCollections.observableArrayList();
//        idTabla.setItems(Pedido);
        
         CCiclo.setCellValueFactory(new PropertyValueFactory<>("ciclo"));
         CAlumno.setCellValueFactory( new PropertyValueFactory<>("alumno"));
         nombreProd.setCellValueFactory( new PropertyValueFactory<>("nombreProd"));
         precioProd.setCellValueFactory( new PropertyValueFactory<>("precioProd"));
         estadoProd.setCellValueFactory(new PropertyValueFactory<>("estadoProd"));
    }
    
    public static ArrayList <Pedido> listarComandasHoy() {
        
        return null;
        
    }
    
    public static ArrayList <Pedido> pedidosPendientes() {
        
        return null;
        
    }
        
      
        
   
         
         
         
         
         
         
           
    }  

