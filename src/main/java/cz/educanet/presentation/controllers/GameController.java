package cz.educanet.presentation.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.awt.event.ActionEvent;

public class GameController {
    private final int gridSize = 8;
    @FXML
    public GridPane grid;

    public void initialize() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                Button b = new Button();
                b.setPrefWidth(200);
                b.setPrefHeight(200);
                grid.add(b, i+3,j+3);
            }
        }
    }
}
