package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public void showFigures() {
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }
}
