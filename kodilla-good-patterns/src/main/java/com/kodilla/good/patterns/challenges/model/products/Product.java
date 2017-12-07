package com.kodilla.good.patterns.challenges.model.products;

public abstract class Product {
    private String name;
    private double price;
    private long deliveryDays;

    public Product(String name, double price, long deliveryDays) {
        this.name = name;
        this.price = price;
        this.deliveryDays = deliveryDays;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getDeliveryDays() {
        return deliveryDays;
    }
}
