package com.kodilla.good.patterns.challenges;

public class Record extends Product {
    public Record(String name, double price, long deliveryDays) {
        super(name, price, deliveryDays);
    }

    @Override
    public String toString() {
        return "Record";
    }
}
