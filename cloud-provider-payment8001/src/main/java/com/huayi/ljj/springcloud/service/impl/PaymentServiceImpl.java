package com.huayi.ljj.springcloud.service.impl;


import com.huayi.ljj.springcloud.dao.PaymentMapper;


import com.huayi.ljj.springcloud.model.Payment;
import com.huayi.ljj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lanjingjing
 * @description 支付实现
 * @date 2020/4/6
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentMapper.selectByPrimaryKey(id);
    }
}
