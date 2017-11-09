package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbersWithoutOdd = new ArrayList<Integer>();
        int temporaryValue = 0;
        for (int i=0; i < numbers.size(); i++) {
            temporaryValue = numbers.get(i);
            if (temporaryValue % 2 == 0 && temporaryValue != 0) {
                numbersWithoutOdd.add(temporaryValue);
            }
        }
        return numbersWithoutOdd;
    }
}
