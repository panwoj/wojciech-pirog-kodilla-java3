package com.kodilla.exception.test;

public class SecondChallengeException extends Exception {
    @Override
    public String toString() {
        return "SecondChallengeException: x >= 2 or x < 1 or y = 1,5";
    }
}
