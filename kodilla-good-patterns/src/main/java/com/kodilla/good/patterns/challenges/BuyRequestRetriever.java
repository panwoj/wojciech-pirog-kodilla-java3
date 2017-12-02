package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class BuyRequestRetriever {

    public Order retrieve() {

        User user = new User("Wojciech", "Piróg");
        LocalDateTime requestDate = LocalDateTime.of(2017, 12, 02, 10, 0);

        Product game = new Game("Monpoly", 99.99, 4);
        int quantity1 = 1;

        Product book = new Book("Patriot Games", 15.50, 5);
        int quantity2 = 4;

        Product cd = new Record("Christmas carols", 9.99, 3);
        int quantity3 = 2;

        Map<Integer, BuyRequest> theMap = new HashMap<Integer, BuyRequest>();
        theMap.put(1, new BuyRequest(user, game, quantity1, requestDate));
        theMap.put(2, new BuyRequest(user, book, quantity2, requestDate));
        theMap.put(3, new BuyRequest(user, cd, quantity3, requestDate));

        return new Order(theMap);
    }
}
