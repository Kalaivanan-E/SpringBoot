package com.example.JobSearch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobDTO {

    private Long jobId;
    private String title;
    private String location;

}
