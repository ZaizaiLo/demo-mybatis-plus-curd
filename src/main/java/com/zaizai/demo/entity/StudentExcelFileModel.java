package com.zaizai.demo.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.metadata.BaseRowModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author jin
 * @Description: TDD
 * @date 2020/12/25 11:25
 */
@Data
public class StudentExcelFileModel extends BaseRowModel {
    /**
     * value: 表头名称
     * index: 列的号, 0表示第一列
     */
    //学员编号
    @ExcelProperty(value = "序号", index = 0)
    private Long id;
    //学员姓名
    @ExcelProperty(value = "姓名", index = 1)
    private String name;
    //学员手机号码
    @ExcelProperty(value = "手机", index = 2)
    private String phone;
    //学员qq号
    @ExcelProperty(value = "qq", index = 3)
    private String qq;
    //学员微信号
    @ExcelProperty(value = "微信", index = 4)
    private String wechat;
    //学员性别
    @ExcelProperty(value = "性别", index = 5)
    private Integer gender;
    //上课城区
    @ExcelProperty(value = "上课城区", index = 6)
    private Integer areaid;
    //上课地址
    @ExcelProperty(value = "上课地址", index = 7)
    private String address;
    //年级
    @ExcelProperty(value = "年级", index = 8)
    private Integer gradeid;
    //辅导科目
    @ExcelProperty(value = "辅导科目", index = 9)
    private String subject;
    //每周次数
    @ExcelProperty(value = "每周次数", index = 10)
    private Integer num;
    //每次时数
    @ExcelProperty(value = "每周时数", index = 11)
    private Integer hour;
    //可授课时间
    @ExcelProperty(value = "可授课时间", index = 12)
    private String teachingtimeid;
    //学员情况描述
    @ExcelProperty(value = "学员描述情况", index = 13)
    private String desc;
    //教员性别
    @ExcelProperty(value = "教员性别", index = 14)
    private Integer teacherGender;
    //教员类别
    @ExcelProperty(value = "教员类别", index = 15)
    private Integer teachertype;
    //对教员要求
    @ExcelProperty(value = "对教员的要求", index = 16)
    private String teacherwant;
    //支付报酬  decimal  BigDecimal
    @ExcelProperty(value = "薪资要求", index = 17)
    @NumberFormat("#.##")
    private double payment;
    //学员密码
    @ExcelProperty(value = "密码", index = 18)
    private String password;
    //学员状态
    @ExcelProperty(value = "学员状态", index = 19)
    private Integer stuStatus;
    //是否已经支付
    @ExcelProperty(value = "是否支付", index = 20)
    private Integer ispay;
    //籍贯
    @ExcelProperty(value = "籍贯", index = 21)
    private Integer nativeplace;
    //学员审核状态
    @ExcelProperty(value = "学员审核状态", index = 22)
    private Integer stuAuditstatus;
    //检索ID
    @ExcelProperty(value = "检索id", index = 23)
    private Long indexid;
    //预约情况
    @ExcelProperty(value = "预约情况", index = 24)
    private Integer appointment;
    //创建者编号
    @ExcelProperty(value = "创建者", index = 25)
    private Integer createdby;
    //创建时间
    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelProperty(value = "创建时间", index = 26)
    private Date creationdate;
    //修改者编号
    @ExcelProperty(value = "修改者", index = 27)
    private Integer modifyby;
    //修改时间
    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelProperty(value = "修改时间", index = 28)
    private Date modifyDate;
}
