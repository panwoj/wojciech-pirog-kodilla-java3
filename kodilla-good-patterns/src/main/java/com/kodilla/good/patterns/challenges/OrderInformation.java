package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderInformation {

    private Order order;

    public OrderInformation(Order order) {
        this.order = order;
    }

    public int getQuantityAmount() {
        int amount = order.getOrder().entrySet().stream()
                .map(entry -> entry.getValue())
                .map(buyRequest -> buyRequest.getQuantity())
                .reduce(0, (sum, current) -> sum += current);
        return amount;
    }

    public double getMoneyAmount() {
        double amount =0;

        for(Map.Entry<Integer, BuyRequest> entry : order.getOrder().entrySet()) {
            amount += entry.getValue().getQuantity() * entry.getValue().getProduct().getPrice();
        }
        return amount;
    }

    public LocalDate getPredictedDeliveryDate() {
        List<LocalDateTime> deliveryDatesList = order.getOrder().entrySet().stream()
            .map(entry -> entry.getValue().getDeliveryDate())
            .collect(Collectors.toList());
        LocalDateTime date = Collections.max(deliveryDatesList);
        LocalDate deliveryDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        return deliveryDate;
    }

    public String getUser() {
        return order.getOrder().get(1).getUser().toString();
    }

    public Order getOrder() {
        return order;
    }
}
