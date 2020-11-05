package com.huayi.ljj.springcloud.util;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.util-FileTrans
 * date: 2020/7/10 16:36
 */
public class FileTrans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\cloud2020\\cloud-provider-payment8001\\rule.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\cloud2020\\cloud-provider-payment8001\\result.txt")));
        StringBuffer sb = new StringBuffer();
        String line = "";
        int counts = 0;
        String regx = "^[0-9]+";
        Pattern p = Pattern.compile(regx);
        int i =0;
        while ((line = br.readLine())!=null&&line!=""){
//            if (line == null){
//                break;
//            }
            i++;
            if (line.equals("536")){
                System.out.println(536);
            }
            Matcher matcher = p.matcher(line);
            if (matcher.find()){// 找到的替换
                System.out.println(matcher.group());
                continue;
            }
            sb.append(line).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}
