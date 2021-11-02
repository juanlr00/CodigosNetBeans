module com.mycompany.schoolboyt {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;
    requires java.persistence;
    requires static lombok;
    

    opens com.mycompany.fxmllogin to javafx.fxml, org.hibernate.orm.core, java.sql;
    opens models;
    exports com.mycompany.schoolboyt;
    
}
