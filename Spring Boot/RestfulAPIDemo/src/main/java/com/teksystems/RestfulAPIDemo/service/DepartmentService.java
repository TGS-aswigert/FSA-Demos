package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.DTO.DepartmentDTO;
import com.teksystems.RestfulAPIDemo.model.Department;
import com.teksystems.RestfulAPIDemo.model.Location;
import com.teksystems.RestfulAPIDemo.repository.DepartmentRepository;
import com.teksystems.RestfulAPIDemo.repository.LocationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private LocationRepository locationRepository;

    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartment(Integer departmentId) {
        return departmentRepository.findById(departmentId).orElse(null);
    }

    public Department addDepartment(DepartmentDTO department) {
        Department newDepartment = new Department();
        BeanUtils.copyProperties(department, newDepartment);
        Location location = locationRepository.findById(department.getLocationId()).orElse(null);
        assert location != null;
        newDepartment.setLocation(location);
        return departmentRepository.save(newDepartment);
    }

    public Department updateDepartment(Integer departmentId, DepartmentDTO departmentDetails) {
        Department department = departmentRepository.findById(departmentId).orElse(null);
        assert department != null;
        BeanUtils.copyProperties(departmentDetails, department);
        Location location = locationRepository.findById(departmentDetails.getLocationId()).orElse(null);
        assert location != null;
        department.setLocation(location);

        return departmentRepository.save(department);
    }

    public String deleteDepartment(Integer departmentId) {
        Department department = departmentRepository.findById(departmentId).orElse(null);
        if (department != null) {
            departmentRepository.delete(department);
            return department.getDepartmentName() + " deleted successfully.";
        } else {
            return "Department with ID " + departmentId + " could not be found.";
        }
    }
}
