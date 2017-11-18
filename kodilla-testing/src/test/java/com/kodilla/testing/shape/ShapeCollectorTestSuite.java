package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private static int counter = 0;
    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("Staring tests.");
    }
    @AfterClass
    public static void afterAllTest() {
        System.out.println("Testing ended.");
    }
    @Before
    public void beforeTest() {
        counter++;
        System.out.println("Starting test #" + counter);
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape circle1 = new Circle(1);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle1);
        //When
        Shape retrivedShape = collector.getFigure(0);
        //Then
        Assert.assertEquals(circle1, retrivedShape);
    }
    @Test
    public void testAddFigure() {
        //Given
        Shape circle1 = new Circle(1);
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(circle1);
        //Then
        Assert.assertEquals(1, collector.shapeList.size());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        Shape circle1 = new Circle(1);
        ShapeCollector collector = new ShapeCollector();
        collector.shapeList.add(circle1);
        //When
        collector.removeFigure(circle1);
        //Then
        Assert.assertEquals(0, collector.shapeList.size());
    }
    @Test
    public void testShowFigures() {
        //Given
        Shape circle1 = new Circle(1);
        Shape triangle1 = new Triangle(1,2);
        Shape square1 = new Square(2);

        List<Shape> testShapeList = new ArrayList<Shape>();
        testShapeList.add(circle1);
        testShapeList.add(triangle1);
        testShapeList.add(square1);

        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle1);
        collector.addFigure(triangle1);
        collector.addFigure(square1);
        //When
        String completedText = collector.showFigures();
        //Then
        Assert.assertEquals(testShapeList.toString(),completedText);

    }
}
