package com.huayi.ljj.springcloud.util;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public  class TransJnnoGenerator {

    private static int seq = 0;

    public static String generator(){

        // 时间+10位随机数
        String date14 = DateUtil.getDate14();
        Random random = new Random();
        String str = "";
        // 获取10个随机数
        for (int i =0;i<10;i++){
            str += String.valueOf(random.nextInt(10));
        }
        if (seq<10){
            str += seq;
            seq++;
        }else{
            seq = 0;
            str += seq;
        }

        return date14+str;
    }

    public static void main(String[] args) {
        String generater = generator();
        System.out.println(generater);

    }
}
