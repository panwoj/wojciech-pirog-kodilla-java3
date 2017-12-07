package com.kodilla.good.patterns.food2Door.suppliers;

import com.kodilla.good.patterns.food2Door.model.Request;
import com.kodilla.good.patterns.food2Door.model.User;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {
    private Map<String, Boolean> deliverPossibility = new HashMap<>();

    public HealthyShop() {
        deliverPossibility.put("Kraków", true);
        deliverPossibility.put("Katowice", true);
        deliverPossibility.put("Warszawa", true);
        deliverPossibility.put("Lublin", true);
        deliverPossibility.put("Kielce", true);
        deliverPossibility.put("Szczecin", false);
        deliverPossibility.put("Gdańsk", false);
        deliverPossibility.put("Wrocław", false);
        deliverPossibility.put("Rzeszów", false);
    }

    private boolean checkDeliverPossibility(User user) {
        return deliverPossibility.get(user.getCity());
    }

    @Override
    public boolean process(Request request) {
        System.out.println("\n---SUPLLIER INFO---");
        boolean deliveryPossibility = this.checkDeliverPossibility(request.getUser());
        if (deliveryPossibility) {
            System.out.println("We could order " + request.getOrder().getProductName());
            return true;
        } else {
            System.out.println("Sorry. " + request.getUser().getCity() + " is out of our coverage.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}
