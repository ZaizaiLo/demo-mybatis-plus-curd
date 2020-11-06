package com.zaizai.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zaizai.demo.entity.UserRole;
import com.zaizai.demo.mapper.UserRoleMapper;
import com.zaizai.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/6 11:31
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> listByUserId(String userId) {
        return userRoleMapper.listByUserId(userId);
    }
}
