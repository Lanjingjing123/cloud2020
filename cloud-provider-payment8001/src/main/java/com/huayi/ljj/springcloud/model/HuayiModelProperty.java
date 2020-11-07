package com.huayi.ljj.springcloud.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.model-HuayiModelProperty
 * date: 2020/11/7 16:06
 *
 * 规格	厚度	库存(支)	成本价	重量(kg)	种类	交易日期
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class HuayiModelProperty extends BaseRowModel {

    /**
     * value: 表头名称
     * index: 列的号, 0表示第一列
     */
    @ExcelProperty(value = "规格", index = 0)
    private String specification;

    @ExcelProperty(value = "厚度", index = 1)
    private String thickness;

    @ExcelProperty(value = "库存(支)", index = 2)
    private BigDecimal quanlity;

    @ExcelProperty(value = "成本价", index = 3)
    private BigDecimal costPrice;

    @ExcelProperty(value = "重量(kg)", index = 4)
    private BigDecimal weightPer;

    @ExcelProperty(value = "种类", index = 5)
    private String kinds;

    @ExcelProperty(value = "交易日期", index = 6)
    private String tranDt;

}
