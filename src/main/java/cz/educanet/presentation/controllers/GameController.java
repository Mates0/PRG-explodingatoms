package cz.educanet.presentation.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class GameController {
    private final int gridSize = 8;
    private boolean isRed = true;
    @FXML
    public GridPane grid;

    public void initialize() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                Image bluecircle1 = new Image("file:/C:/Users/maste/IdeaProjects/PRG-explodingatoms/bluecircle1.png");
                Image bluecircle2 = new Image("file:/C:/Users/maste/IdeaProjects/PRG-explodingatoms/bluecircle2.png");
                Image bluecircle3 = new Image("file:/C:/Users/maste/IdeaProjects/PRG-explodingatoms/bluecircle3.png");
                Image redcircle1 = new Image("file:/C:/Users/maste/IdeaProjects/PRG-explodingatoms/redcircle1.png");
                Image redcircle2 = new Image("file:/C:/Users/maste/IdeaProjects/PRG-explodingatoms/redcircle2.png");
                Image redcircle3 = new Image("file:/C:/Users/maste/IdeaProjects/PRG-explodingatoms/redcircle3.png");
                Button btn = new Button();
                btn.setPrefWidth(200);
                btn.setPrefHeight(200);
                btn.setOnMouseClicked(event -> {
                    ImageView view = new ImageView();
                    if (isRed == true) {
                        view.setImage(redcircle1);
                        view.setFitHeight(50);
                        view.setPreserveRatio(true);
                        btn.setGraphic(view);
                        isRed = false;
                    } else {
                        view.setImage(bluecircle1);
                        view.setFitHeight(50);
                        view.setPreserveRatio(true);
                        btn.setGraphic(view);
                        isRed = true;
                    }
                });
                grid.add(btn, i+3,j+3);
            }
        }
    }
}
