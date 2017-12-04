package com.kodilla.good.patterns.flights.connections;

import com.kodilla.good.patterns.flights.model.SearchDto;
import com.kodilla.good.patterns.flights.model.Airport;

import java.util.List;

public class ConnectionsRetriever {

    private ConnectionsList connectionsList = new ConnectionsList();

    public SearchDto retrieve() {

        List<Airport> listOfConnections = connectionsList.getListOfConnections();
        Airport airport = listOfConnections.get(0);
        System.out.println("Retrieve " + airport.getAirportName() + " airport.");

        return new SearchDto(airport, listOfConnections);
    }
}
