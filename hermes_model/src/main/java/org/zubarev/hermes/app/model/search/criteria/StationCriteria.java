package org.zubarev.hermes.app.model.search.criteria;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.zubarev.hermes.app.model.entity.transport.TransportType;
@Data
@RequiredArgsConstructor
public class StationCriteria {
    private String name;
    private TransportType transportType;
    private String address;
    private StationCriteria(String name){
        this.name=name;
    }
    public static StationCriteria byName(String name){
        return new StationCriteria(name);
    }
}
