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

    public String showFigures() {
        int counter = 0;
        String showFiguresText = "";
        for (Shape shape : shapeList) {
            showFiguresText += shape + " ";
            counter++;
        }
        String returnText = counter + " figures: " + showFiguresText;
        return returnText;
    }
}
