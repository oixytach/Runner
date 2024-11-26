package com.back.service.impl;

import com.back.entity.Order;
import com.back.mapper.OrderMapper;
import com.back.mapper.RiderMapper;
import com.back.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    private RiderMapper riderMapper;



    public List<Order> getOrderInfoForRider() {
        List<Order> orderByStatus = riderMapper.getByStatus();
        return orderByStatus;

    }
}
