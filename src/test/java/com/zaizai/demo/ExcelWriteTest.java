package com.zaizai.demo;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import kafka.utils.timer.TimingWheel;
import org.apache.poi.xslf.usermodel.XSLFNotesMaster;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author luojiyuan
 * @date 2021-04-15 15:39
 */
public class ExcelWriteTest {

    @Test
    public void writeWithoutHeadTest() throws FileNotFoundException {
        OutputStream out = new FileOutputStream("withoutHead.xlsx");
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, false);
        Sheet sheet1 = new Sheet(1, 2);
        sheet1.setSheetName("firstPage");
        List<List<String>> data = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            List<String> item = new ArrayList<>();
            item.add("item0" + i);
            item.add("item1" + i);
            item.add("item2" + i);
            data.add(item);
        }
        writer.write0(data, sheet1);
        writer.finish();
    }

}
