package com.example.FeedBack.repository;

import com.example.FeedBack.entity.FeedBackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedBackRepository extends JpaRepository<FeedBackEntity,Long> {
    FeedBackEntity findByfeedbackId(Long feedbackId);
}
