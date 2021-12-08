package com.zaizai.demo.demo;

import com.alibaba.fastjson.JSONArray;

import java.util.List;

/**
 * @description
 * @author luojiyuan
 * @date 2021-11-06 2:07
 */
public class Testsgsg {
    public static void main(String[] args) {
        String batchNumsStr = "[\"1448842551708377090\",\"1448842551708377092\"]";
        List<String> batchNums = JSONArray.parseArray(batchNumsStr, String.class);
        batchNums.forEach(System.out::println);
    }
}
