package com.back.service;

import com.back.dto.UserDTO;
import com.back.dto.UserLoginDTO;
import com.back.entity.User;

public interface UserService {
     /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);


    void update(UserDTO userDTO);
}
