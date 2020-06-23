package com.huayi.ljj.springcloud.util;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;


import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanMapUtil {

    public static <T> T getTransReq(String transCode,String packageName) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String targetClassName = packageName+".Req"+transCode;
        Class<?> clz = Class.forName(targetClassName);
        //创建一个需要转换为的类型的对象
        T obj = (T) clz.newInstance();
        return  obj;
    }

    public static <T extends BaseReq> T map2bean(Map<String,Object> map, String transCode,String packageName) throws Exception{
        String targetClassName = packageName+".Req"+transCode;
//
        Class<?> clz = Class.forName(targetClassName);
//        //创建一个需要转换为的类型的对象
//        T obj = (T) clz.newInstance();
        T obj = getTransReq(transCode,packageName);

        //从Map中获取和属性名称一样的值，把值设置给对象(setter方法)

        //得到属性的描述器
        BeanInfo b = Introspector.getBeanInfo(clz,Object.class);
        PropertyDescriptor[] pds = b.getPropertyDescriptors();
        for (PropertyDescriptor pd : pds) {
            //得到属性的setter方法
            Method setter = pd.getWriteMethod();
            //得到key名字和属性名字相同的value设置给属性
            setter.invoke(obj, map.get(pd.getName()));
        }
        return obj;
    }

    //把JavaBean转化为map
    public static Map<String,Object> bean2map(Object bean) throws Exception{
        Map<String,Object> map = new HashMap<>();
        //获取JavaBean的描述器
        BeanInfo b = Introspector.getBeanInfo(bean.getClass(),Object.class);
        //获取属性描述器
        PropertyDescriptor[] pds = b.getPropertyDescriptors();
        //对属性迭代
        for (PropertyDescriptor pd : pds) {
            //属性名称
            String propertyName = pd.getName();
            //属性值,用getter方法获取
            Method m = pd.getReadMethod();
            Object properValue = m.invoke(bean);//用对象执行getter方法获得属性值

            //把属性名-属性值 存到Map中
            map.put(propertyName, properValue);
        }
        return map;
    }


}
