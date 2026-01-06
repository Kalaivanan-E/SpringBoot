package com.example.FeedBack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedBackDTO {

    private Long feedbackId;
    private String name;
    private String message;
    private int rate;
}
