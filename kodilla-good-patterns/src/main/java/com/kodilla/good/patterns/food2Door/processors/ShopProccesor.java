package com.kodilla.good.patterns.food2Door.processors;

import com.kodilla.good.patterns.food2Door.deliveryServices.DeliveryService;
import com.kodilla.good.patterns.food2Door.model.BuyingDto;
import com.kodilla.good.patterns.food2Door.model.Request;
import com.kodilla.good.patterns.food2Door.shopServices.ShopService;

public class ShopProccesor {
    private ShopService shopService;
    private DeliveryService deliveryService;

    public ShopProccesor(final ShopService shopService, final DeliveryService deliveryService) {
        this.shopService = shopService;
        this.deliveryService = deliveryService;
    }

    public BuyingDto process(final Request request) {
        boolean isOrderCorrect = shopService.checkOrder(request);
        if (isOrderCorrect) {
            boolean isDeliver = deliveryService.deliver(request);
            if (isDeliver) {
                System.out.println("\nOrder delivered.");
                return new BuyingDto(request.getUser(), true);
            }
        }
        System.out.println("\nOrder not delivered.");
        return new BuyingDto(request.getUser(), false);
    }

}
