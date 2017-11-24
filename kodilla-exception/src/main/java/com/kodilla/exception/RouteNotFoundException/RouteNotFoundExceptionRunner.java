package com.kodilla.exception.RouteNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        Flight paris = new Flight("Warsaw", "Paris");
        Flight beijing = new Flight("Warsaw", "Beijing");
        Flight losAngeles = new Flight("Warsaw", "Los Angeles");

        List<Flight> flightsToCheck = new ArrayList<>();
        flightsToCheck.add(paris);
        flightsToCheck.add(beijing);
        flightsToCheck.add(losAngeles);

        SearchForFlight search = new SearchForFlight();

        Flight currentFlight = null;
        for (int i = 0; i < flightsToCheck.size(); i++) {
            currentFlight = flightsToCheck.get(i);
            try {
                search.findFlight(currentFlight);
            } catch (RouteNotFoundException e) {
                System.out.println(e);
            }
        }
    }
}
