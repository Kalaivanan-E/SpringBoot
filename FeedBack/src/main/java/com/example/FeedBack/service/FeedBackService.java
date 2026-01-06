package com.example.FeedBack.service;

import com.example.FeedBack.dto.FeedBackDTO;
import com.example.FeedBack.entity.FeedBackEntity;

public interface FeedBackService {

    FeedBackDTO createFeedback(FeedBackDTO feedbackdto);
    FeedBackEntity getFeedback(Long feedbackId);
    FeedBackDTO updateFeedback(Long feedbackId, FeedBackDTO feedbackdto);
    void deleteFeedback(Long feedbackId);
}
