package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        //Europe
        Country poland = new Country(new BigDecimal("38476269"));
        Country germany = new Country(new BigDecimal("80594017"));
        Country france = new Country(new BigDecimal("67106161"));

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        //Asia
        Country china = new Country(new BigDecimal("1379302771"));
        Country india = new Country(new BigDecimal("1281935911"));
        Country indonesia = new Country(new BigDecimal("260580739"));

        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(indonesia);
        //North America
        Country usa = new Country(new BigDecimal("326625791"));
        Country canada = new Country(new BigDecimal("35623680"));

        Continent northAmerica = new Continent();
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);

        //World
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3470245339");
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);

    }
}
