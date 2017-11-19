package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = new int[20];
        numbers[0]=2;
        numbers[1]=3;
        numbers[2]=4;
        numbers[3]=1;
        numbers[4]=2;
        numbers[5]=2;
        numbers[6]=2;
        numbers[7]=3;
        numbers[8]=4;
        numbers[9]=5;
        numbers[10]=2;
        numbers[11]=3;
        numbers[12]=1;
        numbers[13]=6;
        numbers[14]=5;
        numbers[15]=4;
        numbers[16]=3;
        numbers[17]=2;
        numbers[18]=2;
        numbers[19]=1;

        ArrayOperations arrayOfNumbers = new ArrayOfNumbers();

        //When
        double averageValue = arrayOfNumbers.getAverage(numbers);

        //Then
        Assert.assertEquals(2.85,averageValue,0.01);

    }
}
