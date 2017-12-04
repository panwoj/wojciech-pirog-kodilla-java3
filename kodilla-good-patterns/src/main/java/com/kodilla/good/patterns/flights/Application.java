package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.connections.ConnectionsRetriever;
import com.kodilla.good.patterns.flights.model.SearchDto;
import com.kodilla.good.patterns.flights.processors.SearchProcessor;
import com.kodilla.good.patterns.flights.search.types.SearchConnectingFlights;
import com.kodilla.good.patterns.flights.search.types.SearchFlightsDestination;
import com.kodilla.good.patterns.flights.search.types.SearchFlightsFromAirport;

public class Application {
    public static void main(String[] args) {

        ConnectionsRetriever connectionsRetriever = new ConnectionsRetriever();
        SearchDto search = connectionsRetriever.retrieve();

        SearchProcessor searchProcessor = new SearchProcessor(new SearchFlightsFromAirport());
        searchProcessor.process(search);

        SearchProcessor searchProcessor2 = new SearchProcessor(new SearchFlightsDestination());
        searchProcessor2.process(search);

        SearchProcessor searchProcessor3 = new SearchProcessor(new SearchConnectingFlights());
        searchProcessor3.process(search);
    }
}
