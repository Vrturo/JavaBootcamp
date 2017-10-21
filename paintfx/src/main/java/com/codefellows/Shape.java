package com.codefellows;

import javafx.scene.paint.Color;

public abstract class Shape {
    protected int x, y;

    protected boolean isFilled;
    protected Color color;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract draw {

    }
}
