package com.teksystems.RestfulAPIDemo.repository;

import com.teksystems.RestfulAPIDemo.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
}
