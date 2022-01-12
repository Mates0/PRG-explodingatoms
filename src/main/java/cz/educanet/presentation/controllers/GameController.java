package cz.educanet.presentation.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class GameController {
    private final int gridSize = 8;
    @FXML
    public GridPane grid;

    public void initialize() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                Button btn = new Button();
                btn.setPrefWidth(200);
                btn.setPrefHeight(200);
                btn.setOnMouseClicked(event -> {
                    btn.setStyle("-fx-background-color: green");
                });
                grid.add(btn, i+3,j+3);
            }
        }
    }
}
