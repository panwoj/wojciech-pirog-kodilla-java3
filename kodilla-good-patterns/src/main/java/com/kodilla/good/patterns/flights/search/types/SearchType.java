package com.kodilla.good.patterns.flights.search.types;

import com.kodilla.good.patterns.flights.model.Airport;

import java.util.List;

public interface SearchType {
    List<String > search(Airport airport, List<Airport> connectionsList);
}
