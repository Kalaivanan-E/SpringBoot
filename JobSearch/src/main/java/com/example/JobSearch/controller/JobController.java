package com.example.JobSearch.controller;

import com.example.JobSearch.dto.JobDTO;
import com.example.JobSearch.entity.JobEntity;
import com.example.JobSearch.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/job")
public class JobController {

    @Autowired
    private JobService service;

    @PostMapping("/saveJob")
    public ResponseEntity<JobDTO> createJob(@RequestBody JobDTO jobdto){
        JobDTO create = service.createJob(jobdto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }

    @GetMapping("/{jobId}")
    public ResponseEntity<JobEntity> getJob(@PathVariable Long jobId){
        JobEntity get = service.getJob(jobId);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @PutMapping("/{jobId}")
    public ResponseEntity<JobDTO>updateJob(@PathVariable Long jobId, @RequestBody JobDTO jobdto){
        JobDTO update = service.updateJob(jobId,jobdto);
        return ResponseEntity.ok(update);
    }
    @DeleteMapping("/{jobId}")
    public ResponseEntity<String> deleteJob(@PathVariable Long jobId){
        service.deleteJob(jobId);
        return ResponseEntity.ok("deleted successfully");
    }
}
