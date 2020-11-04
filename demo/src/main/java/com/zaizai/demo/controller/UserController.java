package com.zaizai.demo.controller;

import com.zaizai.demo.common.ResultModel;
import com.zaizai.demo.entity.vo.AddUserVo;
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

    @RequestMapping("addUser")
    public ResultModel addUser(@RequestBody AddUserVo vo) {
        return ResultModel.success();
    }
}
