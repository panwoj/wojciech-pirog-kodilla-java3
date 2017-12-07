package com.kodilla.good.patterns.challenges.services;

import com.kodilla.good.patterns.challenges.model.BuyingDto;
import com.kodilla.good.patterns.challenges.model.Order;
import com.kodilla.good.patterns.challenges.model.OrderInformation;
import com.kodilla.good.patterns.challenges.model.Store;
import com.kodilla.good.patterns.challenges.repository.BuyingRepository;
import com.kodilla.good.patterns.challenges.send.InformationService;

public class ProductOrderService {
    private InformationService informationService;
    private BuyingService buyingService;
    private BuyingRepository buyingRepository;

    public ProductOrderService(InformationService informationService,
                               BuyingService buyingService, BuyingRepository buyingRepository) {
        this.informationService = informationService;
        this.buyingService = buyingService;
        this.buyingRepository = buyingRepository;
    }

    public BuyingDto process(Store store, Order order, OrderInformation orderInformation) {
        boolean isBought = buyingService.buy(store, order);
        if (isBought) {
            informationService.inform(orderInformation);
            buyingRepository.createPurchasing(order);
            return new BuyingDto(order, true);
        }
            return new BuyingDto(order, false);
    }
}
