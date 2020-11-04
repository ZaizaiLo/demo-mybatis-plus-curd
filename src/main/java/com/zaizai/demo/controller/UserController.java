package com.zaizai.demo.controller;

import com.zaizai.demo.common.ResultModel;
import com.zaizai.demo.entity.User;
import com.zaizai.demo.entity.vo.AddUserVo;
import com.zaizai.demo.service.UserService;
import com.zaizai.demo.utils.MD5Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/4 14:20
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("addUser")
    public ResultModel addUser(@Validated @RequestBody AddUserVo vo) {
        User user = new User();
        BeanUtils.copyProperties(vo, user);
        user.setPassword(MD5Utils.inputPassToFormPass(vo.getPassword()));
        boolean save = userService.save(user);
        return save == true ? ResultModel.error("添加失败") : ResultModel.success();
    }
}
