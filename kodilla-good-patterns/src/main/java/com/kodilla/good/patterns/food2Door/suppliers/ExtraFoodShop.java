package com.kodilla.good.patterns.food2Door.suppliers;

import com.kodilla.good.patterns.food2Door.model.Request;

public class ExtraFoodShop implements Supplier {
    @Override
    public boolean process(Request request) {
        System.out.println("\n---SUPLLIER INFO---\nRequest retrieved.");
        System.out.println("Checking store...");
        System.out.println("Checking address...");
        System.out.println("Order will be delivered.");
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}
