package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Dependent;
import com.teksystems.RestfulAPIDemo.model.Employee;
import com.teksystems.RestfulAPIDemo.repository.DependentRepository;
import com.teksystems.RestfulAPIDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DependentService {

    @Autowired
    private DependentRepository dependentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Dependent> getDependents() {
        return dependentRepository.findAll();
    }

    public Dependent getDependent(Integer dependentId) {
        return dependentRepository.findById(dependentId).orElse(null);
    }

    public Dependent addDependent(Dependent dependent) {
        return dependentRepository.save(dependent);
    }

    public Dependent updateDependent(Integer dependentId, Dependent dependentDetails) {
        Dependent dependent = dependentRepository.findById(dependentId).orElse(null);
        assert dependent != null;
        dependent.setFirstName(dependentDetails.getFirstName());
        dependent.setLastName(dependentDetails.getLastName());
        dependent.setRelationship(dependentDetails.getRelationship());
        Employee employee = employeeRepository.findById(dependentDetails.getEmployee().getEmployeeId()).orElse(null);
        assert employee != null;
        dependent.setEmployee(employee);

        return dependentRepository.save(dependent);
    }

    public String deleteDependent(Integer dependentId) {
        Dependent dependent = dependentRepository.findById(dependentId).orElse(null);
        if (dependent != null) {
            dependentRepository.delete(dependent);
            return String.format("%s %s deleted successfully.", dependent.getFirstName(), dependent.getLastName());
        } else {
            return "Dependent with ID " + dependentId + " could not be found.";
        }
    }
}
