module local.noeantonio.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    requires java.sql;

    opens local.noeantonio.dukemarket.javafx to javafx.fxml;
    opens local.noeantonio.dukemarket.javafx.controller to javafx.fxml;
    
    exports local.noeantonio.dukemarket.javafx;
    exports local.noeantonio.dukemarket.javafx.controller;
            
    
    
    exports local.noeantonio.dukemarket.javafx.DAO;
    exports local.noeantonio.dukemarket.javafx.model;
    exports connection;
    
    requires mysql.connector.java;
}
