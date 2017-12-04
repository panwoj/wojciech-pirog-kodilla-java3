package com.kodilla.good.patterns.flights.connections;

import com.kodilla.good.patterns.flights.model.Airport;

import java.util.ArrayList;
import java.util.List;

public final class ConnectionsList {
    
    private List<Airport> listOfConnections = new ArrayList<>();

    public ConnectionsList() {
        Airport airport1 = new Airport("Kraków");
        Airport airport2 = new Airport("Gdańsk");
        Airport airport3 = new Airport("Warszawa");
        Airport airport4 = new Airport("Lublin");
        Airport airport5 = new Airport("Rzeszów");
        Airport airport6 = new Airport("Katowice");
        Airport airport7 = new Airport("Wrocław");
        Airport airport8 = new Airport("Poznań");
        Airport airport9 = new Airport("Szczecin");

        airport1.addConnection(airport2);
        airport1.addConnection(airport3);
        airport1.addConnection(airport7);
        airport1.addConnection(airport9);

        airport2.addConnection(airport1);
        airport2.addConnection(airport3);

        airport3.addConnection(airport1);
        airport3.addConnection(airport2);
        airport3.addConnection(airport4);
        airport3.addConnection(airport5);
        airport3.addConnection(airport7);
        airport3.addConnection(airport9);

        listOfConnections.add(airport1);
        listOfConnections.add(airport2);
        listOfConnections.add(airport3);
        listOfConnections.add(airport4);
        listOfConnections.add(airport5);
        listOfConnections.add(airport6);
        listOfConnections.add(airport7);
        listOfConnections.add(airport8);
        listOfConnections.add(airport9);
    }

    public List<Airport> getListOfConnections() {
        return listOfConnections;
    }
}
