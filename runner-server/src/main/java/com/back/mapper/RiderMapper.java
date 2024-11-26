package com.back.mapper;

import com.back.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RiderMapper {

    @Select("select * from orders where status = 0")
    List<Order> getByStatus();
}
