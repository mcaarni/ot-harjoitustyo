package org.openjfx.laskinfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    /**
     *
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/org/openjfx/laskinfx/primary.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/org/openjfx/tyylit/tyyli.css");
        
        stage.setTitle("Laskin");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}