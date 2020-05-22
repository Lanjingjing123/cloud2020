package com.huayi.ljj.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;

/**
 * @author lanjingjing
 * @description boot主启动类
 * @date 2020/4/6
 */


@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.huayi"})
@ImportResource(locations = "classpath:spring/spring-beans.xml")
public class PaymentMain8001 {
    private static final Logger logger = LoggerFactory.getLogger(PaymentMain8001.class);
    public static void main(String[] args) {
        ApplicationContext ctx  = SpringApplication.run(PaymentMain8001.class, args);
        //所有的bean,参考：http://412887952-qq-com.iteye.com/blog/2314051
        String[] beanNames = ctx.getBeanDefinitionNames();
        //String[] beanNames = ctx.getBeanNamesForAnnotation(RestController.class);//所有添加该注解的bean
        logger.info("bean总数:{}", ctx.getBeanDefinitionCount());
        int i = 0;
        for (String str : beanNames) {
            logger.info("{},beanName:{}", ++i, str);
        }

    }
}
