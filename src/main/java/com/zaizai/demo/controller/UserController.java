package com.zaizai.demo.controller;

import com.zaizai.demo.common.ResultModel;
import com.zaizai.demo.entity.User;
import com.zaizai.demo.entity.vo.AddUserVo;
import com.zaizai.demo.service.UserService;
import com.zaizai.demo.utils.MD5Utils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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
        return userService.addUser(vo);
    }

    @RequestMapping("toLogin")
    @ApiOperation(value = "用户名/手机号码/邮箱登录",notes = "userMsg:用户名/手机号码/邮箱;userPsd:密码")
    public ResultModel toLogin(@Validated @RequestBody Map<String,Object> map) {
        return userService.toLogin(map);
    }
}
