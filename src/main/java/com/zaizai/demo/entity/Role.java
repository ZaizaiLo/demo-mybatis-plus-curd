package com.zaizai.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import lombok.Data;

@ApiModel(value = "com-zaizai-demo-entity-Role")
@Data
@TableName(value = "demo_tb_role")
public class Role implements Serializable {
    /**
     * 角色ID
     */
    @TableId(value = "ID", type = IdType.INPUT)
    @ApiModelProperty(value = "角色ID")
    private String id;

    /**
     * 角色名
     */
    @TableField(value = "`NAME`")
    @ApiModelProperty(value = "角色名")
    private String name;


}