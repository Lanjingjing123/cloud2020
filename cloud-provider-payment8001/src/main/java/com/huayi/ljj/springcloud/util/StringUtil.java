package com.huayi.ljj.springcloud.util;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.util-StringUtil
 * date: 2020/11/5 17:10
 */
public class StringUtil {
    public  static Boolean isNotEmpty(String str){

        if (str==null||str.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    public static Boolean isEmpty(String str){

        if (str==null || str.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String empty = "";
        System.out.println(isEmpty(empty));
        System.out.println(isNotEmpty(empty));
    }

}
