package com.zaizai.demo.dp.abstractFactoryPattern;

import com.zaizai.demo.dp.factoryPattern.BallFactory;
import com.zaizai.demo.dp.simpleFactoryPattern.Ball;
import com.zaizai.demo.dp.simpleFactoryPattern.Soccer;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-18 14:59
 */
public class SoccerFactory implements BallFactory {
    @Override
    public Ball create() {
        return new Soccer();
    }

    public Journal createJournal() {
        return new SoccerJournal();
    }

    public static void main(String[] args) {
        SoccerFactory factory = new SoccerFactory();
        Ball ball = factory.create();
        Journal journal = factory.createJournal();
        String s = ball.create();
        String s1 = journal.create();
        System.out.println(s);
        System.out.println(s1);
    }
}
