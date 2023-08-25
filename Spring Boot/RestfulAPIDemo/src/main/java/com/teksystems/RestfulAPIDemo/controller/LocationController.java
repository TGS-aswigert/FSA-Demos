package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.model.Location;
import com.teksystems.RestfulAPIDemo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/")
    public List<Location> getLocations() {
        return locationService.getLocations();
    }

    @GetMapping("/{id}")
    public Location getLocation(@PathVariable(value = "id") Integer locationId) {
        return locationService.getLocation(locationId);
    }
}
