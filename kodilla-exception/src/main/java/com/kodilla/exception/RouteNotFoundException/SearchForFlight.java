package com.kodilla.exception.RouteNotFoundException;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SearchForFlight {
    final Boolean connection = true;
    final Boolean noConnection = false;

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapOfAirportsConnected = createMapOfAirports();
        try {
            if (!mapOfAirportsConnected.containsKey(flight.getArrivalAirport())) {
                throw new IOException();
            }
            boolean isConnection = this.checkConnection(mapOfAirportsConnected, flight);
            showText(isConnection, flight);
        } catch (IOException e) {
            throw new RouteNotFoundException("There is no \"" + flight.getArrivalAirport() +
                    "\" airport in the system.");
        }
    }

    private Map<String, Boolean> createMapOfAirports() {
        Map<String, Boolean> airportsConnected = new HashMap<>();

        airportsConnected.put("Oslo", connection);
        airportsConnected.put("Tokio", noConnection);
        airportsConnected.put("Berlin", connection);
        airportsConnected.put("Beijing", noConnection);
        airportsConnected.put("Paris", connection);

        return airportsConnected;
    }

    private boolean checkConnection(Map<String, Boolean> airportsConnected, Flight flight) {
        boolean checkConnection = airportsConnected.entrySet().stream()
                .filter(n -> n.getKey().equals(flight.getArrivalAirport()))
                .map(n -> n.getValue())
                .reduce(false, (check, current) -> check = current);
        return checkConnection;
    }

    private void showText(boolean checkConnection, Flight flight) {
        String connectionText;
        if (checkConnection) {
            connectionText = "connections";
        } else {
            connectionText = "no connections";
        }

        System.out.println("Checking flight from " + flight.getDepartureAirport() +
                " to " + flight.getArrivalAirport() + "..." + "\n" +
                "There are " + connectionText + ".");

    }
}