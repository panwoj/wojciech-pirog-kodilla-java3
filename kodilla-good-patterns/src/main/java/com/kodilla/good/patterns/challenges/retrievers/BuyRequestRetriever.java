package com.kodilla.good.patterns.challenges.retrievers;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.kodilla.good.patterns.challenges.model.BuyRequest;
import com.kodilla.good.patterns.challenges.model.*;
import com.kodilla.good.patterns.challenges.model.products.Book;
import com.kodilla.good.patterns.challenges.model.products.Game;
import com.kodilla.good.patterns.challenges.model.products.Product;
import com.kodilla.good.patterns.challenges.model.products.Record;

public class BuyRequestRetriever {

    public Order retrieve() {

        User user = new User("Wojciech", "Piróg");
        LocalDateTime requestDate = LocalDateTime.of(2017, 12, 02, 10, 0);

        Product game = new Game("Monpoly", 99.99, 4);
        int quantity1 = 1;

        Product book = new Book("Patriot Games", 15.50, 14);
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
