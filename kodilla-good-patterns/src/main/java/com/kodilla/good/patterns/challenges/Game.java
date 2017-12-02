package com.kodilla.good.patterns.challenges;

public class Game extends Product{
    public Game(String name, double price, long deliveryDays) {
        super(name, price, deliveryDays);
    }

    @Override
    public String toString() {
        return "Game";
    }
}
