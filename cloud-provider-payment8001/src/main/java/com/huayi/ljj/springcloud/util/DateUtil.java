package com.huayi.ljj.springcloud.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static String getDate8(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String date = sdf.format(new Date());
        return  date;
    }

    public static String getTime6(){
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        String time = sdf.format(new Date());
        return  time;
    }
    public static String getDate14(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String date = sdf.format(new Date());
        return  date;
    }


    public static String getLastDate8(){
        //获取前一天的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Date time = calendar.getTime();
        String lastDate = df.format(time);
        return lastDate;
    }
    public static void main(String[] args) {
        String date8 = getDate8();
        System.out.println(date8);

        String time6 = getTime6();
        System.out.println(time6);
        String time14 = getDate14();
        System.out.println(time14);
        String lastDate8 = getLastDate8();
        System.out.println("lastDate:"+lastDate8);


    }
}
