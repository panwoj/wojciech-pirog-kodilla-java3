package com.kodilla.good.patterns.challenges.model;

import java.util.Map;
import java.util.stream.Collectors;

public class Order {
    private Map<Integer, BuyRequest> order;

    public Order(Map<Integer, BuyRequest> order) {
        this.order = order;
    }

    public Map<Integer, BuyRequest> getOrder() {
        return order;
    }

    @Override
    public String toString() {
        String orderProducts = order.entrySet().stream()
                .map(entry -> entry.getValue().getProduct().getName())
                .collect(Collectors.joining(", "));
        return "order {" + orderProducts +
                '}';
    }
}
