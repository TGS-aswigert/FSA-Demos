package com.teksystems.RestfulAPIDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {

    @Getter @Setter
    private String departmentName;

    @Getter @Setter
    private Integer locationId;
}
