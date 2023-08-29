package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Country;
import com.teksystems.RestfulAPIDemo.model.Job;
import com.teksystems.RestfulAPIDemo.model.Location;
import com.teksystems.RestfulAPIDemo.repository.CountryRepository;
import com.teksystems.RestfulAPIDemo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private CountryRepository countryRepository;

    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    public Location getLocation(Integer locationId) {
        return locationRepository.findById(locationId).orElse(null);
    }

    public Location addLocation(Location location) {
        return locationRepository.save(location);
    }

    public Location updateLocation(Integer locationId, Location locationDetails) {
        Location location = locationRepository.findById(locationId).orElse(null);
        assert location != null;
        location.setCity(locationDetails.getCity());
        location.setPostalCode(locationDetails.getPostalCode());
        location.setStreetAddress(locationDetails.getStreetAddress());
        location.setStateOrProvince(locationDetails.getStateOrProvince());

        Country country = countryRepository.findById(locationDetails.getCountry().getCountryId()).orElse(null);
        assert country != null;
        location.setCountry(country);

        return locationRepository.save(location);
    }

    public String deleteLocation (Integer locationId) {
        Location location = locationRepository.findById(locationId).orElse(null);
        if (location != null) {
            locationRepository.delete(location);
            return location.getStreetAddress() + " deleted successfully.";
        } else {
            return "Location with ID " + locationId + " could not be found.";
        }
    }
}
