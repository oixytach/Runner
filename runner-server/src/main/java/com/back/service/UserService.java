package com.back.service;

import com.back.dto.UserDTO;
import com.back.dto.UserLoginDTO;
import com.back.entity.Order;
import com.back.entity.User;

import java.util.List;

public interface UserService {
     /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);

    User getUserInfo(Long id);

    void update(UserDTO userDTO);

    List<UserDTO> getAllUsers();

    UserDTO getUserDTOById(Long userId);
}
