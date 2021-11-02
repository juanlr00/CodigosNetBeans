module com.mycompany.fxmlLogin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;
    requires java.persistence;
    
    opens com.mycompany.fxmlLogin to javafx.fxml, org.hibernate.orm.core, java.sql;
    opens models;
    exports com.mycompany.fxmlLogin;
}
