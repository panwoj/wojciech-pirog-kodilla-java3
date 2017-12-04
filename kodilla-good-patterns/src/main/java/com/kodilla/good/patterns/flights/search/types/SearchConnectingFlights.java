package com.kodilla.good.patterns.flights.search.types;

import com.kodilla.good.patterns.flights.model.Airport;

import java.util.List;
import java.util.stream.Collectors;

public class SearchConnectingFlights implements SearchType {

    @Override
    public List<String> search(Airport airport, List<Airport> connectionsList) {

         return airport.getConnections().stream()
                .flatMap(a -> a.getConnections().stream())
                .filter(a -> a != airport)
                .filter(a -> !airport.isConnected(a))
                .map(airport1 -> airport1.getAirportName())
                .collect(Collectors.toList());
    }
}
