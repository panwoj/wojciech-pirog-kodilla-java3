package com.kodilla.good.patterns.challenges;

import com.sun.org.apache.xpath.internal.operations.Or;

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
