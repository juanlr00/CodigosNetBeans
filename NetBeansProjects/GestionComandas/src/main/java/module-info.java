module com.mycompany.gestioncomandas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.gestioncomandas to javafx.fxml;
    exports com.mycompany.gestioncomandas;
}
