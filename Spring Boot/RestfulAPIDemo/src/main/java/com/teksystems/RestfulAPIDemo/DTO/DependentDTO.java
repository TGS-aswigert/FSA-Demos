package com.teksystems.RestfulAPIDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class DependentDTO {

    @Getter
    @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String relationship;

    @Getter @Setter
    private Integer employeeId;
}
