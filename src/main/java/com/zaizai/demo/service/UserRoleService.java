package com.zaizai.demo.service;

import com.zaizai.demo.entity.UserRole;

import java.util.List;

/**
 * @author ZaiZai
 */
public interface UserRoleService {

    List<UserRole> listByUserId(String userId);
}
