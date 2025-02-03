package com.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountBean {
    //Int from , to , amount;

    private int from;
    private int to;
    private double amount;
}
