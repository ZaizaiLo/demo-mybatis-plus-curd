package com.zaizai.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zaizai.demo.common.ResultModel;
import com.zaizai.demo.entity.User;
import com.zaizai.demo.entity.vo.AddUserVo;

import java.util.List;
import java.util.Map;

/**
 * @author ZaiZai
 */
public interface UserService extends IService<User> {

    ResultModel<User> addUser(AddUserVo vo);

    ResultModel<User> toLogin(Map<String, Object> map);
}
