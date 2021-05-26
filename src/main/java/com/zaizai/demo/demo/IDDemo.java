package com.zaizai.demo.demo;

/**
 * @description
 * @author luojiyuan
 * @date 2021-05-26 9:57
 */
public class IDDemo {


    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        t1.run();
//        t2.run();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) continue;
            System.out.println("第" + i + "次:");
        }
    }


}
