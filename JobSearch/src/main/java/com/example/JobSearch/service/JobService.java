package com.example.JobSearch.service;

import com.example.JobSearch.dto.JobDTO;
import com.example.JobSearch.entity.JobEntity;

public interface JobService {

    JobDTO createJob(JobDTO jobdto);
    JobEntity getJob(Long jobId);
    JobDTO updateJob(Long jobId, JobDTO jobdto);
    void deleteJob(Long jobId);
}
