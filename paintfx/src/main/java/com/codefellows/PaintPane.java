package com.codefellows;


import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.List;

public class PaintPane extends Pane {
    private List<Shape> shapes;

    public PaintPane() {
        setPrefWidth(750.0);
        setPrefHeight(500.0);
        
        BackgroundFill bf = new BackgroundFill(Color.gray(1.0), CornerRadii.EMPTY, Insets.EMPTY);
        setBackground( new Background(bf));
    }

}
