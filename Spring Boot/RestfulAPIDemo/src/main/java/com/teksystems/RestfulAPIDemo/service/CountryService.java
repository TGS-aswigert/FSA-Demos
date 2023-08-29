package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Country;
import com.teksystems.RestfulAPIDemo.model.Region;
import com.teksystems.RestfulAPIDemo.repository.CountryRepository;
import com.teksystems.RestfulAPIDemo.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private RegionRepository regionRepository;

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Country getCountry(String countryId) {
        return countryRepository.findById(countryId).orElse(null);
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(String countryId, Country countryDetails) {
        Country country = countryRepository.findById(countryId).orElse(null);
        assert country != null;
        country.setCountryName(countryDetails.getCountryName());
        Region region = regionRepository.findById(countryDetails.getRegion().getRegionId()).orElse(null);
        assert region != null;
        country.setRegion(region);

        return countryRepository.save(country);
    }

    public String deleteCountry(String countryId) {
        Country country = countryRepository.findById(countryId).orElse(null);
        if (country != null) {
            countryRepository.delete(country);
            return countryId + " deleted successfully.";
        } else {
            return countryId + " could not be found.";
        }
    }
}
