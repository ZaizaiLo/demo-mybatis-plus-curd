package com.zaizai.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.zaizai.demo.entity.excel.DeliveryTemplateExportInfo;
import com.zaizai.demo.utils.poi.ExcelUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author luojiyuan
 * @date 2021-05-28 15:11
 */
@Slf4j
@RestController
@RequestMapping("logistic")
public class LogisticsFormController {

    @RequestMapping(value = "getDeliveryTemplate", method = RequestMethod.GET)
    public void writeExcel(HttpServletResponse response) throws IOException {
        List<DeliveryTemplateExportInfo> list = new ArrayList<>();
        String fileName = "发货模板";
        String sheetName = "工作簿1";
        ExcelUtil.writeExcel(response, list, fileName, sheetName, new DeliveryTemplateExportInfo());
    }



}
