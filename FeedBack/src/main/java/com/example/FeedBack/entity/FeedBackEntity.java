package com.example.FeedBack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FeedBackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long feedbackId;
    private String name;
    private String message;
    private int rate;
}
