package com.kodilla.good.patterns.food2Door.model;

public class BuyingDto {
    private User user;
    private boolean isDelivered;

    public BuyingDto(User user, boolean isDelivered) {
        this.user = user;
        this.isDelivered = isDelivered;
    }

    public User getUser() {
        return user;
    }
}
