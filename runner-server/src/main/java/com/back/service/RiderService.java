package com.back.service;

import com.back.entity.Order;

import java.util.List;

public interface RiderService {

    List<Order> getOrderInfoForRider();
}
