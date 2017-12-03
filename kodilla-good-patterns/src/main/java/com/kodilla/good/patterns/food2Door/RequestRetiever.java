package com.kodilla.good.patterns.food2Door;

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
