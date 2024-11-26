package com.back.mapper;

import com.back.dto.OrderDTO;
import com.back.entity.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {


    @Select("select * from `order` where user_id = #{userId}")
    List<Order> getByUserid(Long userId);

    //@AutoFill(value = OperationType.INSERT)
    void insert(Order order);

    @Delete("delete from `order` where order_id = #{orderId}")
    void deleteByOrderId(Long orderId);

    void update(Order order);


}
