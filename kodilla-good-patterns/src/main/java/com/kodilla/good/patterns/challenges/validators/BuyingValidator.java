package com.kodilla.good.patterns.challenges.validators;

import com.kodilla.good.patterns.challenges.model.BuyRequest;
import com.kodilla.good.patterns.challenges.model.Order;
import com.kodilla.good.patterns.challenges.model.Store;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BuyingValidator {

    public static boolean checkStore(Store store, Order order) {
        boolean productsAvailable = true;

        List<BuyRequest> requestList = order.getOrder().entrySet().stream()
                .map(entry -> entry.getValue())
                .collect(Collectors.toList());
        Map<String, Integer> storeMap = store.storeInfo();

        for(int i=0; i < requestList.size(); i++) {
            String currentProduct = requestList.get(i).getProduct().toString();
            int currentQuantity = requestList.get(i).getQuantity();
            int storeQuantity = storeMap.get(currentProduct);

            if(currentQuantity > storeQuantity) {
                productsAvailable = false;
            }

        }

        return productsAvailable;
    }
}
