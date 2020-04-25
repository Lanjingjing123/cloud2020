package com.huayi.ljj.springcould.service.impl;

import com.huayi.ljj.springcould.dao.PaymentDao;
import com.huayi.ljj.springcould.entities.Payment;
import com.huayi.ljj.springcould.service.PaymentService;
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
