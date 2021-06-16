package com.zaizai.demo.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.redis.util.RedisLockRegistry;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * @className: RedisDistributeLock
 * @description:
 * @author: rainple
 * @create: 2020-12-15 10:50
 **/

public class RedisDistributeLock {

    private final static Logger log = LoggerFactory.getLogger(RedisDistributeLock.class);

    private RedisLockRegistry redisLockRegistry;

    public RedisDistributeLock() {
    }

    public RedisDistributeLock(RedisLockRegistry redisLockRegistry) {
        this.redisLockRegistry = redisLockRegistry;
    }

    public Lock lock(String key) {
        return lock(key,0);
    }

    public Lock lock(String key, int timeout) {
        Lock lock = redisLockRegistry.obtain(key);
        try {
            boolean tryLock = lock.tryLock(timeout, TimeUnit.SECONDS);
            log.info("获取锁结果：{}",tryLock);
            return tryLock ? lock : null;
        } catch (InterruptedException e) {
            log.error("lock tryLock timeout error",e);
        }
        return null;
    }

    public void unLock(Lock lock) {
        if (lock != null) {
            lock.unlock();
        }
    }

}
