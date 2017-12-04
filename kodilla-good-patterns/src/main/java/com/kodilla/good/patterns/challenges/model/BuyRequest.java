package com.kodilla.good.patterns.challenges.model;

import com.kodilla.good.patterns.challenges.model.products.Product;
import java.time.LocalDateTime;

public class BuyRequest {
    private User user;
    private Product product;
    private int quantity;
    private LocalDateTime requestDate;
    private LocalDateTime deliveryDate;

    public BuyRequest(User user, Product product, int quantity, LocalDateTime requestDate) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.requestDate = requestDate;
        this.deliveryDate = requestDate.plusDays(product.getDeliveryDays());
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }
}
