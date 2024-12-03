package com.teksystems.RestfulAPIDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class LocationDTO {

    @Getter @Setter
    private String streetAddress;

    @Getter @Setter
    private String postalCode;

    @Getter @Setter
    private String city;

    @Getter @Setter
    private String stateOrProvince;

    @Getter @Setter
    private String countryId;
}
