package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.DTO.DepartmentDTO;
import com.teksystems.RestfulAPIDemo.model.Department;
import com.teksystems.RestfulAPIDemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public Department addDepartment(@RequestBody DepartmentDTO department) {
        return departmentService.addDepartment(department);
    }

    @PutMapping("/{id}")
    public Department updateDepartment(
            @PathVariable(value = "id") Integer departmentId,
            @RequestBody DepartmentDTO department) {
        return departmentService.updateDepartment(departmentId, department);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable(value = "id") Integer departmentId) {
        return departmentService.deleteDepartment(departmentId);
    }
}
