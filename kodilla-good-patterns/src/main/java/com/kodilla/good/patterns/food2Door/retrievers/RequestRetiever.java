package com.kodilla.good.patterns.food2Door.retrievers;

import com.kodilla.good.patterns.food2Door.model.Order;
import com.kodilla.good.patterns.food2Door.model.Request;
import com.kodilla.good.patterns.food2Door.model.User;
import com.kodilla.good.patterns.food2Door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.food2Door.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.food2Door.suppliers.HealthyShop;
import com.kodilla.good.patterns.food2Door.suppliers.Supplier;

public class RequestRetiever {

    public Request retrieve() {
        User user = new User("Jan", "Nowak", "789123456", "Szczecin");
        Supplier supplier = new ExtraFoodShop();
        Order order = new Order("Fruit Package", 5, 20.0);

        return new Request(user, supplier, order);
    }

    public Request retrieve2() {
        User user = new User("Jan", "Nowak", "789123456", "Szczecin");
        Supplier supplier = new GlutenFreeShop();
        Order order = new Order("Fruit Package", 3, 12.0);

        return new Request(user, supplier, order);
    }

    public Request retrieve3() {
        User user = new User("Jan", "Nowak", "789123456", "Szczecin");
        Supplier supplier = new GlutenFreeShop();
        Order order = new Order("Fruit Package", 5, 20.0);

        return new Request(user, supplier, order);
    }

    public Request retrieve4() {
        User user = new User("Jan", "Nowak", "789123456", "Szczecin");
        Supplier supplier = new HealthyShop();
        Order order = new Order("Fruit Package", 5, 20.0);

        return new Request(user, supplier, order);
    }

    public Request retrieve5() {
        User user = new User("Jan", "Nowak", "789123456", "Warszawa");
        Supplier supplier = new HealthyShop();
        Order order = new Order("Fruit Package", 5, 20.0);

        return new Request(user, supplier, order);
    }
}
