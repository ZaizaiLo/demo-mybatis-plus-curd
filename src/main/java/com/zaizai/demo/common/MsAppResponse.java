package com.zaizai.demo.common;

import lombok.Data;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/4 11:39
 */
@Data
public class MsAppResponse {
    private String sta;
    private String message;
    private Object data;

    public MsAppResponse(String sta, String message, Object data) {
        this.sta = sta;
        this.message = message;
        this.data = data;
    }

    public MsAppResponse(String sta, String message) {
        this.sta = sta;
        this.message = message;
    }

    public MsAppResponse(Object data) {
        this.data = data;
    }
}
