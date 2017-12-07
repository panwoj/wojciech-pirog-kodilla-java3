package com.kodilla.good.patterns.challenges.services;

import com.kodilla.good.patterns.challenges.validators.BuyingValidator;
import com.kodilla.good.patterns.challenges.model.Order;
import com.kodilla.good.patterns.challenges.model.Store;

public class BookshopService implements BuyingService {
    @Override
    public boolean buy(Store store, Order order) {
        boolean isProductAvailable = BuyingValidator.checkStore(store, order);
        if (isProductAvailable) {
            System.out.println("All products are available: " + order);
            return true;
        } else {
            System.out.println("Sorry, some products are unavailable. Please check again.");
            return false;
        }
    }
}
