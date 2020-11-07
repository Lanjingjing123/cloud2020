package com.huayi.ljj.springcloud.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.util-TableHeaderExcelProperty
 * date: 2020/11/7 14:54
 */
@EqualsAndHashCode(callSuper = true)
@Data
public  class TableHeaderExcelProperty extends BaseRowModel {

    /**
     * value: 表头名称
     * index: 列的号, 0表示第一列
     */
    @ExcelProperty(value = "姓名", index = 0)
    private String name;

    @ExcelProperty(value = "年龄",index = 1)
    private int age;

    @ExcelProperty(value = "学校",index = 2)
    private String school;

    @ExcelProperty(value ="性别",index = 3)
    private String sex;
}

