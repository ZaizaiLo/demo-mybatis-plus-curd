package com.zaizai.demo.demo;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 * @description
 * @author luojiyuan
 * @date 2021-06-07 14:34
 */
@Slf4j
public class DelayQueue {


    public static void redisDelayQueueTest() {

        Jedis jedis = new Jedis();

        // 实际开发建议使用业务 ID 和随机生成的唯一 ID 作为 value, 随机生成的唯一 ID 可以保证消息的唯一性, 业务 ID 可以避免 value 携带的信息过多
//        String orderId1 = UUID.randomUUID().toString();
//        jedis.zadd("new_order_list", System.currentTimeMillis() + 10000, orderId1);
//
//        String orderId2 = UUID.randomUUID().toString();
//        jedis.zadd("new_order_list", System.currentTimeMillis() + 10000, orderId2);
        for (int i = 1; i <= 500; i++) {
            String orderId = UUID.randomUUID().toString();
            String orderStr = orderId + i;
            jedis.zadd("new_order_list", System.currentTimeMillis() + 10000, orderStr);
        }
        new Thread(() -> {

            while (true) {
                log.info(String.valueOf(System.currentTimeMillis()));
                Set<String> resultSet;
                resultSet = jedis.zrangeByScore("new_order_list", 0, System.currentTimeMillis(), 0, 1);
                if (CollectionUtil.isEmpty(resultSet)) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }

                } else {
                    List<String> list = new ArrayList<>(resultSet);
                    // 移除数据获取到的数据
                    if (jedis.zrem("new_order_list", list.get(0)) > 0) {
                        String orderId = list.get(0);
                        log.info("orderId===={}:", orderId);
                        try {
                            handleMsg(orderId);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

    }


    public static void handleMsg(String msg) throws InterruptedException {
        log.info(" ===================={}：的订单已经被取消", msg);
        Thread.sleep(2000);
    }

    public static void main(String[] args) {
        redisDelayQueueTest();

    }
}
