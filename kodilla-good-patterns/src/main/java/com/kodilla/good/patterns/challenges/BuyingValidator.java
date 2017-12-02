package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BuyingValidator {

    public static boolean checkStore(Store store, Order order) {
        boolean productsAvaible = true;

        List<BuyRequest> requestList = order.getOrder().entrySet().stream()
                .map(entry -> entry.getValue())
                .collect(Collectors.toList());
        Map<String, Integer> storeMap = store.storeInfo();

        for(int i=0; i < requestList.size(); i++) {
            String currentProduct = requestList.get(i).getProduct().toString();
            int currentQuantity = requestList.get(i).getQuantity();
            int storeQuantity = storeMap.get(currentProduct);

            if(currentQuantity > storeQuantity) {
                productsAvaible = false;
            }

        }

        return productsAvaible;
    }
}
