package com.zaizai.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.zaizai.demo.common.ResultModel;
import com.zaizai.demo.entity.ExportData;
import com.zaizai.demo.utils.RandomUtils;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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





}
