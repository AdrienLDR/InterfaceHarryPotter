package com.example.rpg_javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage;
    private GameController gameController;
    private Vue vue;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("RPG Harry Potter");

        gameController = new GameController();
        vue = new Vue(primaryStage);

        // Création des scènes pour chaque niveau
        Scene scene0 = vue.creerSceneAvecBouton("Niveau 0", gameController);
        Scene scene1 = vue.creerSceneAvecBouton("Niveau 1", gameController);
        Scene scene2 = vue.creerSceneAvecBouton("Niveau 2", gameController);
        // Ajoutez ici des scènes supplémentaires pour chaque niveau

        // Initialisez les scènes dans le GameController
        gameController.setScene1(scene1);
        gameController.setScene2(scene2);
        // Initialisez les scènes supplémentaires dans le GameController

        // Affiche la scène 0 (niveau 0)
        vue.afficherScene(scene0);
    }
}
