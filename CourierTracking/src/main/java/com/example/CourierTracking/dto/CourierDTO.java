package com.example.CourierTracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourierDTO {

    private Long courierId;
    private String trackingId;
    private String senderName;
    private String receiverName;
}
