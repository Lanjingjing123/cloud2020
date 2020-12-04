package com.huayi.ljj.springcloud.util;

import java.text.ParseException;
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


    /**
     * 获得指定日期下一天
     * @param specifiedDay
     * @return
     */
    public static String getSpecifiedDayAfter(String specifiedDay) {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyyMMdd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day + 1);

        String dayAfter = new SimpleDateFormat("yyyyMMdd")
                .format(c.getTime());
        return dayAfter;
    }

    public static boolean isDate8(String dateStr){
        if (dateStr.isEmpty()){
            return false;
        }

        if (dateStr.length()>8||dateStr.length()<8){
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void main(String[] args) {
        String date8 = getDate8();
        System.out.println(date8);

        String time6 = getTime6();
        System.out.println(time6);
        String time14 = getDate14();
        System.out.println(time14);
        // 获取上一天
        String lastDate8 = getLastDate8();
        System.out.println("lastDate:"+lastDate8);
        // 获取下一天
        String specifiedDayAfter = getSpecifiedDayAfter("20201203");
        System.out.println(specifiedDayAfter);


        // 测试日期格式
        String dateStr = "20201232";
        boolean date81 = isDate8(dateStr);
        System.out.println(date81);


    }
}
