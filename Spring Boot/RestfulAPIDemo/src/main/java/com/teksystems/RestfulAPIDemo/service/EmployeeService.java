package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.DTO.EmployeeDTO;
import com.teksystems.RestfulAPIDemo.model.Department;
import com.teksystems.RestfulAPIDemo.model.Employee;
import com.teksystems.RestfulAPIDemo.model.Job;
import com.teksystems.RestfulAPIDemo.repository.DepartmentRepository;
import com.teksystems.RestfulAPIDemo.repository.EmployeeRepository;
import com.teksystems.RestfulAPIDemo.repository.JobRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Integer employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    public Employee addEmployee(EmployeeDTO employee) {
        Employee newEmployee = new Employee();
        BeanUtils.copyProperties(employee, newEmployee);

        newEmployee.setHireDate(new Date());

        Job job = jobRepository.findById(employee.getJobId()).orElse(null);
        assert job != null;
        newEmployee.setJob(job);

        Employee manager = employeeRepository.findById(employee.getManagerId()).orElse(null);
        assert manager != null;
        newEmployee.setManager(manager);

        Department department = departmentRepository.findById(employee.getDepartmentId()).orElse(null);
        assert department != null;
        newEmployee.setDepartment(department);

        return employeeRepository.save(newEmployee);
    }

    public Employee updateEmployee(Integer employeeId, EmployeeDTO employeeDetails) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        assert employee != null;

        BeanUtils.copyProperties(employeeDetails, employee);

        Job job = jobRepository.findById(employeeDetails.getJobId()).orElse(null);
        assert job != null;
        employee.setJob(job);

        Employee manager = employeeRepository.findById(employeeDetails.getManagerId()).orElse(null);
        assert manager != null;
        employee.setManager(manager);

        Department department = departmentRepository.findById(employeeDetails.getDepartmentId()).orElse(null);
        assert department != null;
        employee.setDepartment(department);

        return employeeRepository.save(employee);
    }

    public String deleteEmployee(Integer employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        if (employee != null) {
            employeeRepository.delete(employee);
            return String.format("%s %s deleted successfully.", employee.getFirstName(), employee.getLastName());
        } else {
            return "Employee with ID " + employeeId + " could not be found.";
        }
    }
}
