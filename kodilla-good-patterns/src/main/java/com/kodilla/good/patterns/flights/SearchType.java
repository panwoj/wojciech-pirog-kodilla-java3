package com.kodilla.good.patterns.flights;

import java.util.List;

public interface SearchType {
    public boolean search(Airport airport, List<Airport> connectionsList);
}
