package com.kodilla.good.patterns.flights.search.types;

import com.kodilla.good.patterns.flights.model.Airport;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlightsDestination implements SearchType {
    @Override
    public List<String> search(Airport airport, List<Airport> connectionsList) {
        System.out.println("\nSearching for flights to " + airport.getAirportName() + " airport:");

       return connectionsList.stream()
                .filter(a -> a != airport)
                .filter(a -> a.isConnected(airport))
                .map(Airport::getAirportName)
                .collect(Collectors.toList());
    }
}
