package com.zaizai.demo.entity.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-28 15:47
 */
@Data
public class ImportInfo extends BaseRowModel {

    @ExcelProperty(index = 0)
    private String orderNumber;

    @ExcelProperty(index = 1)
    private String distributionMode;

    @ExcelProperty(index = 2)
    private String logisticsNumber;
}
