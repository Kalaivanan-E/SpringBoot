package com.example.LoginPage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Long phoneNo;
}
