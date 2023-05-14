package com.example.rpg_javafx;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameController {
    private Scene scene0, scene1, scene2; // Ajoutez ici les scènes supplémentaires pour chaque niveau

    public void startLevel0(Stage primaryStage) {
        // Code pour démarrer le niveau 0

        // Transition vers le niveau 1
        primaryStage.setScene(scene1);
    }

    public void startLevel1(Stage primaryStage) {
        // Code pour démarrer le niveau 1

        // Transition vers le niveau 2
        primaryStage.setScene(scene2);
    }

    public void startLevel2(Stage primaryStage) {
        // Code pour démarrer le niveau 2

        // Transition vers le niveau suivant
        // Exemple : primaryStage.setScene(scene3);
    }

    // Ajoutez ici des méthodes pour démarrer les autres niveaux du jeu

    // Ajoutez ici les méthodes pour initialiser les scènes supplémentaires pour chaque niveau
    public void setScene0(Scene scene0) {
        this.scene0 = scene0;
    }

    public void setScene1(Scene scene1) {
        this.scene1 = scene1;
    }

    public void setScene2(Scene scene2) {
        this.scene2 = scene2;
    }
    // Ajoutez ici les méthodes pour initialiser les scènes supplémentaires pour chaque niveau

    public void changerNiveau(String nomNiveau, Stage primaryStage) {
        switch (nomNiveau) {
            case "Niveau 0":
                startLevel0(primaryStage);
                break;
            case "Niveau 1":
                startLevel1(primaryStage);
                break;
            case "Niveau 2":
                startLevel2(primaryStage);
                break;
            // Ajoutez ici les cas pour les autres niveaux du jeu
        }
    }
}
