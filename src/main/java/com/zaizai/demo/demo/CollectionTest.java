package com.zaizai.demo.demo;

import scala.reflect.internal.Trees;

import java.util.*;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-24 10:04
 */
public class CollectionTest {

    public static void main(String[] args) {
//        Map<String, String> map = new LinkedHashMap<>();


//        map.put("apple", "苹果");
//        map.put("banana", "香蕉");
//        map.put("peach", "桃子");
//        map.put("grape", "葡萄");
//        map.put("melon", "瓜");
//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry) iterator.next();
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }

        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("eeee");

        list.forEach(item -> {
            System.out.println(item);
        });

    }

}
