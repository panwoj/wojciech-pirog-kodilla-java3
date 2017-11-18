package com.kodilla.testing;


import com.kodilla.testing.shape.*;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args){

        Shape circle1 = new Circle(1);
        Shape triangle1 = new Triangle(1,2);
        Shape square1 = new Square(2);


        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle1);
        collector.addFigure(triangle1);
        collector.addFigure(square1);

        System.out.println(collector.showFigures());
    }
}
