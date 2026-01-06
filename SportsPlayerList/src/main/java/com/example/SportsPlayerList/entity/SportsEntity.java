package com.example.SportsPlayerList.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SportsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   private Long playerId;
    private String playerName;
    private int age;
    private String gender;
}
