package com.zaizai.demo.thread;

/**
 * @description
 * @author luojiyuan
 * @date 2021-08-26 15:24
 */
public class DeadLockDemo {

    private static String resource_a = "A";
    private static String resource_b = "B";

    public static void deadLock() {
        Thread tA = new Thread(() -> {
            synchronized (resource_a) {
                System.out.println("get resource a");
                try {
                    Thread.sleep(3000);
                    synchronized (resource_b) {
                        System.out.println("get resource b");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread tB = new Thread(() -> {
            synchronized (resource_b) {
                System.out.println("get resource b");
                synchronized (resource_a) {
                    System.out.println("get resource a");
                }
            }
        });
        tA.start();
        tB.start();
    }
}
