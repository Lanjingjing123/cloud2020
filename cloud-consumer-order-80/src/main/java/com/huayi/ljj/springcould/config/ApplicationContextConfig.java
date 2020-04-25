package com.huayi.ljj.springcould.config;

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
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
