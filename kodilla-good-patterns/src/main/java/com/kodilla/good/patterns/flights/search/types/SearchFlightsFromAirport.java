package com.kodilla.good.patterns.flights.search.types;

import com.kodilla.good.patterns.flights.model.Airport;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlightsFromAirport implements SearchType {

    @Override
    public List<String> search(Airport airport, List<Airport> connectionsList) {

        return airport.getConnections().stream()
                .map(Airport::getAirportName)
                .collect(Collectors.toList());
    }
}
