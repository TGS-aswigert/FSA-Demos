package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Dependent;
import com.teksystems.RestfulAPIDemo.repository.DependentRepository;
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
}
