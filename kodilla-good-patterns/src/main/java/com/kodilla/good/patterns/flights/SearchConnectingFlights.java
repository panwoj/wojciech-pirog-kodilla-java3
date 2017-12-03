package com.kodilla.good.patterns.flights;

import java.util.List;

public class SearchConnectingFlights implements SearchType {
    @Override
    public boolean search(Airport airport, List<Airport> connectionsList) {
        System.out.println("\nSearching for connecting flights from " + airport.getAirportName() + " airport:");
        airport.getConnections().stream()
                .flatMap(a -> a.getConnections().stream())
                .filter(a -> a != airport)
                .filter(a -> !airport.isConnected(a))
                .forEach(System.out::println);

        return true;
    }
}
