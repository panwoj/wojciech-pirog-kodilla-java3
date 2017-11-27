package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2.5, 1);
            System.out.println(result);
        } catch (SecondChallengeException s){
            System.out.println(s);
        }

        try {
            String result = secondChallenge.probablyIWillThrowException(1.9, 1);
            System.out.println(result);
        } catch (SecondChallengeException s){
            System.out.println(s);
        }
    }
}
