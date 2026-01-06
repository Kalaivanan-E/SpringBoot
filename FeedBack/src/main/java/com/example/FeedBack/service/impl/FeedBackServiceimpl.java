package com.example.FeedBack.service.impl;

import com.example.FeedBack.dto.FeedBackDTO;
import com.example.FeedBack.entity.FeedBackEntity;
import com.example.FeedBack.repository.FeedBackRepository;
import com.example.FeedBack.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedBackServiceimpl implements FeedBackService {

    @Autowired
    private FeedBackRepository repo;

    public FeedBackDTO createFeedback(FeedBackDTO feedbackdto){
        FeedBackEntity FB = new FeedBackEntity(
                feedbackdto.getFeedbackId(),
                feedbackdto.getName(),
                feedbackdto.getMessage(),
                feedbackdto.getRate()
        );
        FeedBackEntity savedFB = repo.save(FB);

        return new FeedBackDTO(
                savedFB.getFeedbackId(),
                savedFB.getName(),
                savedFB.getMessage(),
                savedFB.getRate()
        );
    }
    public FeedBackEntity getFeedback (Long feedbackId){
        return repo.findByfeedbackId(feedbackId);
    }
    public FeedBackDTO updateFeedback(Long feedbackId,FeedBackDTO feedbackdto){
        FeedBackEntity FB2 = repo.findByfeedbackId(feedbackId);

        FB2.setName(feedbackdto.getName());
        FB2.setMessage(feedbackdto.getMessage());
        FB2.setRate(feedbackdto.getRate());

        FeedBackEntity savedFB2 = repo.save(FB2);

        return new FeedBackDTO(
                savedFB2.getFeedbackId(),
                savedFB2.getName(),
                savedFB2.getMessage(),
                savedFB2.getRate()
        );
    }
    public void deleteFeedback(Long feedbackId){
        FeedBackEntity FB3 = repo.findByfeedbackId(feedbackId);
        repo.delete(FB3);
    }
}
