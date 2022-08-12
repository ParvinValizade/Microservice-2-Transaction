package com.company.microservice2transaction.dto;

import com.company.microservice2transaction.dto.converter.TransactionDtoConverter;
import com.company.microservice2transaction.model.Transaction;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionDtoConverterTest {

    @Test
    void testConvert(){
        Transaction transaction = new Transaction(
                1L,
                2L,
                3L,
                LocalDateTime.now()
        );

        TransactionDto transactionDto = TransactionDtoConverter.INSTANCE.convert(transaction);

        assertEquals(transactionDto.getId(),1L);
        assertEquals(transactionDto.getUserId(),2L);
        assertEquals(transactionDto.getProductId(),3L);
    }

    @Test
    void testConvertList(){
        List<Transaction> transactionList = IntStream.range(0, 5).mapToObj(i ->
                new Transaction(
                        1L+i,
                        2L,
                        3L,
                        LocalDateTime.now()
                )).collect(Collectors.toList());

        List<TransactionDto> transactionDto = TransactionDtoConverter.INSTANCE.convert(transactionList);

        for (int i = 0;i<5;i++) {
            assertEquals(transactionDto.get(i).getId(),1L+i);
            assertEquals(transactionDto.get(i).getUserId(), 2L);
            assertEquals(transactionDto.get(i).getProductId(), 3L);
        }
    }

}
