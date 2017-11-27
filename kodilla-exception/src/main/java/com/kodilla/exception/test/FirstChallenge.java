package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("aaa");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("!!!Error: " + e + "!!!");
        } finally {
            System.out.println("Thanks for using our program.");
        }

        try {
            double result2 = firstChallenge.divide(6, 2);
            System.out.println(result2);
        } catch (ArithmeticException e) {
            System.out.println("!!!Error: " + e + "!!!");
        } finally {
            System.out.println("Thanks for using our program.");
        }
    }
}
