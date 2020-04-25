package com.huayi.ljj.springcould.controller;

import com.huayi.ljj.springcould.entities.Payment;
import com.huayi.ljj.springcould.pojo.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author lanjingjing
 * @description 订单Controller
 * @date 2020/4/6
 */

@RestController
public class OrderController {
    private static Logger LOG = LoggerFactory.getLogger(OrderController.class);

    public static String PARMENT_URL = "http://127.0.0.1:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        LOG.info("访问consumer ---> uri:/consumer/payment/create target:/payment/creat 参数：[{}]",payment);
        return restTemplate.postForObject(PARMENT_URL+"/payment/create",payment, CommonResult.class);

    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
//        int a = 10;
        LOG.info("访问consumer ---> uri:/consumer/payment/get/{} target:/consumer/payment/get/id",id);
        return restTemplate.getForObject(PARMENT_URL+"/payment/get/"+id,CommonResult.class);

    }
}
