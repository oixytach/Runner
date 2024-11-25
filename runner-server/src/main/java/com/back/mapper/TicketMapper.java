package com.back.mapper;

import com.back.entity.Ticket;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TicketMapper {

    @Delete("delete from ticket where user_id = #{userId}")
    void deleteById(Long userId);

    void insertBatch(List<Ticket> ticketList);
}
