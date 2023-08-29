package com.teksystems.RestfulAPIDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String phoneNumber;

    @Getter @Setter
    private Integer jobId;

    @Getter @Setter
    private BigDecimal salary;

    @Getter @Setter
    private Integer managerId;

    @Getter @Setter
    private Integer departmentId;
}
