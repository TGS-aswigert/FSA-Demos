package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.model.Job;
import com.teksystems.RestfulAPIDemo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/")
    public List<Job> getJobs() {
        return jobService.getJobs();
    }

    @GetMapping("/{id}")
    public Job getJob(@PathVariable(value = "id") Integer jobId) {
        return jobService.getJob(jobId);
    }

}
