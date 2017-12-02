package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SendMail implements InformationService {
    @Override
    public void inform(OrderInformation orderInformation) {
        System.out.println("\n---SENDING MESSAGE TO USER---");
        System.out.println(LocalDate.now() + "\nHello " + orderInformation.getUser() +"!");
        System.out.println("We recieved your order. You have bought "
                + orderInformation.getQuantityAmount() + " prodcuts.");
        System.out.println("Total order amount: " + orderInformation.getMoneyAmount() + " PLN");
        System.out.println("Predicted delivery date: " + orderInformation.getPredictedDeliveryDate());
        System.out.println("Thanks for choosing our shop!");
    }
}
