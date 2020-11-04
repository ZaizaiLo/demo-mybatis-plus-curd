package com.zaizai.demo.common;

import lombok.Getter;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/4 11:00
 */
public enum CodeNums {

    SUCCESS("00", "SUCCESS"),
    ERROR("-1", "系统异常"),
    MS_ERROR("404", "调用MS失败"),
    PARAMS_ERROR("01", "参数异常"),
    SYSTEM_ERROR("02", "系统异常"),
    RESULT_CODE_ZT_EXCEPTION("-2", "中台接口异常"),
    NEED_LOGIN("10", "需要登录");

    @Getter
    private final String code;

    @Getter
    private final String desc;

    CodeNums(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
