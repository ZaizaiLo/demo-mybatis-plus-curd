package com.zaizai.demo.service.impl;

import com.alibaba.excel.ExcelReader;
import com.zaizai.demo.entity.excel.ImportInfo;
import com.zaizai.demo.service.FileService;
import com.zaizai.demo.utils.listener.ExcelListener;
import com.zaizai.demo.utils.poi.ExcelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-28 17:34
 */
@Slf4j
@Service
public class FileServiceImpl implements FileService {


    @Override
    public Object readExcel(MultipartFile file, ImportInfo info) throws Exception {

        List<Object> objects = ExcelUtil.readExcel(file, info);
        log.info("导入excel内容:{}", objects);
        log.info("缓存excel内容:{}", listener.getDatas());

        return objects;
    }


}
