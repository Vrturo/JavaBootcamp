package com.codefellows;

import java.awt.*;

public class AppState {
    private static Color color = Color.BLACK;
    private static ShapeType shapeType = ShapeType.LINE;

    public static ShapeType getShapeType() {
        return shapeType;
    }

    public static Color getColor() {
        return color;
    }

    public static void setShapeType(ShapeType shapeType) {
        AppState.shapeType = shapeType;
    }
}
