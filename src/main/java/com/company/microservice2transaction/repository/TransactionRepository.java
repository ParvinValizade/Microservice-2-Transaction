package com.company.microservice2transaction.repository;


import com.company.microservice2transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findAllByUserId(Long userId);
}
