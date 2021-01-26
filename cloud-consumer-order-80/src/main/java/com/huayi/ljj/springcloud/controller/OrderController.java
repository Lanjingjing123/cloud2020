package com.huayi.ljj.springcloud.controller;

import org.springframework.web.bind.annotation.RestController;


/**
 * @author lanjingjing
 * @description 订单Controller
 * @date 2020/4/6
 */

@RestController
public class OrderController {
//    private static Logger LOG = LoggerFactory.getLogger(OrderController.class);
//
////    public static String PARMENT_URL = "http://127.0.0.1:8001"; // 单节点调用
//    public static String PARMENT_URL = "http://CLOUD-PAYMENT-SERVICE"; // 通过Eureka注册中心调用
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @GetMapping("/consumer/payment/create")
//    public CommonResult<Payment> create(Payment payment){
//        LOG.info("访问consumer ---> uri:/consumer/payment/create target:/payment/creat 参数：[{}]",payment);
//        return restTemplate.postForObject(PARMENT_URL+"/payment/create",payment, CommonResult.class);
//
//    }
//
//    @GetMapping("/consumer/payment/get/{id}")
//    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
////        int a = 10;
//        LOG.info("访问consumer ---> uri:/consumer/payment/get/{} target:/consumer/payment/get/id",id);
//        return restTemplate.getForObject(PARMENT_URL+"/payment/get/"+id,CommonResult.class);
//
//    }
}
