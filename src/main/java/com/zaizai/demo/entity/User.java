package com.zaizai.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author ZaiZai
 */
@ApiModel(value = "用户信息实体")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName(value = "demo_tb_user")
@ToString
public class User {
    /**
     * 编号
     */
    @TableId(value = "ID", type = IdType.UUID)
    @ApiModelProperty(value = "编号")
    private String id;

    /**
     * 用户名
     */
    @TableField(value = "USER_NAME")
    @ApiModelProperty(value = "用户名")
    private String userName;

    /**
     * 性别
     */
    @TableField(value = "USER_GENDER")
    @ApiModelProperty(value = "性别")
    private String userGender;

    /**
     * 昵称
     */
    @TableField(value = "NICKNAME")
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * 邮箱
     */
    @TableField(value = "USER_EMAIL")
    @ApiModelProperty(value = "邮箱")
    private String userEmail;

    /**
     * 手机号码
     */
    @TableField(value = "USER_PHONE")
    @ApiModelProperty(value = "手机号码")
    private String userPhone;

    /**
     * 密码
     */
    @TableField(value = "`PASSWORD`")
    @ApiModelProperty(value = "密码")
    private String password;
}