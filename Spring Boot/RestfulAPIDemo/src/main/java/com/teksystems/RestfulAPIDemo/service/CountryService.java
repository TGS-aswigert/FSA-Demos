package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Country;
import com.teksystems.RestfulAPIDemo.model.Department;
import com.teksystems.RestfulAPIDemo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Country getCountry(String countryId) {
        return countryRepository.findById(countryId).orElse(null);
    }
}
