package com.kodilla.good.patterns.car.rental.repositories;

import com.kodilla.good.patterns.car.rental.model.User;
import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    @Override
    public void createRental(User user, LocalDateTime carRentFrom, LocalDateTime carRentTo) {
        System.out.println("Repository created.");
    }
}
