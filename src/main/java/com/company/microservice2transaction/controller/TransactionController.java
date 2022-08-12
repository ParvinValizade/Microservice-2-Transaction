package com.company.microservice2transaction.controller;

import com.company.microservice2transaction.dto.CreateTransactionRequest;
import com.company.microservice2transaction.dto.TransactionDto;
import com.company.microservice2transaction.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<TransactionDto> createTransaction(@RequestBody CreateTransactionRequest request){
        return ResponseEntity.ok(transactionService.createTransaction(request));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<TransactionDto>> getAllTransactionsByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(transactionService.getAllTransactionsOfUser(userId));
    }

    @DeleteMapping("/{transactionId}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable Long transactionId){
        transactionService.deleteTransaction(transactionId);
        return ResponseEntity.ok().build();
    }
}
