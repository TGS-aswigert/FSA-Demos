package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.DTO.DependentDTO;
import com.teksystems.RestfulAPIDemo.model.Dependent;
import com.teksystems.RestfulAPIDemo.repository.DependentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DependentService {

    @Autowired
    private DependentRepository dependentRepository;

    public List<Dependent> getDependents() {
        return dependentRepository.findAll();
    }

    public Dependent getDependent(Integer dependentId) {
        return dependentRepository.findById(dependentId).orElse(null);
    }

    public Dependent addDependent(DependentDTO dependent) {
        Dependent newDependent = new Dependent();
        BeanUtils.copyProperties(dependent, newDependent);

        return dependentRepository.save(newDependent);
    }

    public Dependent updateDependent(Integer dependentId, DependentDTO dependentDetails) {
        Dependent dependent = dependentRepository.findById(dependentId).orElse(null);
        assert dependent != null;
        BeanUtils.copyProperties(dependentDetails, dependent);


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
