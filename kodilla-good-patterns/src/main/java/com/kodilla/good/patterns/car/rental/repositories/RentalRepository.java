package com.kodilla.good.patterns.car.rental.repositories;

import com.kodilla.good.patterns.car.rental.model.User;
import java.time.LocalDateTime;

public interface RentalRepository {
    void createRental(User user, LocalDateTime carRentFrom, LocalDateTime carRentTo);
}
