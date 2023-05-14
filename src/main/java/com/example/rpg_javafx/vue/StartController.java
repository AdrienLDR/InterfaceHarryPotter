package com.example.rpg_javafx.vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartController {

    @FXML
    private StartView startView;

    @FXML
    public void initialize() {
        startView.welcomeButton.setOnAction(this::onWelcomeAction);
    }


    public void onWelcomeAction(ActionEvent e) {
        startView.welcomeText.setText("Bienvenue à toi, jeune entrepreneur !");
    }
}
