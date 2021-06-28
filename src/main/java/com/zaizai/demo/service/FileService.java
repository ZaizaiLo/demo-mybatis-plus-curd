package com.zaizai.demo.service;

import com.zaizai.demo.entity.excel.ImportInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-28 17:33
 */
public interface FileService {
    Object readExcel(MultipartFile file, ImportInfo info) throws Exception;
}
