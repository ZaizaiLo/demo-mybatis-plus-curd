package com.zaizai.demo;

import cn.hutool.core.lang.Snowflake;
import com.alibaba.fastjson.JSONObject;
import com.zaizai.demo.utils.SnowflakeIDUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description
 * @author luojiyuan
 * @date 2021-05-25 11:00
 */
@Slf4j
public class DemoTestCase {

    @Test
    public void test() {

//        LocalDateTime now = LocalDateTime.now();
//        log.info("日期1：{}", JSONObject.toJSONString(now));
//        log.info("日期2：{}", JSONObject.toJSONString(new Date()));
//        System.out.println(now);
//        System.out.println(new Date());

        Snowflake snowflake = SnowflakeIDUtil.snowflake(1, 1);
        for (int i= 1;i<=100;i++){
            System.out.println("第"+i+"次:"+snowflake.nextIdStr());
        }
    }
}
