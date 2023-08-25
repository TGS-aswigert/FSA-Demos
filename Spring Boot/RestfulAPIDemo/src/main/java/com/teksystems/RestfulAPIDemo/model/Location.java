package com.teksystems.RestfulAPIDemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "locations")
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer locationId;

    @Getter @Setter
    private String streetAddress;

    @Getter @Setter
    private String postalCode;

    @Getter @Setter
    private String city;

    @Column(name = "state_province")
    @Getter @Setter
    private String stateOrProvince;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @Getter @Setter
    private Country country;
}
