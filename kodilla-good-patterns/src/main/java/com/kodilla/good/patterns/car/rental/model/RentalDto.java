package com.kodilla.good.patterns.car.rental.model;


public class RentalDto {
    public User user;
    public boolean isRented;

    public RentalDto(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

}
