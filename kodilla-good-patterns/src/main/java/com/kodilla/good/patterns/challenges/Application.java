package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.model.BuyingDto;
import com.kodilla.good.patterns.challenges.model.Order;
import com.kodilla.good.patterns.challenges.model.OrderInformation;
import com.kodilla.good.patterns.challenges.model.Store;
import com.kodilla.good.patterns.challenges.repository.*;
import com.kodilla.good.patterns.challenges.retrievers.*;
import com.kodilla.good.patterns.challenges.send.*;
import com.kodilla.good.patterns.challenges.services.*;

public class Application {
    public static void main(String[] args) {

        Store store = new Store(10, 10, 10);

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
