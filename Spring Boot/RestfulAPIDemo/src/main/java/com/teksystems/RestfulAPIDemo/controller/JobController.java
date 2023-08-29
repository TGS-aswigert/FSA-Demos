package com.teksystems.RestfulAPIDemo.controller;

import com.teksystems.RestfulAPIDemo.DTO.JobDTO;
import com.teksystems.RestfulAPIDemo.model.Job;
import com.teksystems.RestfulAPIDemo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public Job addJob(@RequestBody JobDTO job) {
        return jobService.addJob(job);
    }

    @PutMapping("/{id}")
    public Job updateJob(
            @PathVariable(value = "id") Integer jobId,
            @RequestBody JobDTO job) {
        return jobService.updateJob(jobId, job);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable(value = "id") Integer jobId) {
        return jobService.deleteJob(jobId);
    }

}
