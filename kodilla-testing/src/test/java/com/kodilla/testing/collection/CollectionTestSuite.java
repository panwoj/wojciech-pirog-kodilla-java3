package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() { System.out.println("Test case: begin");}
    @After
    public void after() { System.out.println("Test case: end");}
    @Test
    public void testOddNumbersExterminatorEmptyList () {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing ArrayList " + result);
        //Then
        Assert.assertTrue(result.isEmpty());

    }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        ArrayList<Integer> theList = new ArrayList<Integer>();
        theList.add(0);
        theList.add(1);
        theList.add(2);
        theList.add(3);
        theList.add(4);
        theList.add(5);
        theList.add(6);
        theList.add(32);
        theList.add(155);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(theList);
        System.out.println("Testing ArrayList " + result);
        //Then
        for (Integer value : result) {
            Assert.assertTrue(value % 2 == 0 && value != 0);
        }
    }
}
