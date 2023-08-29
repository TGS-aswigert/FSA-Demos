package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.DTO.CountryDTO;
import com.teksystems.RestfulAPIDemo.model.Country;
import com.teksystems.RestfulAPIDemo.model.Region;
import com.teksystems.RestfulAPIDemo.repository.CountryRepository;
import com.teksystems.RestfulAPIDemo.repository.RegionRepository;
import org.springframework.beans.BeanUtils;
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

    public Country addCountry(CountryDTO country) {
        Country newCountry = new Country();
        BeanUtils.copyProperties(country, newCountry);
        Region region = regionRepository.findById(country.getRegionId()).orElse(null);
        assert region != null;
        newCountry.setRegion(region);
        return countryRepository.save(newCountry);
    }

    public Country updateCountry(String countryId, CountryDTO countryDetails) {
        Country country = countryRepository.findById(countryId).orElse(null);
        assert country != null;
        BeanUtils.copyProperties(countryDetails, country);
        Region region = regionRepository.findById(countryDetails.getRegionId()).orElse(null);
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
