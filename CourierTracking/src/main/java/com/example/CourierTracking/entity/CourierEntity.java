package com.example.CourierTracking.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long courierId;
    private String trackingId;
    private String senderName;
    private String receiverName;
}
