package com.kodilla.good.patterns.flights.processors;

import com.kodilla.good.patterns.flights.model.SearchDto;
import com.kodilla.good.patterns.flights.search.types.SearchType;

import java.util.List;

public class SearchProcessor {
    private SearchType searchType;

    public SearchProcessor(SearchType searchType) {
        this.searchType = searchType;
    }

    public void process(final SearchDto searchDto) {
        List<String> airPort = searchType.search(searchDto.getAirport(), searchDto.getConnectionList());
        System.out.println(airPort);
    }
}
