package com.zaizai.demo.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * @author jin
 * @Description: 雪花id
 * @date 2020/12/29 15:24
 */
public class SnowflakeIDUtil {


    public static Snowflake snowflake(long workerId, long datacenterId) {
        return IdUtil.createSnowflake(workerId, datacenterId);
    }

}
