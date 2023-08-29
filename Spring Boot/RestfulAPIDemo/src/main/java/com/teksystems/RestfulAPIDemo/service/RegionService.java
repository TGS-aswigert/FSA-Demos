package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.DTO.RegionDTO;
import com.teksystems.RestfulAPIDemo.model.Region;
import com.teksystems.RestfulAPIDemo.repository.RegionRepository;
import org.springframework.beans.BeanUtils;
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

    public Region addRegion(RegionDTO region) {
        Region newRegion = new Region();
        BeanUtils.copyProperties(region, newRegion);
        return regionRepository.save(newRegion);
    }

    public Region updateRegion(Integer regionId, RegionDTO regionDetails) {
        Region region = regionRepository.findById(regionId).orElse(null);
        assert region != null;
        BeanUtils.copyProperties(regionDetails, region);

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
