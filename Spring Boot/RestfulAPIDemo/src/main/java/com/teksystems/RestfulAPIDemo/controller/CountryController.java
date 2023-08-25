package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.model.Country;
import com.teksystems.RestfulAPIDemo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public List<Country> getCountries(){
        return countryService.getCountries();
    }

    @GetMapping("/{id}")
    public Country getCountry(@PathVariable(value = "id") String countryId) {
        return countryService.getCountry(countryId);
    }
}
