package com.zaizai.demo.entity.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/4 14:26
 */
@Data
public class AddUserVo {


    /**
     * 用户名
     */
    @NotBlank(message = "用户名不可为空")
    private String userName;

    /**
     * 性别
     */
    private String userGender;

    /**
     * 昵称
     */
    @NotBlank(message = "昵称不可为空")
    private String nickname;

    /**
     * 邮箱
     */
    @NotBlank(message = "邮箱不可为空")
    @Email
    private String userEmail;

    /**
     * 手机号码
     */
    @NotBlank(message = "手机不可为空")
    private String userPhone;

    /**
     * 密码
     */
    private String password;
}
