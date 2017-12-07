package com.kodilla.good.patterns.challenges.repository;

import com.kodilla.good.patterns.challenges.model.Order;
import java.util.ArrayDeque;

public class BookshopRepository implements BuyingRepository {
    private ArrayDeque<Order> ordersQueue = new ArrayDeque<>();

    public ArrayDeque<Order> getOrdersQueue() {
        return ordersQueue;
    }

    @Override
    public void createPurchasing(Order order) {
        ordersQueue.offer(order);
    }
}
