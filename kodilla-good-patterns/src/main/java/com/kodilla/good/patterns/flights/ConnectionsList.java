package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public final class ConnectionsList {
    public final List<Airport> listOfConnections() {
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

        List<Airport> resultList = new ArrayList<>();
        resultList.add(airport1);
        resultList.add(airport2);
        resultList.add(airport3);
        resultList.add(airport4);
        resultList.add(airport5);
        resultList.add(airport6);
        resultList.add(airport7);
        resultList.add(airport8);
        resultList.add(airport9);

        return resultList;
    }

}
