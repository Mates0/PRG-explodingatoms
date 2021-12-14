package cz.educanet.presentation.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class GameController {
    @FXML
    public Text text;
    public Button grid;

    @FXML
    public void initialize() {
    }

    public void onGridClicked(MouseEvent mouseEvent) {
        text.setText("blablbal");
    }
}
