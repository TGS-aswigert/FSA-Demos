package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Location;
import com.teksystems.RestfulAPIDemo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    public Location getLocation(Integer locationId) {
        return locationRepository.findById(locationId).orElse(null);
    }
}
