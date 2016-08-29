/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcss2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author rockst
 */
public class JavaFXCSS2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        // Scene scene = new Scene(root, 300, 250);
        
        Scene scene = new Scene(new Group(), 300, 250); 
        scene.getStylesheets().add("test.css"); 
        Rectangle rect = new Rectangle(100,100); 
        rect.setLayoutX(50); 
        rect.setLayoutY(50); 
        rect.getStyleClass().add("my-rect"); 
        ((Group)scene.getRoot()).getChildren().add(rect);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
