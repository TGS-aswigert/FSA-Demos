package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.model.Job;
import com.teksystems.RestfulAPIDemo.model.Location;
import com.teksystems.RestfulAPIDemo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public Location addLocation(@RequestBody Location location) {
        return locationService.addLocation(location);
    }

    @PutMapping("/{id}")
    public Location updateLocation(
            @PathVariable(value = "id") Integer locationId,
            @RequestBody Location location) {
        return locationService.updateLocation(locationId, location);
    }

    @DeleteMapping("/{id}")
    public String deleteLocation(@PathVariable(value = "id") Integer locationId) {
        return locationService.deleteLocation(locationId);
    }
}
