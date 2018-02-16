package com.kodilla.patterns2.decorator.pizza;


import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;


public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza Margaritha", description);
    }

    @Test
    public void testBasicPizzaOrderWithExtrasGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraMeatDecorator(theOrder);
        theOrder = new ExtraVegetableDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(26), cost);
    }

    @Test
    public void testBasicPizzaOrderWithExtrasGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraMeatDecorator(theOrder);
        theOrder = new ExtraVegetableDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza Margaritha + extra Cheese + extra meat + extra vegetable"
                , description);
    }
}
