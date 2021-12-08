package com.zaizai.demo.config;

import java.util.Properties;

/**
 * @description
 * @author luojiyuan
 * @date 2021-10-12 17:35
 */
public class AlipayConfig {

    public static void setConfig(Properties prop) {

        //应用的私钥，需要保管好，应用的公钥存储在支付宝服务端
        //alipay.appconfig.privatekey =

        //应用公钥证书存放路径
        //alipay.appconfig.appcertpath =

        //支付宝公钥证书存放路径
        //alipay.appconfig.alipaycertpath =

        //支付宝根证书存放路径
        //alipay.appconfig.alipayrootcertpath =

        //开放平台申请应用的Id
        //alipay.appconfig.appid = 2019111969301227

        //支付宝网关地址（线上）
        //alipay.appconfig.gateway = https://openapi.alipay.com/gateway.do

        prop.put("spring.datasource.url", "jdbc:oracle:thin:@10.92.230.128:1530/yyzb");
        prop.put("spring.datasource.username", "YYZB_OPEN");
        prop.put("spring.datasource.password", "YYzb_#321");
    }
}
