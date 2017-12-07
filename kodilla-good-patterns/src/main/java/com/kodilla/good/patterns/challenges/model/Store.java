package com.kodilla.good.patterns.challenges.model;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private int booksQuantity;
    private int recordsQuantity;
    private int gamesQuantity;
    private Map<String, Integer> store = new HashMap<>();

    public Store(int booksQuantity, int recordsQuantity, int gamesQuantity) {
        this.booksQuantity = booksQuantity;
        this.recordsQuantity = recordsQuantity;
        this.gamesQuantity = gamesQuantity;
    }

    public Map<String, Integer> storeInfo() {
        store.put("Book", booksQuantity);
        store.put("Record", recordsQuantity);
        store.put("Game", gamesQuantity);
        return store;
    }
}
