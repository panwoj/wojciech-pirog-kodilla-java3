package com.kodilla.good.patterns.challenges.model;

public class BuyingDto {
    protected Order order;
    protected boolean isBought;

    public BuyingDto(Order order, boolean isBought) {
        this.order = order;
        this.isBought = isBought;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isBought() {
        return isBought;
    }
}
