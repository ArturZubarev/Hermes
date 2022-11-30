package org.zubarev.hermes.app.service;
import org.junit.Before;
import org.junit.Test;
import org.zubarev.hermes.app.model.entity.geography.City;

import java.util.List;

import static org.junit.Assert.*;
public class GeographicServiceImplTest {
    private GeographicService service;

    @Before
    public void setup() {
        service = new GeographicServiceImpl();
    }

    @Test
    public void testNoDataReturnedAtStart() {
        List<City> cities = service.findCities();
        assertTrue(cities.isEmpty());
    }

    @Test
    public void testSaveNewCitySuccess() {
        City city = new City("Voronezh");
        service.saveCity(city);

        List<City> cities = service.findCities();
        assertEquals(cities.size(), 1);
        assertEquals(cities.get(0).getName(), "Voronezh");
    }
}
