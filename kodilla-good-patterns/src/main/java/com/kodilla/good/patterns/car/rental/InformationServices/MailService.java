package com.kodilla.good.patterns.car.rental.InformationServices;


import com.kodilla.good.patterns.car.rental.model.User;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Sending Mail");
    }
}
