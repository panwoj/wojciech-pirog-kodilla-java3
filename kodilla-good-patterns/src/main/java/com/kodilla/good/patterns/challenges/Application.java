package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.model.BuyingDto;
import com.kodilla.good.patterns.challenges.model.Order;
import com.kodilla.good.patterns.challenges.model.OrderInformation;
import com.kodilla.good.patterns.challenges.model.Store;
import com.kodilla.good.patterns.challenges.repository.BookshopRepository;
import com.kodilla.good.patterns.challenges.retrievers.BuyRequestRetriever;
import com.kodilla.good.patterns.challenges.send.SendMail;
import com.kodilla.good.patterns.challenges.send.SendOrderFromBookshop;
import com.kodilla.good.patterns.challenges.services.BookshopService;
import com.kodilla.good.patterns.challenges.services.ProductOrderService;

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
