package com.example;

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

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("startScene"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void setRoot(String fxml) {
        try {
            trySetRoot(fxml);
        } catch (IOException e) {
            System.err.println("Hiba! Az FXML fájl betöltése sikertelen!");
            System.err.println(e.getMessage());
        }
    }

    static void trySetRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}