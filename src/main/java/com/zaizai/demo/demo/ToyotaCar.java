package com.zaizai.demo.demo;

/**
 * @description
 * @author luojiyuan
 * @date 2021-07-09 10:22
 */
public class ToyotaCar extends Car {
    @Override
    protected String run(String Engine) {
        return Engine + "Started";
    }
}
