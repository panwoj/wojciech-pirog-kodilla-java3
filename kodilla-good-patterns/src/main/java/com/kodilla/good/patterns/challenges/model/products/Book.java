package com.kodilla.good.patterns.challenges.model.products;


public class Book extends Product {
    public Book(String name, double price, long deliveryDays) {
        super(name, price, deliveryDays);
    }

    @Override
    public String toString() {
        return "Book";
    }
}
