package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Department;
import com.teksystems.RestfulAPIDemo.model.Region;
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

    public Region addRegion(Region region) {
        return regionRepository.save(region);
    }

    public Region updateRegion(Integer regionId, Region regionDetails) {
        Region region = regionRepository.findById(regionId).orElse(null);
        assert region != null;
        region.setRegionName(regionDetails.getRegionName());

        return regionRepository.save(region);
    }

    public String deleteRegion (Integer regionId) {
        Region region = regionRepository.findById(regionId).orElse(null);
        if (region != null) {
            regionRepository.delete(region);
            return region.getRegionName() + " deleted successfully.";
        } else {
            return "Region with ID " + regionId + " could not be found.";
        }
    }
}
