/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestioncomandas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
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
    private TableColumn<Pedido, String> CPedido;
    @FXML
    private TableColumn<Pedido, Integer> CPrecio;
    @FXML
    private TableColumn<Pedido, String> CEstado;
    @FXML
    private Button btnAñadir;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnVer;
    @FXML
    private Label txtPedidos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void añadir(ActionEvent event) {
        Pedido p = new Pedido();
        
//        p.setIdProdructo();
//        p.setNombreProd();
//        p.setEstadoProd();
        p.setFechaProd(Integer.MIN_VALUE);
    }

    @FXML
    private void eliminar(ActionEvent event) {
        
    }

    @FXML
    private void verPedidos(ActionEvent event) {
        
    }

}
