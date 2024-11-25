package com.back.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDTO implements Serializable {

    private Long orderId;
    private String typeService;
    private int status;
    private Long userId;
    private String description;
    private int riderId;
    private String deliveryAddress;
    private String deliveryTime;
    private int orderStar;

}
