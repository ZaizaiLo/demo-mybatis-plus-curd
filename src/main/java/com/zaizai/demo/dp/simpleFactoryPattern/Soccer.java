package com.zaizai.demo.dp.simpleFactoryPattern;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-18 11:22
 */
public class Soccer implements Ball {
    @Override
    public String create() {
        return "Soccer Created";
    }
}
