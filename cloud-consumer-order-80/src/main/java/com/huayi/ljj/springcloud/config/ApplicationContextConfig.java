package com.huayi.ljj.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lanjingjing
 * @description 容器
 * @date 2020/4/6
 *
 * 此类相当于如下：
 * @Configuration            @Bean
 * applicationContext.xml -> <bean id="" class=""></>
 *
 *  @LoadBalanced 使用Eureka注册中心找服务需要增加此注解，切该注解调用后台服务默认使用轮训调用
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
