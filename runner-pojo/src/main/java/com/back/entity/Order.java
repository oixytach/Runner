package com.back.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    private Long orderId;
    private String typeService;
    private int status;
    private Long userId;
    private String description;
    private Long riderId;
    private String deliveryAddress;
    private String deliveryTime;
    private int orderStar;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String createUser;
    private String updateUser;
}
