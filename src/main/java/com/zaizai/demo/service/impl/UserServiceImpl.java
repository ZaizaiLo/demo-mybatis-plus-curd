package com.zaizai.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zaizai.demo.common.ResultModel;
import com.zaizai.demo.entity.User;
import com.zaizai.demo.entity.vo.AddUserVo;
import com.zaizai.demo.mapper.UserMapper;
import com.zaizai.demo.service.UserService;
import com.zaizai.demo.utils.MD5Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/4 16:35
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public ResultModel<User> addUser(AddUserVo vo) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("USER_EMAIL", vo.getUserEmail()).or().eq("NICKNAME", vo.getNickname());
        int count = userMapper.selectCount(wrapper);
        if (count > 0) {
            return ResultModel.error("邮箱或者昵称已存在");
        } else {
            User user = new User();
            BeanUtils.copyProperties(vo, user);
            user.setPassword(MD5Utils.inputPassToFormPass(vo.getPassword()));
            int insert = userMapper.insert(user);
            return insert > 0 ? ResultModel.success() : ResultModel.error("添加失败");
        }
    }
}
