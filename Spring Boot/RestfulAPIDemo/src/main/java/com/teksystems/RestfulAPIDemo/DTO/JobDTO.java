package com.teksystems.RestfulAPIDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
public class JobDTO {

    @Getter @Setter
    private String jobTitle;

    @Getter @Setter
    private BigDecimal minSalary;

    @Getter @Setter
    private BigDecimal maxSalary;
}
