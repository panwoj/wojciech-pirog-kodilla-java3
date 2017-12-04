package com.kodilla.good.patterns.flights.model;

import java.util.HashSet;
import java.util.Set;

public final class Airport {
    private final String airportName;
    private final Set<Airport> connections = new HashSet<>();

    public Airport(final String airportName) {
        this.airportName = airportName;
    }

    public void addConnection(Airport airport) {
        connections.add(airport);
    }

    public boolean isConnected(Airport airport) {
        return connections.contains(airport);
    }

    public String getAirportName() {
        return airportName;
    }

    public Set<Airport> getConnections() {
        return connections;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportName='" + airportName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (!airportName.equals(airport.airportName)) return false;
        return connections.equals(airport.connections);
    }

    @Override
    public int hashCode() {
        int result = airportName.hashCode();
        result = 31 * result;
        return result;
    }
}
