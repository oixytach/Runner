package com.back.dto;

import com.back.entity.Ticket;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户端封装用户信息
 */

@Data
public class UserDTO implements Serializable {
    private Long userId;
    private String openId;
    private String username;
    private String phone;
    private double account;
    private int userStar;
    private int orderNNum;
    private int orderNum;
    private String userAddress;
    private List<Ticket> ticketList = new ArrayList<>();
}
