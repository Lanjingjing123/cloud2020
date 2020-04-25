package com.huayi.ljj.springcould.controller;

import com.huayi.ljj.springcould.entities.Payment;
import com.huayi.ljj.springcould.pojo.CommonResult;
import com.huayi.ljj.springcould.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lanjingjing
 * @description controller
 * @date 2020/4/6
 */
@RestController
@Slf4j
public class PaymentController {

    private static Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        logger.info("=============插入的结果{}]============",result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功",result);

        }else {
            return new CommonResult(404,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        logger.info("12323123");
        logger.info("=============查询的结果*{}]============",payment);
        if (payment !=null){
            return new CommonResult(200,"查询成功",payment);

        }else {
            return new CommonResult(404,"无相关记录，查询ID："+id,null);
        }
    }
}
