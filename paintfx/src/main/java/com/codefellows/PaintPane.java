package com.codefellows;


import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaintPane extends Pane {
    private List<Shape> shapes = new ArrayList<>();
    private static Point2D initialPoint;
    private static Point2D  finalPoint;
    private Canvas canvas;

    public PaintPane() {
        setPrefWidth(750.0);
        setPrefHeight(500.0);

        BackgroundFill bf = new BackgroundFill(Color.gray(1.0), CornerRadii.EMPTY, Insets.EMPTY);
        setBackground(new Background(bf));

        setOnMousePressed(e -> {
            new Point2D(e.getX(), e.getY());
            addShape(initialPoint);
        });

        setOnMouseDragged(e -> {
            new Point2D(e.getX(), e.getY());
            if (shapes.size() > 0) {
                shapes.remove(shapes.size() - 1);
            }

            addShape(finalPoint);
            redraw();
        });

        canvas = new Canvas(750, 500);
        getChildren().add(canvas);
    }

    private void addShape(Point2D finalPoint) {
        Shape shape = null;

        double dx = (int) (finalPoint.getX() - initialPoint.getX());
        double dy = (int) (finalPoint.getY() - initialPoint.getY());

        if (AppState.getShapeType() == ShapeType.LINE) {
            shape = new Line((int) (initialPoint.getX(), initialPoint.getY()));
        }
        shape.setColor(AppState.getColor());
        shapes.add(shape);
    }

    private void redraw() {
        canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (Shape s : shapes) {
            s.draw(canvas.getGraphicsContext2D());
        }
    }

//    private static void handleMouseClick(MouseEvent e) {
//        if (e.getEventType() == MouseEvent.MOUSE_PRESSED) {
//            initialPoint = new Point2D(e.getX(), e.getY());
//        } else if (e.getEventType() == MouseEvent.MOUSE_DRAGGED) {
//            Point2D finalPoint = new Point2D(e.getX(), e.getY());
//            addShape(finalPoint);
//            redraw();
//        }
//    }

}
