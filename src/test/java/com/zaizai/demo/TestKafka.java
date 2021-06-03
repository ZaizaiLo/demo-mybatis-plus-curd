package com.zaizai.demo;

import cn.hutool.core.lang.UUID;
import com.zaizai.demo.kafka.provider.KafkaProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-03 14:06
 */

@SpringBootTest
public class TestKafka {

    @Autowired
    private KafkaProvider provider;

    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            long orderId = i+1;
            String orderNum = UUID.randomUUID().toString();
            provider.sendMessage(orderId, orderNum, LocalDateTime.now());
        }

        TimeUnit.MINUTES.sleep(1);

    }

}
