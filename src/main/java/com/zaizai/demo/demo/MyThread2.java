package com.zaizai.demo.demo;

import cn.hutool.core.lang.Snowflake;
import com.zaizai.demo.utils.SnowflakeIDUtil;

/**
 * @description
 * @author luojiyuan
 * @date 2021-05-26 10:10
 */
public class MyThread2 implements Runnable {
    Snowflake snowflake = SnowflakeIDUtil.snowflake(1, 1);

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("第" + i + "次:" + snowflake.nextIdStr());
        }

    }
}
