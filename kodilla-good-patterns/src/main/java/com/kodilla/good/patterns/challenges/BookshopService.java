package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookshopService implements BuyingService {
    @Override
    public boolean buy(Store store, Order order) {
        boolean productsAvailability = BuyingValidator.checkStore(store, order);
        if (productsAvailability) {
            System.out.println("All products are available: " + order);
            return true;
        } else {
            System.out.println("Sorry, some products are unavailable. Please check again.");
            return false;
        }
    }
}
