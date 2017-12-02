package com.kodilla.good.patterns.challenges;

import java.util.ArrayDeque;
import java.util.Queue;

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
