package com.teksystems.RestfulAPIDemo.service;

import com.teksystems.RestfulAPIDemo.DTO.JobDTO;
import com.teksystems.RestfulAPIDemo.model.Country;
import com.teksystems.RestfulAPIDemo.model.Job;
import com.teksystems.RestfulAPIDemo.repository.JobRepository;
import org.springframework.beans.BeanUtils;
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

    public Job addJob(JobDTO job) {
        Job newJob = new Job();
        BeanUtils.copyProperties(job, newJob);
        return jobRepository.save(newJob);
    }

    public Job updateJob(Integer jobId, JobDTO jobDetails) {
        Job job = jobRepository.findById(jobId).orElse(null);
        assert job != null;
        BeanUtils.copyProperties(jobDetails, job);

        return jobRepository.save(job);
    }

    public String deleteJob (Integer jobId) {
        Job job = jobRepository.findById(jobId).orElse(null);
        if (job != null) {
            jobRepository.delete(job);
            return job.getJobTitle() + " deleted successfully.";
        } else {
            return "Job with ID " + jobId + " could not be found.";
        }
    }
}
