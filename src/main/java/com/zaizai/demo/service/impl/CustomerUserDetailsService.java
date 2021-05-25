package com.zaizai.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaizai.demo.entity.Role;
import com.zaizai.demo.entity.User;
import com.zaizai.demo.entity.UserRole;
import com.zaizai.demo.service.RoleService;
import com.zaizai.demo.service.UserRoleService;
import com.zaizai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/6 11:42
 */
@Service("userDetailsService")
public class CustomerUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        //从数据库获取出用户信息
        User user = userService.selectByName(username);

        // 判断用户是否存在
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        //添加权限
        List<UserRole> userRoles = userRoleService.listByUserId(user.getId());
        for (UserRole userRole : userRoles) {
            Role role = roleService.selectById(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        // 返回UserDetails实现类
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), authorities);

    }
}
