package com.kodilla.exception.RouteNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class SearchForFlight {
    final Boolean connection = true;
    final Boolean noConnection = false;

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapOfAirportsConnected = createMapOfAirports();
            if (!mapOfAirportsConnected.containsKey(flight.getArrivalAirport())) {
                throw new RouteNotFoundException("There is no \"" + flight.getArrivalAirport() +
                                    "\" airport in the system.");
            }
            boolean isConnection = mapOfAirportsConnected.get(flight.getArrivalAirport());
            return isConnection;
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

}