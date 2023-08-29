package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.model.Country;
import com.teksystems.RestfulAPIDemo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @PutMapping("/{id}")
    public Country updateCountry(@PathVariable(value = "id") String countryId, @RequestBody Country country) {
        return countryService.updateCountry(countryId, country);
    }

    @DeleteMapping("/{id}")
    public String deleteCountry(@PathVariable(value = "id") String countryId) {
        return countryService.deleteCountry(countryId);
    }
}
