package service;

import org.zubarev.hermes.app.model.entity.geography.City;

import java.util.List;

public interface GeographicService {

    List<City> findCities();

    void saveCity(City city);
}

