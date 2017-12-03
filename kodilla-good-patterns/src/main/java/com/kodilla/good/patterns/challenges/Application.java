package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        Store store = new Store(10, 1, 10);

        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        Order order = buyRequestRetriever.retrieve();
        OrderInformation orderInformation = new OrderInformation(order);

        BookshopRepository bookshopRepository = new BookshopRepository();

        ProductOrderService productOrderService = new ProductOrderService(
                new SendMail(), new BookshopService(), bookshopRepository);
        BuyingDto purchase = productOrderService.process(store, order, orderInformation);

        if (purchase.isBought()) {
            SendOrderFromBookshop sendOrderFromBookshop = new SendOrderFromBookshop(bookshopRepository);
            sendOrderFromBookshop.sendOrder();

        }
    }
}
