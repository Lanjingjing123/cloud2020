package com.ljj.trans;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.ljj.trans-Test
 * date: 2020/11/7 14:41
 */

import com.alibaba.excel.metadata.Sheet;
import com.huayi.ljj.springcloud.util.ExcelUtil;
import com.huayi.ljj.springcloud.model.TableHeaderExcelProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 测试类
 * @author: chenmingjian
 * @date: 19-4-4 15:24
 */
public class Test {

    /**
     * 读取少于1000行的excle
     */
    @org.junit.Test
    public void readLessThan1000Row(){
        String filePath = "/home/chenmingjian/Downloads/测试.xlsx";
        List<Object> objects = ExcelUtil.readLessThan1000Row(filePath);
        objects.forEach(System.out::println);
    }

    /**
     * 读取少于1000行的excle，可以指定sheet和从几行读起
     */
    @org.junit.Test
    public void readLessThan1000RowBySheet(){
        String filePath = "C:/Users/ljj/Documents/WPS Cloud Files/895391883/团队文档/华亿钢铁/出货记录11月.xlsx";
        // 从第三个sheet，第二行开始-index=1:第二行
        Sheet sheet = new Sheet(1, 2);
        sheet.setSheetName("方管");
        List<Object> objects = ExcelUtil.readLessThan1000RowBySheet(filePath,sheet);
        objects.forEach(System.out::println);
    }

    /**
     * 读取大于1000行的excle
     * 带sheet参数的方法可参照测试方法readLessThan1000RowBySheet()
     */
    @org.junit.Test
    public void readMoreThan1000Row(){
        String filePath = "/home/chenmingjian/Downloads/测试.xlsx";
        List<Object> objects = ExcelUtil.readMoreThan1000Row(filePath);
        objects.forEach(System.out::println);
    }


    /**
     * 生成excle
     * 带sheet参数的方法可参照测试方法readLessThan1000RowBySheet()
     */
    @org.junit.Test
    public void writeBySimple(){
        String filePath = "E:/home/excel/writeExcel1.xlsx";
        List<List<Object>> data = new ArrayList<>();
        data.add(Arrays.asList("111","222","333"));
        data.add(Arrays.asList("111","222","333"));
        data.add(Arrays.asList("111","222","333"));
        List<String> head = Arrays.asList("表头1", "表头2", "表头3");
        ExcelUtil.writeBySimple(filePath,data,head);
    }


    /**
     * 生成excle, 带用模型
     * 带sheet参数的方法可参照测试方法readLessThan1000RowBySheet()
     */
    @org.junit.Test
    public void writeWithTemplate(){
        String filePath = "E:/home/excel/测试.xlsx";
        ArrayList<TableHeaderExcelProperty> data = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            TableHeaderExcelProperty tableHeaderExcelProperty = new TableHeaderExcelProperty();
            tableHeaderExcelProperty.setName("cmj" + i);
            tableHeaderExcelProperty.setAge(22 + i);
            tableHeaderExcelProperty.setSchool("清华大学" + i);
            tableHeaderExcelProperty.setSex(i+"");
            data.add(tableHeaderExcelProperty);
        }
        ExcelUtil.writeWithTemplate(filePath,data);
    }


    /**
     * 生成excle, 带用模型,带多个sheet
     */
    @org.junit.Test
    public void writeWithMultipleSheel(){
        ArrayList<ExcelUtil.MultipleSheelPropety> list1 = new ArrayList<>();
        for(int j = 1; j < 4; j++){
            ArrayList<TableHeaderExcelProperty> list = new ArrayList<>();
            for(int i = 0; i < 4; i++){
                TableHeaderExcelProperty tableHeaderExcelProperty = new TableHeaderExcelProperty();
                tableHeaderExcelProperty.setName("cmj" + i);
                tableHeaderExcelProperty.setAge(22 + i);
                tableHeaderExcelProperty.setSchool("清华大学" + i);
                list.add(tableHeaderExcelProperty);
            }

            Sheet sheet = new Sheet(j, 0);
            sheet.setSheetName("test" + j);

            ExcelUtil.MultipleSheelPropety multipleSheelPropety = new ExcelUtil.MultipleSheelPropety();
            multipleSheelPropety.setData(list);
            multipleSheelPropety.setSheet(sheet);

            list1.add(multipleSheelPropety);

        }

        ExcelUtil.writeWithMultipleSheel("E:/home/excel/aaa.xlsx",list1);

    }


}


