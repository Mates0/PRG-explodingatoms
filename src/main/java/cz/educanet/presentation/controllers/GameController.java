package cz.educanet.presentation.controllers;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class GameController {
    @FXML
    public Text text;

    @FXML
    public void initialize() {
        text.setText("test");
    }
}
