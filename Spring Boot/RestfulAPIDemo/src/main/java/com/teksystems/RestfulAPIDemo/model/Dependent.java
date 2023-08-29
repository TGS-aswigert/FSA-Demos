package com.teksystems.RestfulAPIDemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "dependents")
@NoArgsConstructor
@AllArgsConstructor
public class Dependent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer dependentId;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String relationship;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    @Getter @Setter
    private Employee employee;
}
