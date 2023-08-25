package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.model.Region;
import com.teksystems.RestfulAPIDemo.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/")
    public List<Region> getRegions() {
        return regionService.getRegions();
    }

    @GetMapping("/{id}")
    public Region getRegion(@PathVariable(value = "id") Integer regionId) {
        return regionService.getRegion(regionId);
    }
}
