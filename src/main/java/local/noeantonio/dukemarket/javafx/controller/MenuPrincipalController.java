/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package local.noeantonio.dukemarket.javafx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import local.noeantonio.dukemarket.javafx.App;

/**
 * FXML Controller class
 *
 * @author qualifica
 */
public class MenuPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Vincula as colunas da Tableview à classe produto.
       
    }
    
    @FXML
    public void btnProdutosClick() throws IOException {
        try{
            FXMLLoader fxmlloader = new FXMLLoader();
            fxmlloader.setLocation(App.class.getResource("scrProdutos.fxml"));
            /**
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlloader.load(), 900, 400);
            Stage stage = new Stage();
            
            stage.setTitle("CRUD Produtos");
            stage.setScene(scene);
            stage.show();
        }catch(IOException e){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE,"Failed to create new Window scrProdutos.", e);
        }
        System.out.println("Botao Produtos Clickado! ");
    }
}
