package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.model.Department;
import com.teksystems.RestfulAPIDemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    private List<Department> getDepartments() {
        return departmentService.getDepartments();
    }

    @GetMapping("/{id}")
    private Department getDepartment(@PathVariable(value = "id") Integer departmentId) {
        return departmentService.getDepartment(departmentId);
    }
}
