package com.example.transactionservice.data.model;

import com.example.transactionservice.config.AmountConfiguration;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Transaction {
    private Long id;
    @JsonSerialize(using = AmountConfiguration.class)
    private BigDecimal amount;
//    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime timestamp;

    public Transaction(BigDecimal amount, LocalDateTime timestamp) {
        this.amount = amount;
        this.timestamp = timestamp;
    }
}

    // round to 2 decimal places using HALF_EVEN
//    BigDecimal roundedTotal = total.setScale(2, RoundingMode.HALF_EVEN);