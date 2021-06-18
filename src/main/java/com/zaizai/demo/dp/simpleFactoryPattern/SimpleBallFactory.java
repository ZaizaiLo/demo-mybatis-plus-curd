package com.zaizai.demo.dp.simpleFactoryPattern;

import org.apache.commons.lang3.StringUtils;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-18 11:24
 */
public class SimpleBallFactory {

    public static Ball createBall(String name) {
        if (StringUtils.equals("basketball", name)) {
            return new BasketBall();
        } else if (StringUtils.equals("soccer", name)) {
            return new Soccer();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Ball soccer = SimpleBallFactory.createBall("soccer");
        System.out.println(soccer.create());
    }

}
