package com.zaizai.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zaizai.demo.entity.User;
import com.zaizai.demo.mapper.UserMapper;
import com.zaizai.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/4 16:35
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
