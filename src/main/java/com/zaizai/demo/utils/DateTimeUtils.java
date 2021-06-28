package com.zaizai.demo.utils;

import lombok.extern.slf4j.Slf4j;

import java.beans.PropertyEditorSupport;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

/**
 * @description Date & Time Tools,Classified by data type.
 * @author luojiyuan
 * @date 2021-01-26 14:25
 */
@Slf4j
public class DateTimeUtils extends PropertyEditorSupport {

    //时间格式
    public static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    //每秒=1000毫秒
    public static final long MILLIS_PER_SECOND = 1000;
    //每分钟=60秒
    public static final long MILLIS_PER_MINUTE = 60 * MILLIS_PER_SECOND;
    //每小时=60分钟
    public static final long MILLIS_PER_HOUR = 60 * MILLIS_PER_MINUTE;
    //每天=24小时
    public static final long MILLIS_PER_DAY = 24 * MILLIS_PER_HOUR;

    /**********************************************************************************************
     *                                       boolean                                             *
     ********************************************************************************************/


    /**
     * 判断两个日期是否为同一天
     * @param date1 对比日期1 Date类型
     * @param date2 对比日期2 Date类型
     * @return boolean
     */
    public static boolean isSameDay(Date date1, Date date2) {
        LocalDate localDate1 = date2LocalDate(date1);
        LocalDate localDate2 = date2LocalDate(date2);
        return localDate1.isEqual(localDate2);
    }

    /**
     * 判断第二个时间是否比第一个时间大
     * @param date1
     * @param date2
     * @return 布尔值
     */
    public static boolean isTheTimeAfter(Date date1, Date date2) {
        LocalDateTime localDate1 = date2LocalDateTime(date1);
        LocalDateTime localDate2 = date2LocalDateTime(date2);
        return localDate2.isAfter(localDate1);
    }


    /**********************************************************************************************
     *                                       String                                              *
     ********************************************************************************************/

    /**
     * 获取当前日期的字符串：yyyy-MM-dd
     * @return String
     */
    public static String getCurrentDateStr() {
        return LocalDate.now().format(DATE_FORMATTER);
    }

    /**
     * 获取当前日期时间的字符串：yyyy-MM-dd HH:mm:ss
     * @return String
     */
    public static String getCurrentDateTimeStr() {
        return LocalDateTime.now().format(DATETIME_FORMATTER);
    }

