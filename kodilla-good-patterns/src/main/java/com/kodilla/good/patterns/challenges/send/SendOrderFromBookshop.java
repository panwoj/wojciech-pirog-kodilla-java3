package com.kodilla.good.patterns.challenges.send;

import com.kodilla.good.patterns.challenges.repository.BookshopRepository;

public class SendOrderFromBookshop {
    private BookshopRepository bookshopRepository;

    public SendOrderFromBookshop(BookshopRepository bookshopRepository) {
        this.bookshopRepository = bookshopRepository;
    }

    public boolean sendOrder() {
        System.out.println("\n---SENDING ORDER TO USER---");
        System.out.println(bookshopRepository.getOrdersQueue().pollFirst());
        return true;
    }
}
