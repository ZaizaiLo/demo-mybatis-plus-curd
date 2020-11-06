package com.zaizai.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import com.zaizai.demo.entity.Role;
import com.zaizai.demo.entity.User;
import com.zaizai.demo.mapper.RoleMapper;
import com.zaizai.demo.mapper.UserMapper;
import com.zaizai.demo.service.RoleService;
import com.zaizai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/6 11:27
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role selectById(String id) {
        return roleMapper.selectById(id);
    }


}
