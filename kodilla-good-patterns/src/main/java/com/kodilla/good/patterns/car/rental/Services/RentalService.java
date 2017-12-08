package com.kodilla.good.patterns.car.rental.Services;

import com.kodilla.good.patterns.car.rental.model.User;
import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo);
}
