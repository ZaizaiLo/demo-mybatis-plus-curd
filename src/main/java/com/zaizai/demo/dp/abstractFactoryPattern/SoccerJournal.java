package com.zaizai.demo.dp.abstractFactoryPattern;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-18 14:12
 */
public class SoccerJournal implements Journal{
    @Override
    public String create() {
        return "give a soccer journal to you...";
    }
}
