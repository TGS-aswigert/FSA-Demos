package com.teksystems.RestfulAPIDemo.repository;

import com.teksystems.RestfulAPIDemo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
