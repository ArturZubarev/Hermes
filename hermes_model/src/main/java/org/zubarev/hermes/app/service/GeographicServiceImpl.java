package org.zubarev.hermes.app.service;

import lombok.Data;
import org.zubarev.hermes.app.infra.util.CommonUtil;
import org.zubarev.hermes.app.model.entity.geography.City;

import java.util.ArrayList;
import java.util.List;
public class GeographicServiceImpl implements GeographicService {
    /**
     * Internal list of cities
     */
    private final List<City> cities;

    public GeographicServiceImpl() {
        cities = new ArrayList<City>();
    }

    @Override
    public List<City> findCities() {
        return CommonUtil.getSafeList(cities);
    }

    @Override
    public void saveCity(City city) {
        if(!cities.contains(city)) {
            cities.add(city);
        }
    }

}
