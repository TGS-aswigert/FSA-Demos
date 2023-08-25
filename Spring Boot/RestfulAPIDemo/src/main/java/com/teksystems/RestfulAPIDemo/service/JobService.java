package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.model.Job;
import com.teksystems.RestfulAPIDemo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getJobs() {
        return jobRepository.findAll();
    }

    public Job getJob(Integer jobId) {
        return jobRepository.findById(jobId).orElse(null);
    }
}
