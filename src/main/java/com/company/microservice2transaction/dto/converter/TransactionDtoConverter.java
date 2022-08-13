package com.company.microservice2transaction.dto.converter;

import com.company.microservice2transaction.dto.TransactionDto;
import com.company.microservice2transaction.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface TransactionDtoConverter {

    TransactionDtoConverter INSTANCE = Mappers.getMapper(TransactionDtoConverter.class);

    TransactionDto convert(Transaction transaction);

    List<TransactionDto> convert(List<Transaction> transactionList);
}
