package com.teksystems.RestfulAPIDemo.repository;

import com.teksystems.RestfulAPIDemo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
