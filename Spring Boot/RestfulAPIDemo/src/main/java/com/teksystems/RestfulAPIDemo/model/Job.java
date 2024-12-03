package com.teksystems.RestfulAPIDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "jobs")
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer jobId;

    @Getter @Setter
    private String jobTitle;

    @Getter @Setter
    private BigDecimal minSalary;

    @Getter @Setter
    private BigDecimal maxSalary;
}
