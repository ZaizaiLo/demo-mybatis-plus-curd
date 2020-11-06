package com.zaizai.demo.service;

import com.zaizai.demo.entity.Role;
import com.zaizai.demo.mapper.RoleMapper;

/**
 * @author ZaiZai
 */
public interface RoleService {

    Role selectById(String id);

}
