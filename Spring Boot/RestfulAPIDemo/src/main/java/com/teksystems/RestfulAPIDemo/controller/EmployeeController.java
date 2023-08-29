package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.DTO.EmployeeDTO;
import com.teksystems.RestfulAPIDemo.model.Employee;
import com.teksystems.RestfulAPIDemo.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable(value = "id") Integer employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @PostMapping("/")
    public Employee addEmployee(@RequestBody EmployeeDTO employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable(value = "id") Integer employeeId,
            @RequestBody EmployeeDTO employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Integer employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }

}
