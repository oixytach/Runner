package com.back.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户端用户登录
 */
@Data
public class UserLoginDTO implements Serializable {

    private String code;

}
