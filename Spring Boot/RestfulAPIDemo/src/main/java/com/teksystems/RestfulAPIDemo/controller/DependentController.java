package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.model.Dependent;
import com.teksystems.RestfulAPIDemo.service.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dependents")
public class DependentController {

    @Autowired
    private DependentService dependentService;

    @GetMapping("/")
    public List<Dependent> getDependents(){
        return dependentService.getDependents();
    }

    @GetMapping("/{id}")
    public Dependent getDependent(@PathVariable(value = "id") Integer dependentId) {
        return dependentService.getDependent(dependentId);
    }
}
