package org.zubarev.hermes.app.model.entity.geography;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Address {
    private String zipCode;
    private String street;
    private String houseNumber;
    private String apartment;
}
