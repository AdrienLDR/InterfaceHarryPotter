package com.example.rpg_javafx.vue;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class StartView extends VBox {

    public TextField textField;
    public Label welcomeText;
    public Button welcomeButton;

    public StartView() {
        textField = new TextField("What is your name");
        welcomeText = new Label("Welcome");
        welcomeButton = new Button("Click me");

        welcomeText.getStyleClass().add("label");
        welcomeButton.getStyleClass().add("btn");

        this.getChildren().addAll(textField, welcomeText, welcomeButton);
    }
}
