package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        //SimpleUser test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator test
        Calculator calc = new Calculator();

        int addResult = calc.add(8,5);
        int substractResult = calc.subtract(5,8);

        if (addResult==13) {
            System.out.println("add test OK");
        } else {
            System.out.println("add test error!");
        }

        if (substractResult == -3) {
            System.out.println("subtract test OK");
        } else {
            System.out.println("subtract test error!");
        }
    }
}
