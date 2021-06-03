package com.zaizai.demo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-03 10:34
 */
//@Component
public class RedisKeyExpirationListener extends KeyExpirationEventMessageListener {

    @Autowired
    RedisTemplate redisTemplate;


    public RedisKeyExpirationListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }

    /**
     * 针对 redis 数据失效事件，进行数据处理
     * @param message
     * @param pattern
     */
    @Override
    public void onMessage(Message message, byte[] pattern) {

        // 获取到失效的 key，进行取消订单业务处理
        String expiredKey = message.toString();
        System.out.println(expiredKey);
        RedisSerializer<String> serializer = redisTemplate.getValueSerializer();
        // 获取到失效的 key
        String orderNo = message.toString();
        System.out.println(orderNo);

    }




}
