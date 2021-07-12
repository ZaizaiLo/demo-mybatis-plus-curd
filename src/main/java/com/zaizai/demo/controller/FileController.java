package com.zaizai.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.zaizai.demo.common.ResultModel;
import com.zaizai.demo.entity.ExportData;
import com.zaizai.demo.entity.excel.ImportInfo;
import com.zaizai.demo.service.FileService;
import com.zaizai.demo.utils.RandomUtils;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author luojiyuan
 * @date 2021-04-06 10:02
 */
@Slf4j
@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    private FileService fileService;


    @PostMapping("upload")
    public ResultModel<Void> fileTest() {
        log.info("调用成功");
        return ResultModel.successMessage("1");
    }

    @ApiOperation(value = "导出excel")
    @GetMapping(value = "/export")
    public void exportData(HttpServletResponse response) throws IOException {

        String fileName = RandomUtils.creatFileName();
        response.addHeader("Content-Type", "application/vnd-mx.excel");
        response.addHeader("Content-Disposition", "attachment;filename=" + fileName + ".xlsx");
        response.setCharacterEncoding("UTF-8");
        List<ExportData> list = new ArrayList<>();
        ExportData data = new ExportData();
        data.setCount(100);
        data.setId("1");
        data.setName("test01");
        list.add(data);
        EasyExcel.write(response.getOutputStream(), ExportData.class).sheet("xxx").doWrite(list);
    }


    @PostMapping(value = "readExcel")
    public Object readExcel(@RequestParam(value = "multipartFile") MultipartFile excel) throws Exception {
        log.info("调用成功");
        return fileService.readExcel(excel, new ImportInfo());
    }

    @PostMapping("sendData")
    public List<Object> getData() {
        List<Object> objects = fileService.sendData();
        log.info("返回：{}", objects);
        return objects;
    }


}
