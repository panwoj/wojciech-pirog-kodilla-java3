package com.kodilla.good.patterns.flights;

import java.util.List;

public class SearchFlightsDestination implements SearchType {
    @Override
    public boolean search(Airport airport, List<Airport> connectionsList) {
        System.out.println("\nSearching for flights to " + airport.getAirportName() + " airport:");
        connectionsList.stream()
                .filter(a -> a != airport)
                .filter(a -> a.isConnected(airport))
                .forEach(System.out::println);

        return true;
    }
}