    /**
     * 获取当月的起始时间
     * 时间格式:yyyy-MM-mm 00:00:00
     * @return String
     */
    public static String getMonthStartTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime firstDay = dateTime.with(TemporalAdjusters.firstDayOfMonth());
        firstDay = firstDay.withHour(0).withMinute(0).withSecond(0);
        return DATETIME_FORMATTER.format(firstDay);
    }

    /**
     * Date类型转字符串
     * @param date
     * @return
     */
    public static String date2String(Date date) {
        LocalDateTime dateTime = date2LocalDateTime(date);
        return DATETIME_FORMATTER.format(dateTime);
    }

    /**
     * 获取昨天的00:00:00或23:59:59
     * @param sign 0->00:00:00、1->23:59:59
     * @return String
     */
    public static String getYesterdayStartAndEnd(int sign) {
        LocalDateTime now = LocalDateTime.now();
        if (sign == 0) {
            now = now.minusDays(1).withHour(0).withMinute(0).withSecond(0);
            return DATETIME_FORMATTER.format(now);
        } else if (sign == 1) {
            now = now.minusDays(1).withHour(23).withMinute(59).withSecond(59);
            return DATETIME_FORMATTER.format(now);
        }
        return null;
    }

    /**
     *
     * @param sign 0->00:00:00、1->23:59:59
     * @return
     */
    public static String getStartAndEndOfDays(int sign) {
        LocalDateTime now = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        if (sign == 0) {
            return DATETIME_FORMATTER.format(now);
        } else if (sign == 1) {
            now = now.withHour(23).withMinute(59).withSecond(59);
            return DATETIME_FORMATTER.format(now);
        }
        return null;
    }

    /**
     *
     * @param sign 0->今日零点 1->当前时间
     * @return
     */
    public static LocalDateTime getStartAndEndOfDay(int sign) {
        if (sign == 0) {
            return LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        } else if (sign == 1) {
            return LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        } else {
            return null;
        }
    }

    /**
     * 获取时间的0点0分0时
     * @param date
     * @return
     */
    public static Date getDate0Hour0Min0Sec(Date date) {
        LocalDateTime localDateTime = date2LocalDateTime(date)
                .withHour(0).withMinute(0).withSecond(0);
        return localDateTime2Date(localDateTime);
    }


    /**********************************************************************************************
     *                                    DateTime                                               *
     ********************************************************************************************/

    /**
     * 时间戳转LocalDateTime
     * @param timeStamp 时间戳
     * @return LocalDateTime
     */
    public static LocalDateTime timeStamp2LocalDateTime(long timeStamp) {
        return LocalDateTime.ofEpochSecond(timeStamp, 0, ZoneOffset.ofHours(8));
    }


    /**
     * Date类型转LocalDate类型
     * @param date 传入Date类型时间
     * @return LocalDate
     */
    public static LocalDate date2LocalDate(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * Date类型转LocalDateTime类型
     * @param date 传入Date类型时间
     * @return LocalDateTime
     */
    public static LocalDateTime date2LocalDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    /**
     * LocalDateTime类型转Date类型
     * @param localDateTime 传入LocalDateTime类型时间
     * @return Date
     */
    public static Date localDateTime2Date(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * LocalDate类型转Date类型
     * @param localDate 传入LocalDate类型时间
     * @return Date
     */
    public static Date localDate2Date(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }


    /**
     * 获取零点整点前后五分钟，可用作查询每天整点产生的数据的查询范围
     * @param date Date对象
     * @param diffDays 调用时间减掉天数数量
     * @param sign 0->前一天23:50分 1->获取后一天00:05分
     * @return Date格式时间
     */
    public static Date getBetweenTwoDays(Date date, int diffDays, int sign) {
        LocalDateTime localDateTime = date2LocalDateTime(date)
                .withHour(23).withMinute(55).withSecond(0).minusDays(diffDays);
        if (sign == 0) {
            return localDateTime2Date(localDateTime);
        } else if (sign == 1) {
            return localDateTime2Date(localDateTime.plusMinutes(10));
        }
        return null;
    }

    /**
     * 获取上n个小时整点小时时间
     * @param n 倒推小时数
     * @return LocalDateTime
     */
    public static LocalDateTime getLastTimeSharp(int n) {
        return LocalDateTime.now().minusHours(n).withMinute(0).withSecond(0);
    }

    /**
     * 获取上n个小时整点小时时间
     * @param time 入参时间
     * @param n 倒推小时数
     * @return LocalDateTime
     */
    public static LocalDateTime getLastTimeSharp(LocalDateTime time, int n) {
        return time.minusHours(n).withMinute(0).withSecond(0);
    }

    /**********************************************************************************************
     *                                    Timestamp                                              *
     ********************************************************************************************/

    /**********************************************************************************************
     *                                    Number                                                 *
     ********************************************************************************************/

    /**
     * 获取当天与今年第一天的相差天数
     * @return long
     */
    public static long getDiffDayFromFirstDayOfYear() {
        LocalDate date = LocalDate.now();
        LocalDate firstDayOfYear = date.with(TemporalAdjusters.firstDayOfYear());
        return date.toEpochDay() - firstDayOfYear.toEpochDay();
    }

    /**
     * 计算前后两个日期中间有多少天
     * @param date1 String类型的"yyyy-MM-dd"
     * @param date2 String类型的"yyyy-MM-dd"
     * @return long
     */
    public static long getDiffDays(String date1, String date2) {
        LocalDate localDate1 = LocalDate.parse(date1, DateTimeFormatter.ISO_DATE);
        LocalDate localDate2 = LocalDate.parse(date2, DateTimeFormatter.ISO_DATE);
        if (localDate2.isAfter(localDate1)) {
            //相减之后得到long类型的值
            return localDate2.toEpochDay() - localDate1.toEpochDay() - 1;
        } else if (localDate1.isEqual(localDate2)) {
            return 0L;
        } else {
            return 0L;
        }
    }

    /**
     * 指定日期加指定天数
     */
    public static Date addDate(Date date, long day) {
        long time = date.getTime(); // 得到指定日期的毫秒数
        day = day * 24 * 60 * 60 * 1000; // 要加上的天数转换成毫秒数
        time += day; // 相加得到新的毫秒数
        return new Date(time); // 将毫秒数转换成日期
    }

    /**
     * 给指定日期加一年
     *
     * @param date
     * @param addyear
     * @return
     */
    public static Date addYear(Date date, int addyear) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, addyear);
        return cal.getTime();
    }

    /**
     * 获取当前时间至今天00点
     */
    public static Integer newDateToDay() {
        Date nowDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        int dateNumber = (calendar.get(Calendar.HOUR_OF_DAY) * 60 * 60) + (calendar.get(Calendar.MINUTE) * 60)
                + (calendar.get(Calendar.SECOND));
        return 86400 - dateNumber;
    }

    /**
     *
     * @param nowTime   当前时间
     * @param startTime    开始时间
     * @param endTime   结束时间
     * @return
     * @author sunran   判断当前时间在时间区间内
     */
    public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取当天日期的00:00:00
     * @return
     */
    public static Date firstToday() {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(new Date().getTime()),
                ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        Date today = Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
        return today;
    }

    //获取昨天的：00:00:00
    public static Date yesterdayFirst() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //设置为昨天日期
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(calendar.getTimeInMillis()),
                ZoneId.systemDefault());
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MIN);
        Date first = Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
        return first;

    }

    /**
     * 获取昨天的：23:59:59
     *
     * @return
     */
    public static Date yesterdayLast(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //设置为昨天日期
        calendar.add(Calendar.DAY_OF_MONTH, (-1) * i);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(calendar.getTimeInMillis()),
                ZoneId.systemDefault());
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
        Date last = Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
        return last;
    }

    /**
     * 获取当天的00:59:59
     * @return
     */
    public static Date todays() {
        return localDateTime2Date(getStartAndEndOfDay(0).withMinute(59).withSecond(59));
    }

    /**
     * 获取上n个小时整点小时时间
     *
     * @param date
     * @return
     */
    public static Date getLastHourTime(Date date, int n) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.set(Calendar.MINUTE, 0);
        ca.set(Calendar.SECOND, 0);
        ca.set(Calendar.MILLISECOND, 0);
        ca.set(Calendar.HOUR_OF_DAY, ca.get(Calendar.HOUR_OF_DAY) - n);
        date = ca.getTime();
        return date;
    }


    public static void main(String[] args) {
        log.info(getCurrentDateStr());
        log.info(getCurrentDateTimeStr());
        log.info(getMonthStartTime());
        log.info("昨天" + getYesterdayStartAndEnd(0));
        log.info("昨天" + getYesterdayStartAndEnd(1));
        log.info(String.valueOf(isSameDay(new Date(), new Date())));
        log.info("相差天数" + getDiffDayFromFirstDayOfYear());
        log.info("算两天间的时间" + getBetweenTwoDays(new Date(), 1, 0));
        log.info("算两天的时间差" + getDiffDays("2021-01-15", "2021-01-20"));
        log.info("今日起始" + getStartAndEndOfDay(0).format(DATETIME_FORMATTER) + "今日结束" + getStartAndEndOfDay(1).format(DATETIME_FORMATTER));
        log.info("今日" + todays());
        log.info("获取昨天的" + yesterdayLast(new Date(), 2));
        log.info("获取昨天的：00:00:00" + yesterdayFirst());
        log.info("获取上n个小时整点小时时间" + getLastHourTime(yesterdayFirst(), 24));
        log.info("指定日期加指定天数" + addDate(new Date(), -1));
        log.info("上个小时" + getLastTimeSharp(0).format(DATETIME_FORMATTER));
        log.info("上个小时" + getLastTimeSharp(1).format(DATETIME_FORMATTER));
    }

}
