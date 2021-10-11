package com.zaizai.demo.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description
 * @author luojiyuan
 * @date 2021-10-08 11:49
 */
public class StringJoin {

    public static void main(String[] args) {


        AtomicInteger atomicInteger = new AtomicInteger(1);
        for (int i = 0; i < 3; i++) {
            String s = "ABC";
            if (atomicInteger.get() > 1) {
                s = StringUtils.join(s, "_" + atomicInteger);
            }
            atomicInteger.getAndIncrement();
            System.out.println(s);
        }
    }
}
