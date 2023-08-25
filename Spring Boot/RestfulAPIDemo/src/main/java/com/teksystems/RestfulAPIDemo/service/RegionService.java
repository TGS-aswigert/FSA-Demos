package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Department;
import com.teksystems.RestfulAPIDemo.model.Region;
import com.teksystems.RestfulAPIDemo.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getRegions() {
        return regionRepository.findAll();
    }

    public Region getRegion(Integer regionId) {
        return regionRepository.findById(regionId).orElse(null);
    }
}
