package com.kodilla.good.patterns.food2Door.suppliers;

import com.kodilla.good.patterns.food2Door.model.Order;
import com.kodilla.good.patterns.food2Door.model.Request;

public class GlutenFreeShop implements Supplier {
    private static final int fruitPackageQuantity = 3;

    @Override
    public boolean process(Request request) {
        System.out.println("\n---SUPLLIER INFO---");
        if (this.checkStore(request.getOrder())) {
            System.out.println("Calling user to confirm delivery address and date: " + request.getUser().getPhoneNumber());
            System.out.println("Driver is on his way to " + request.getUser().getCity());
            return true;
        } else {
            System.out.println("Sorry, we don't have enough products.");
            return false;
        }

    }

    private boolean checkStore(Order order) {
        return fruitPackageQuantity >= order.getQuantity();
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }
}
