package com.example.BankAccountManagement.service.impl;

import com.example.BankAccountManagement.dto.BankDTO;
import com.example.BankAccountManagement.entity.BankEntity;
import com.example.BankAccountManagement.repository.BankRepository;
import com.example.BankAccountManagement.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceimpl implements BankService {

    @Autowired
    private BankRepository repo;

    public BankDTO createAccount(BankDTO bankdto){
        BankEntity BA = new BankEntity(
                bankdto.getAccountId(),
                bankdto.getName(),
                bankdto.getAccountType(),
                bankdto.getBalance()
        );
        BankEntity savedAccount = repo.save(BA);
        BankDTO SA = new BankDTO(
                savedAccount.getAccountId(),
                savedAccount.getName(),
                savedAccount.getAccountType(),
                savedAccount.getBalance()
        );
        return SA;
    }
    public BankEntity getAccount(Long accountId){
        return repo.findByaccountId(accountId);
    }

    public BankDTO updateAccount(Long accountId, BankDTO bankdto){
        BankEntity bankaccount = repo.findByaccountId(accountId);

        bankaccount.setName(bankdto.getName());
        bankaccount.setAccountType(bankdto.getAccountType());
        bankaccount.setBalance(bankdto.getBalance());

        BankEntity savedaccount = repo.save(bankaccount);

        return new BankDTO(
                savedaccount.getAccountId(),
                savedaccount.getName(),
                savedaccount.getAccountType(),
                savedaccount.getBalance()
        );
    }
    public void deleteAccount(Long accountId){
        BankEntity deleteaccount = repo.findByaccountId(accountId);
        repo.delete(deleteaccount);
    }
}
