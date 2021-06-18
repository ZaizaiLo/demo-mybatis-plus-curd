package com.zaizai.demo.dp.factoryPattern;

import com.zaizai.demo.dp.simpleFactoryPattern.Ball;
import com.zaizai.demo.dp.simpleFactoryPattern.Soccer;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-18 14:16
 */
public class SoccerFactory implements BallFactory{
    @Override
    public Ball create() {
        System.out.println("Soccer Created");
        return null;
    }

    public static void main(String[] args) {
        SoccerFactory soccerFactory = new SoccerFactory();
        Ball ball = soccerFactory.create();
    }
}
