package com.zaizai.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zaizai.demo.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author ZaiZai
 */
@Repository
public interface RoleMapper extends BaseMapper<Role> {
    @Select("SELECT * FROM demo_tb_role WHERE id = #{id}")
    Role selectById(String id);
}