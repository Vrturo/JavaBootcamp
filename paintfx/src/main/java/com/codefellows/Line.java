package com.codefellows;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class Line extends Shape {
    private int width, int height;

    public Line (int x, int y, int width, int height) {
        super(x, y);

        this.width;
        this.height;
    }

    public void draw(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(AppState.getColor());
        gc.moveTo(x, y);
        gc.lineTo(x+width-1, y+height-1);
    }
}
