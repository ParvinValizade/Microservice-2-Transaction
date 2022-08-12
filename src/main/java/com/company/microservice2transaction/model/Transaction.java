package com.company.microservice2transaction.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long productId;

    private LocalDateTime transactionTime;

    public Transaction() {
    }

    public Transaction(Long id, Long userId, Long productId, LocalDateTime transactionTime) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.transactionTime = transactionTime;
    }

    public Transaction(Long userId, Long productId, LocalDateTime transactionTime) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(productId, that.productId) && Objects.equals(transactionTime, that.transactionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, productId, transactionTime);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", transactionTime=" + transactionTime +
                '}';
    }
}
