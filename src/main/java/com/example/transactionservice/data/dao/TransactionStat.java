package com.example.transactionservice.data.dao;

import com.example.transactionservice.config.AmountConfiguration;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionStat {
    @JsonSerialize(using = AmountConfiguration.class)
    private BigDecimal sum;
    @JsonSerialize(using = AmountConfiguration.class)
    private BigDecimal avg;
    @JsonSerialize(using = AmountConfiguration.class)
    private BigDecimal max;
    @JsonSerialize(using = AmountConfiguration.class)
    private BigDecimal min;
    private long count;

}
