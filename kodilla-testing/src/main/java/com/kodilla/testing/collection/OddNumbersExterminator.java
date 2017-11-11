package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbersWithoutOdd = new ArrayList<Integer>();
        for (Integer temporaryValue : numbers) {
            if (notOddOrZero(temporaryValue)) {
                numbersWithoutOdd.add(temporaryValue);
            }
        }
        return numbersWithoutOdd;
    }

    private boolean notOddOrZero(Integer value) {
        return (value % 2 == 0 && value != 0);
    }
}
