package com.mycompany.javafxhello;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 * MIRAR PARA EXAMEN
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
       Label label = new Label("Este elemento es una etiqueta");
       var label2 = new Label("Segundo label");
       
       
       VBox caja = new VBox(label, label2 );
       
       var label3 = new Label("Tercer label");
       caja.getChildren().add(label3);
       
       label.setText("Texto cambiado a posteriori");
       label.setStyle("-fx-font-size:30px; -fx-text-fill:red; -fx-margin:30px");
       
       Button b1 = new Button("Esto es un boton");
       caja.getChildren().add(b1);
       
       var texto = new TextField("...");
       caja.getChildren().add(texto);
       
       var list = new ListView<String>();
       
       ObservableList<String> items = FXCollections.observableArrayList();
       items.addAll("Primero","Segundo","Tercero");
       items.remove(0);
       
       list.setItems(items);
       caja.getChildren().add(list);
       
//        b1.setOnAction(new EventHandler <ActionEvent>(){
//           @Override
//           public void handle(ActionEvent e) {
//               items.add(texto.getText() );

       b1.setOnAction((ActionEvent e) -> {
           items.add(texto.getText() );
           System.out.println( texto.getText() );
       });
       
       
       Scene escena = new Scene(caja,300,300); 
       
       stage.setScene(escena);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}