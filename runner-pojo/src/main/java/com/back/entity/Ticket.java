package com.back.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ticket implements Serializable {
    private String ticketName;
    private int ticketSum;
    private double ticketAccount;
    private Long userId;
}
