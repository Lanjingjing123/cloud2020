package com.huayi.ljj.springcloud.service.impl;

import com.huayi.ljj.springcloud.dao.PaymentDao;
import com.huayi.ljj.springcloud.entities.Payment;
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
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
