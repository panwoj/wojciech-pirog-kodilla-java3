package com.kodilla.good.patterns.flights.model;

import java.util.List;

public class SearchDto {
    private Airport airport;
    private List<Airport> connectionList;

    public SearchDto(Airport airport, List<Airport> connectionList) {
        this.airport = airport;
        this.connectionList = connectionList;
    }

    public Airport getAirport() {
        return airport;
    }

    public List<Airport> getConnectionList() {
        return connectionList;
    }
}
