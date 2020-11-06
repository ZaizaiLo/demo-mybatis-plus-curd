package com.zaizai.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zaizai.demo.common.ResultModel;
import com.zaizai.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZaiZai
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from demo_tb_user where (user_phone=#{msg} or user_name=#{msg} or user_email=#{msg}) and password=#{psw}")
    User findUser(@Param(value = "msg") String userMsg, @Param(value = "psw") String userPsd);

    @Select("SELECT * FROM demo_tb_user WHERE ID = #{id}")
    User selectById(String id);

    @Select("SELECT * FROM demo_tb_user WHERE user_name = #{user_name}")
    User selectByName(String username);
}