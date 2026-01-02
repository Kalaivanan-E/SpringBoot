package com.example.BankAccountManagement.repository;

import com.example.BankAccountManagement.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<BankEntity,Long> {
    BankEntity findByaccountId(Long accountId);
}
