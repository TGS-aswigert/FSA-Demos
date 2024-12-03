package com.teksystems.RestfulAPIDemo.repository;

import com.teksystems.RestfulAPIDemo.model.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependentRepository extends JpaRepository<Dependent, Integer> {
}
