package com.kodilla.good.patterns.food2Door.model;

import com.kodilla.good.patterns.food2Door.suppliers.Supplier;

public class Request {
    private User user;
    private Supplier supplier;
    private Order order;

    public Request(User user, Supplier supplier, Order order) {
        this.user = user;
        this.supplier = supplier;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Order getOrder() {
        return order;
    }
}
