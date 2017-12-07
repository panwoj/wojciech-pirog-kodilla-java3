package com.kodilla.good.patterns.food2Door.deliveryServices;

import com.kodilla.good.patterns.food2Door.model.Request;

public class DeliveryStandardProcess implements DeliveryService {
    @Override
    public boolean deliver(Request request) {
        System.out.println("\nSending delivery request to chosen supplier: " + request.getSupplier().toString());
        boolean isDeliver = request.getSupplier().process(request);
        return isDeliver;
    }

}
