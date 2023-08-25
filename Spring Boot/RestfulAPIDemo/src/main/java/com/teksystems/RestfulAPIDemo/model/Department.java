package com.teksystems.RestfulAPIDemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer departmentId;

    @Getter @Setter
    private String departmentName;

    @ManyToOne
    @JoinColumn(name = "location_id")
    @Getter @Setter
    private Location location;
}
