package com.company.microservice2transaction.dto;

import java.time.LocalDateTime;

public class TransactionDto {

    private Long id;

    private Long userId;
    private Long productId;
    private LocalDateTime transactionTime;

    public TransactionDto(Long id, Long userId, Long productId, LocalDateTime transactionTime) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.transactionTime = transactionTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }
}
