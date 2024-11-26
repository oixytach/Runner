package com.back.controller.admin;


import com.back.dto.UserDTO;
import com.back.entity.User;
import com.back.result.Result;
import com.back.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/user")
@Api(tags = "管理员端用户相关接口")
public class UserAdminController {
    @Autowired
    private UserService userService;

    @GetMapping
    public Result<List<UserDTO>> selectAllUsers() {
        List<UserDTO> users = userService.getAllUsers();

        return Result.success(users);
    }

    @GetMapping("/{id}")
    public Result<UserDTO> selectUserById(@PathVariable("id") Long userId) {
        UserDTO userDTO = userService.getUserDTOById(userId);
        return Result.success(userDTO);
    }
}
