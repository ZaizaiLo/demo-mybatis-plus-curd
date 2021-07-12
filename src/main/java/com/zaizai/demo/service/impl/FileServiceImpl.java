package com.zaizai.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.api.R;
import com.zaizai.demo.entity.excel.ImportInfo;
import com.zaizai.demo.service.FileService;
import com.zaizai.demo.utils.poi.ExcelUtil;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-28 17:34
 */
@Slf4j
@Service
public class FileServiceImpl implements FileService {


    private List<Object> bbb;

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public Object readExcel(MultipartFile file, ImportInfo info) throws Exception {

        List<Object> objects = ExcelUtil.readExcel(file, info);
        log.info("导入excel内容:{}", objects);
        bbb = objects;

        return objects;
    }

    @Override
    public List<Object> sendData() {
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");

        redisTemplate.boundHashOps("ThisIsAKey").put("key", a);
        return bbb;
    }


}
