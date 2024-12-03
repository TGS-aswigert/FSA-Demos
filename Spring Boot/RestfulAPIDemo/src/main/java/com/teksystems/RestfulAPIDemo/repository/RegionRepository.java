package com.teksystems.RestfulAPIDemo.repository;

import com.teksystems.RestfulAPIDemo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
}