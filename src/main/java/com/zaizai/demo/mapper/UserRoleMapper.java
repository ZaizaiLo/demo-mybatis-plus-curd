package com.zaizai.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zaizai.demo.entity.Role;
import com.zaizai.demo.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleMapper extends BaseMapper<UserRole> {

    @Select("SELECT * FROM demo_tb_user_role WHERE user_id = #{userId}")
    List<UserRole> listByUserId(String userId);
}