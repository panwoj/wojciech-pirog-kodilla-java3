package com.kodilla.good.patterns.car.rental;


import com.kodilla.good.patterns.car.rental.InformationServices.MailService;
import com.kodilla.good.patterns.car.rental.Services.CarRentalService;
import com.kodilla.good.patterns.car.rental.model.RentRequest;
import com.kodilla.good.patterns.car.rental.processors.RentalProcessor;
import com.kodilla.good.patterns.car.rental.repositories.CarRentalRepository;
import com.kodilla.good.patterns.car.rental.retrievers.RentRequestRetriever;

public class Application {
    public static void main(String[] args) {

        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(), new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);

    }
}
