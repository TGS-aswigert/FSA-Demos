package com.teksystems.RestfulAPIDemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

// TODO: Remove everything relating to employee for demo

@Entity(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    @Getter
    private Integer employeeId;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String phoneNumber;

    @Getter @Setter
    private Date hireDate;

    @ManyToOne
    @JoinColumn(name = "job_id")
    @Getter @Setter
    private Job job;

    @Getter @Setter
    private BigDecimal salary;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    @Getter @Setter
    private Employee manager;

    @ManyToOne
    @JoinColumn(name = "department_id")
    @Getter @Setter
    private Department department;

}
