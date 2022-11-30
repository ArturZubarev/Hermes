package org.zubarev.hermes.app.model.entity.geography;

import lombok.*;
import org.zubarev.hermes.app.model.entity.base.AbstractEntity;
import org.zubarev.hermes.app.infra.util.CommonUtil;
import org.zubarev.hermes.app.model.entity.transport.TransportType;

import java.util.*;

@Data
public class City extends AbstractEntity {
    private String name;
    private String district;
    private String region;
    public City(final String name){
        this.name=name;
    }

    private Set<Station> stations;

    public Set<Station> getStations() {
        return CommonUtil.getSafeSet(stations);
    }

    public Station addStation(final TransportType transportType) {

        if (stations == null) {

            stations = new HashSet<>();

        }

        Station station = new Station(this, transportType);

        stations.add(station);
        return station;

    }

    public void removeStation(Station station) {
        Objects.requireNonNull(station, "station parameter is not initialized");
        if (stations == null) {
            return;
        }
        stations.remove(station);
    }

}
