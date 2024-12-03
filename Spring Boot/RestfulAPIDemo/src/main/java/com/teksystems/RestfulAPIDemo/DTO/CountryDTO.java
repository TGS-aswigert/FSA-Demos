package com.teksystems.RestfulAPIDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class CountryDTO {

    @Getter @Setter
    private String countryId;

    @Getter @Setter
    private String countryName;

    @Getter @Setter
    private Integer regionId;

}
