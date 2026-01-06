package com.example.JobSearch.service.impl;

import com.example.JobSearch.dto.JobDTO;
import com.example.JobSearch.entity.JobEntity;
import com.example.JobSearch.repository.JobRepository;
import com.example.JobSearch.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceimpl implements JobService {

    @Autowired
    private JobRepository repo;

    public JobDTO createJob(JobDTO jobdto){
        JobEntity job1 = new JobEntity(
                jobdto.getJobId(),
                jobdto.getTitle(),
                jobdto.getLocation()
        );
        JobEntity savedjob1 = repo.save(job1);

        return new JobDTO(
                savedjob1.getJobId(),
                savedjob1.getTitle(),
                savedjob1.getLocation()
        );
    }
    public JobEntity getJob(Long jobId){
        return repo.findByjobId(jobId);
    }
    public JobDTO updateJob(Long jobId,JobDTO jobdto){
        JobEntity job2 = repo.findByjobId(jobId);
        job2.setTitle(jobdto.getTitle());
        job2.setLocation(jobdto.getLocation());

        JobEntity savedjob2 = repo.save(job2);

        return new JobDTO(
                savedjob2.getJobId(),
                savedjob2.getTitle(),
                savedjob2.getLocation()
        );
    }

    public void deleteJob(Long jobId){
        JobEntity job2 = repo.findByjobId(jobId);
        repo.delete(job2);
    }
}
