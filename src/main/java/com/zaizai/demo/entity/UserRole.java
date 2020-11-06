package com.zaizai.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import lombok.Data;

@ApiModel(value = "com-zaizai-demo-entity-UserRole")
@Data
@TableName(value = "demo_tb_user_role")
public class UserRole implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    @ApiModelProperty(value = "编号")
    private String id;
    @TableId(value = "USER_ID", type = IdType.INPUT)
    @ApiModelProperty(value = "用户ID")
    private String userId;

    @TableId(value = "ROLE_ID", type = IdType.INPUT)
    @ApiModelProperty(value = "角色ID")
    private String roleId;



}