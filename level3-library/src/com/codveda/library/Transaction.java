package com.codveda.library;

import java.time.LocalDateTime;

public class Transaction {
    private int transactionId;
    private int bookId;
    private int userId;
    private LocalDateTime date;
    private String type; 
  
    public Transaction(int transactionId, int bookId, int userId, LocalDateTime date, String type) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.userId = userId;
        this.date = date;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Book ID: " + bookId + ", User ID: " + userId +
                ", Type: " + type + ", Date: " + date;
    }
}
