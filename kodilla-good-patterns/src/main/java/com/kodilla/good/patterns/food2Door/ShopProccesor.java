package com.kodilla.good.patterns.food2Door;

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
