package com.huayi.ljj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lanjingjing
 * @description boot主启动类
 * @date 2020/4/6
 */


@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.huayi"})
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
