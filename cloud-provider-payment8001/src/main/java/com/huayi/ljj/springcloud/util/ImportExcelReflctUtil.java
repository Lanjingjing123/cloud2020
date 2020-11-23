package com.huayi.ljj.springcloud.util;

import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.util-ImportExcelReflctUtil
 * date: 2020/11/11 18:13
 */
public class ImportExcelReflctUtil {

    public static <T> T getTransReq(String content,Class clz) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        //创建一个需要转换为的类型的对象
        T obj = (T) clz.newInstance();
        return  obj;
    }
}
