package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Collection;

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
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing ArrayList " + result);
        //Then
        Assert.assertEquals(new ArrayList<Integer>(), result);

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
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(theList);
        System.out.println("Testing ArrayList " + result);
        //Then
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(2);
        testList.add(4);
        testList.add(6);
        Assert.assertEquals(testList, result);
    }
}
