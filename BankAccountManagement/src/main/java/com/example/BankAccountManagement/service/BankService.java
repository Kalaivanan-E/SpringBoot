package com.example.BankAccountManagement.service;

import com.example.BankAccountManagement.dto.BankDTO;
import com.example.BankAccountManagement.entity.BankEntity;

public interface BankService {
    BankDTO createAccount(BankDTO bankdto);
    BankEntity getAccount(Long accountId);
    BankDTO updateAccount(Long accountId, BankDTO bankdto);
    void deleteAccount(Long accountId);
}
