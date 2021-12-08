package com.zaizai.demo.demo;

import cn.hutool.core.lang.Snowflake;
import com.alibaba.excel.EasyExcel;
import com.zaizai.demo.utils.SnowflakeIDUtil;

import static com.zaizai.demo.utils.RandomUtils.createOrderNum;

/**
 * @description
 * @author luojiyuan
 * @date 2021-11-28 19:24
 */
public class ImportFailReceiveInfo {

    public static void main(String[] args) {
        Snowflake snowflake = SnowflakeIDUtil.snowflake(1, 1);
        for (int i = 0; i < 4; i++) {
            String recordId = snowflake.nextIdStr();
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.println(recordId);
        }


        for (int i = 0; i < 4; i++) {
            String orderNum = createOrderNum("2");
            if (i % 100 == 0) {
                System.out.println();
            }
            System.out.println(orderNum);
        }


    }

}
