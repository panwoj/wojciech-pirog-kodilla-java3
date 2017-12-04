package com.kodilla.good.patterns.flights;

import java.util.List;

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
        searchProcessor3.process(search);
    }
}
