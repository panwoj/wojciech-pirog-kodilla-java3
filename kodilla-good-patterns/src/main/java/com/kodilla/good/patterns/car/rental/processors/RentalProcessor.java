package com.kodilla.good.patterns.car.rental.processors;

import com.kodilla.good.patterns.car.rental.InformationServices.InformationService;
import com.kodilla.good.patterns.car.rental.Services.RentalService;
import com.kodilla.good.patterns.car.rental.model.RentRequest;
import com.kodilla.good.patterns.car.rental.model.RentalDto;
import com.kodilla.good.patterns.car.rental.repositories.RentalRepository;

public class RentalProcessor {
    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
        if (isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}
