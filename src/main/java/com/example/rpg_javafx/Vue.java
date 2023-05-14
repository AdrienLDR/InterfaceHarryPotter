package com.example.rpg_javafx;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Vue {
    private Scene scene;
    private Stage stage;

    public Vue(Stage stage) {
        this.stage = stage;
    }

    public void afficherScene(Scene scene) {
        this.scene = scene;
        stage.setScene(scene);
        stage.show();
    }

    public Scene creerSceneAvecBouton(String nomNiveau, GameController gameController) {
        Button bouton = new Button(nomNiveau);
        bouton.setOnAction(event -> gameController.changerNiveau(nomNiveau, stage));
        StackPane layout = new StackPane();
        layout.getChildren().add(bouton);
        return new Scene(layout, 300, 200);
    }
}
