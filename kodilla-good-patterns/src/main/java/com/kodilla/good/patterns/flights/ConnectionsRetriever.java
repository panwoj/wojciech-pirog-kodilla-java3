package com.kodilla.good.patterns.flights;

import java.util.List;

public class ConnectionsRetriever {
    public SearchDto retrieve() {


        List<Airport> listOfConnections = new ConnectionsList().listOfConnections();
        Airport airport = listOfConnections.get(0);
        System.out.println("Retrieve " + airport.getAirportName() + " airport.");

        SearchDto search = new SearchDto(airport, listOfConnections);
        return search;
    }
}
