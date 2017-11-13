package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

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

        ArrayList<Shape> testShapeList = new ArrayList<Shape>();
        testShapeList.add(circle1);
        testShapeList.add(triangle1);
        testShapeList.add(square1);

        ShapeCollector collector = new ShapeCollector();
        collector.shapeList.add(circle1);
        collector.shapeList.add(triangle1);
        collector.shapeList.add(square1);
        //When
        collector.showFigures();
        //Then
        int i = 0;
        for (Shape shape : collector.shapeList) {
            Assert.assertEquals(collector.getFigure(i), shape);
            i++;
        }
    }
}
