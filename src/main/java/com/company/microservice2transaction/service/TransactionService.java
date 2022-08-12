package com.company.microservice2transaction.service;

import com.company.microservice2transaction.dto.CreateTransactionRequest;
import com.company.microservice2transaction.dto.TransactionDto;
import com.company.microservice2transaction.dto.converter.TransactionDtoConverter;
import com.company.microservice2transaction.model.Transaction;
import com.company.microservice2transaction.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public TransactionDto createTransaction(CreateTransactionRequest request){
        Transaction transaction = new Transaction(
                request.getUserId(),
                request.getProductId(),
                LocalDateTime.now()
        );

        return TransactionDtoConverter.INSTANCE.convert(repository.save(transaction));
    }

    public List<TransactionDto> getAllTransactionsOfUser(Long userId){
        return TransactionDtoConverter.INSTANCE.convert(repository.findAllByUserId(userId));
    }

    public void deleteTransaction(Long id){
        repository.deleteById(id);
    }
}
