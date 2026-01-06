package com.example.FeedBack.controller;

import com.example.FeedBack.dto.FeedBackDTO;
import com.example.FeedBack.entity.FeedBackEntity;
import com.example.FeedBack.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
public class FeedBackController {

    @Autowired
    private FeedBackService service;

    @PostMapping("/savefeedback")

    public ResponseEntity<FeedBackDTO> createFeedback(@RequestBody FeedBackDTO feedbackdto){
        FeedBackDTO create = service.createFeedback(feedbackdto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }

    @GetMapping("/{feedbackId}")

    public ResponseEntity<FeedBackEntity> getFeedback(@PathVariable Long feedbackId){
        FeedBackEntity get = service.getFeedback(feedbackId);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }

    @PutMapping("/{feedbackId}")

    public ResponseEntity<FeedBackDTO> updateFeedback(@PathVariable Long feedbackId, @RequestBody FeedBackDTO feedbackdto){
        FeedBackDTO update = service.updateFeedback(feedbackId,feedbackdto);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{feedbackId}")

    public ResponseEntity<String> deleteFeedback(@PathVariable Long feedbackId){
        service.deleteFeedback(feedbackId);
        return ResponseEntity.ok("Deleted successfully");
    }
}
