module com.mycompany.fxmlLogin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.fxmlLogin to javafx.fxml;
    exports com.mycompany.fxmlLogin;
}
