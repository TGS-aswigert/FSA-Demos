package com.teksystems.RestfulAPIDemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "countries")
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    @Column(length = 2, columnDefinition = "char")
    @Getter @Setter
    private String countryId;

    @Getter @Setter
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "region_id")
    @Getter @Setter
    private Region region;
}
