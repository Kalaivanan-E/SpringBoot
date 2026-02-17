package com.example.LoginPage.service.impl;

import com.example.LoginPage.dto.LoginDTO;
import com.example.LoginPage.entity.LoginEntity;
import com.example.LoginPage.repository.LoginRepository;
import com.example.LoginPage.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceimpl implements LoginService {
    @Autowired
    private LoginRepository repo;

    public LoginDTO create (LoginDTO logindto){
        LoginEntity create = new LoginEntity(
                logindto.getId(),
                logindto.getFirstName(),
                logindto.getLastName(),
                logindto.getEmail(),
                logindto.getPassword(),
                logindto.getPhoneNo()
        );
        LoginEntity savedlogin = repo.save(create);

        return new LoginDTO(
                savedlogin.getId(),
                savedlogin.getFirstName(),
                savedlogin.getLastName(),
                savedlogin.getEmail(),
                savedlogin.getPassword(),
                savedlogin.getPhoneNo()
        );
    }
}
