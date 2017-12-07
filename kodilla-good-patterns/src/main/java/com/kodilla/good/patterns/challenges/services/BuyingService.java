package com.kodilla.good.patterns.challenges.services;

import com.kodilla.good.patterns.challenges.model.Order;
import com.kodilla.good.patterns.challenges.model.Store;

public interface BuyingService {
     boolean buy(Store store, Order order);
}
