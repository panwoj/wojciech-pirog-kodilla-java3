package com.kodilla.good.patterns.food2Door.suppliers;

import com.kodilla.good.patterns.food2Door.model.Request;

public interface Supplier {
    boolean process(Request request);
}
