package com.kodilla.good.patterns.food2Door.shopServices;

import com.kodilla.good.patterns.food2Door.model.Request;

public class LittleShopService implements ShopService {

    @Override
    public boolean checkOrder(Request request) {
        System.out.println("\nChecking order for " + request.getUser().getName() + " " + request.getUser().getSurname() + "...");
        System.out.println("Order: " + request.getOrder().getProductName() +
                ", quantity: " + request.getOrder().getQuantity() + ", price: " + request.getOrder().getPrice());
        System.out.println("Supplier: " + request.getSupplier());
        System.out.println("Order correct.");
        return true;
    }
}
