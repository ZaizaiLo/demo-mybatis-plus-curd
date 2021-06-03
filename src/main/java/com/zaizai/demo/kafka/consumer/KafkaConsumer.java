package com.zaizai.demo.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-03 11:53
 */
@Component
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "zaizai", groupId = "group_id")
    public void consume(String message) {
        log.info("## consume message: {}", message);
    }
}
