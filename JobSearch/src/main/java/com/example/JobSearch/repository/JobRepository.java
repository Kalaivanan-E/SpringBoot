package com.example.JobSearch.repository;

import com.example.JobSearch.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobEntity,Long> {
    JobEntity findByjobId(Long jobId);
}
