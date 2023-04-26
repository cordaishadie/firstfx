package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Instantiayr a VBox root mode
        VBox root = new VBox();
        // Add a label to the root node
        // root.getChildren().add(new Label("Hello World!"));

        // instantiate a default Individual object
        Individual individual = new Individual();

        // Instantiate an IndivdualPane object and add it to the root node
        root.getChildren().add(new IndividualPane(individual));
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}