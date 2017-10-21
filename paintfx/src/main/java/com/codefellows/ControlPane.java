package com.codefellows;

import com.sun.tools.javac.code.Attribute;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ControlPane extends VBox {
    private ArrayList<Button> shapeButtons = new ArrayList<>();
    private ShapeType shapeType = ShapeType.LINE;
    private Button quitButton = new Button("Quit");

    public ControlPane() {
        shapeButtons.add(new Button("Line"));
        shapeButtons.add(new Button("Circle"));
        shapeButtons.add(new Button("Pen"));
        shapeButtons.add(new Button("Rectangle"));

        for (Button b : shapeButtons) {
            getChildren().add(b);
            b.setOnAction(e -> {
                String buttonText = b.getText().toUpperCase();
                shapeType = ShapeType.valueOf(buttonText);

                System.out.println(AppState.getShapeType());
            });
        }
        getChildren().add(quitButton);

        setPrefWidth(400);

         quitButton.setOnAction(e -> {
            Platform.exit();
            System.exit(0);
         });
    }

//    public VBox addVbox() {
//        VBox vbox = new VBox();
//        Text title = new Text("Data");
//
//        vbox.getChildren().add(title);
//        Hyperlink options[] = new Hyperlink[]{
//                new Hyperlink("One"),
//                new Hyperlink("Two"),
//                new Hyperlink("Three"),
//                new Hyperlink("Four")};
//
//        return vbox;
//    }
}
