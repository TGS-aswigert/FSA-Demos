package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Department;
import com.teksystems.RestfulAPIDemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartment(Integer departmentId) {
        return departmentRepository.findById(departmentId).orElse(null);
    }
}
