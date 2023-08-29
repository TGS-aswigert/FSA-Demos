package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.model.Region;
import com.teksystems.RestfulAPIDemo.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public Region addRegion(@RequestBody Region region) {
        return regionService.addRegion(region);
    }

    @PutMapping("/{id}")
    public Region updateRegion(
            @PathVariable(value = "id") Integer regionId,
            @RequestBody Region region) {
        return regionService.updateRegion(regionId, region);
    }

    @DeleteMapping("/{id}")
    public String deleteRegion(@PathVariable(value = "id") Integer regionId) {
        return regionService.deleteRegion(regionId);
    }
}
