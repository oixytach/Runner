package com.back.controller.user;

import com.back.entity.Order;
import com.back.result.Result;
import com.back.service.RiderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/rider")
@Api(tags = "用户端骑手相关接口")
@Slf4j
public class RiderController {

    @Autowired
    private RiderService riderService;

    @GetMapping("/{order}")
    @ApiOperation("查询订单信息")
    public Result<List<Order>> getOrderById() {

        List<Order> order = riderService.getOrderInfoForRider();
        return Result.success(order);
    }


}
