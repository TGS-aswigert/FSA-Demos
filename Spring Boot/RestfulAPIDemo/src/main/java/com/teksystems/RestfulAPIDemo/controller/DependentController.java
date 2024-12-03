package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.DTO.DependentDTO;
import com.teksystems.RestfulAPIDemo.model.Dependent;
import com.teksystems.RestfulAPIDemo.service.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public Dependent addDependent(@RequestBody DependentDTO dependent) {
        return dependentService.addDependent(dependent);
    }

    @PutMapping("/{id}")
    public Dependent updateDependent(
            @PathVariable(value = "id") Integer dependentId,
            @RequestBody DependentDTO dependent) {
        return dependentService.updateDependent(dependentId, dependent);
    }

    @DeleteMapping("/{id}")
    public String deleteDependent(@PathVariable(value = "id") Integer dependentId) {
        return dependentService.deleteDependent(dependentId);
    }
}
