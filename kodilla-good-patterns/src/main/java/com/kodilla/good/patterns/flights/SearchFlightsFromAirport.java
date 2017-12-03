package com.kodilla.good.patterns.flights;

import java.util.List;

public class SearchFlightsFromAirport implements SearchType {
    @Override
    public boolean search(Airport airport, List<Airport> connectionsList) {
        System.out.println("\nSearching for flights from " + airport.getAirportName() + " airport:");
        airport.getConnections().stream()
                .forEach(System.out::println);
        return true;
    }
}
