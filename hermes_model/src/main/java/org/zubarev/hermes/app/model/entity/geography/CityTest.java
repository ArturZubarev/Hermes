package org.zubarev.hermes.app.model.entity.geography;

import org.junit.jupiter.api.Test;
import org.zubarev.hermes.app.model.entity.transport.TransportType;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    @Test
        public void testAddValidStationSuccess() {
            Station station = new Station();

            City city = new City("Voronezh");
            city.addStation(TransportType.AUTO);

            assertTrue(containsStation(city, station));
        }

        private boolean containsStation(City city, Station station) {
            return city.getStations().contains(station);
        }
    }