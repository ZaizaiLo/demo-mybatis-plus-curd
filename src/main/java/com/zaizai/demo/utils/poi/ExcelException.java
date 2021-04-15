package com.zaizai.demo.utils.poi;

/**
 * @author jin
 * @Description: 导出excel异常类
 * @date 2020/12/25 11:09
 */
public class ExcelException extends RuntimeException {
    public ExcelException(String message) {
        super(message);
    }
}
