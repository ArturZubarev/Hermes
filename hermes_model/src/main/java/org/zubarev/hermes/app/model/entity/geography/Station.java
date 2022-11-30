package org.zubarev.hermes.app.model.entity.geography;

import lombok.*;
import org.zubarev.hermes.app.model.entity.base.AbstractEntity;
import org.zubarev.hermes.app.model.entity.transport.TransportType;

import java.util.Objects;

@RequiredArgsConstructor
@Setter
@Getter
public class Station extends AbstractEntity {
    private City city;
    private Address address;
    private String phone;
    private Coordinate coordinate;
    private TransportType transportType;
    public Station(final City city,final TransportType transportType){
        this.city= Objects.requireNonNull(city);
        this.transportType=Objects.requireNonNull(transportType);
    }


}
