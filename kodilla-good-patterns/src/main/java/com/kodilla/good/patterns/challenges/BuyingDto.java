package com.kodilla.good.patterns.challenges;

public class BuyingDto {
    private Order order;
    private boolean isBought;

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
