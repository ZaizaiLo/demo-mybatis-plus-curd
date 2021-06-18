package com.zaizai.demo.dp.factoryPattern;

import com.zaizai.demo.dp.simpleFactoryPattern.Ball;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-18 14:52
 */
public class BasketBallFactory implements BallFactory {
    @Override
    public Ball create() {
        System.out.println("Basketball Created");
        return null;
    }
}
