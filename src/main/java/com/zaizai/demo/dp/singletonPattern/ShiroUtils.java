package com.zaizai.demo.dp.singletonPattern;

import cn.hutool.db.Session;
import com.zaizai.demo.utils.DateTimeUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-18 15:56
 */
public class ShiroUtils {
    public static Session session;

    public static Session getSession() {
        if (session == null) {
            synchronized (ShiroUtils.class) {
                if (session == null) {
//                    session = SecurityUtils.getSubject().getSession();
                }
            }
        }
        return session;
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse("2021-06-17 15:41:48");
        String string = "2021-06-17 15:41:48";
//        long confirmTimeStamp =
//                LocalDateTime.parse(DateTimeUtils.date2String(date)).plusDays(15).toInstant(ZoneOffset.ofHours(8)).getEpochSecond();
//        long maxDeliveryTime =
//                LocalDateTime.parse(string, DateTimeUtils.DATETIME_FORMATTER).plusDays(15).toInstant(ZoneOffset.ofHours(8)).getEpochSecond();
//        System.out.println(confirmTimeStamp);
//        System.out.println(maxDeliveryTime);
        long parse1 =
                LocalDateTime.parse(string, DateTimeUtils.DATETIME_FORMATTER).plusDays(15).toInstant(ZoneOffset.ofHours(8)).getEpochSecond();
        long parse2 =
                DateTimeUtils.date2LocalDateTime(date).plusDays(15).toInstant(ZoneOffset.ofHours(8)).getEpochSecond();
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(date);
        System.out.println(string);

    }

}
