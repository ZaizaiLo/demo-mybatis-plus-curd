package com.zaizai.demo.dp.simpleFactoryPattern;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-18 11:23
 */
public class BasketBall implements Ball {
    @Override
    public String create() {
        return "Basketball Created";
    }
}
