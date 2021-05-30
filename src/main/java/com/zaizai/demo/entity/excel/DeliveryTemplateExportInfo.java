package com.zaizai.demo.entity.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * @description
 * @author luojiyuan
 * @date 2021-05-28 15:19
 */
@Data
@HeadFontStyle(fontName = "黑体")
@ColumnWidth(value = 18)
@ContentRowHeight(value = 10)
public class DeliveryTemplateExportInfo extends BaseRowModel {

    @ExcelProperty(value = "订单编号", index = 0)
    private String orderNum;

    @ExcelProperty(value = "配送方式", index = 1)
    private String distributionMode;

    @ExcelProperty(value = "物流单号", index = 2)
    private String logisticsNumber;

}
