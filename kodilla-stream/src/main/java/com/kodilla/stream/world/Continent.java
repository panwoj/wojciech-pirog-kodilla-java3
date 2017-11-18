package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {
    public final List<Country> countryList = new ArrayList<>();

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public void removeCountry(Country country) {
        countryList.remove(country);
    }

    public List<Country> getCountries() {
        return countryList;
    }

}
