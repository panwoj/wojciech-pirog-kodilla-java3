package com.kodilla.good.patterns.flights;

public class SearchProcessor {
    private SearchType searchType;

    public SearchProcessor(SearchType searchType) {
        this.searchType = searchType;
    }

    public boolean process(final SearchDto searchDto) {
        boolean isFound = searchType.search(searchDto.getAirport(), searchDto.getConnectionList());
        if (isFound) {
            System.out.println("\nSearch process finished successfully.");
            return true;
        } else {
            System.out.println("\nSearch process finished unsuccessfully.");
            return false;
        }
    }
}
