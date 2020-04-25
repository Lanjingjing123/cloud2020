package com.huayi.ljj.springcould.service;

import com.huayi.ljj.springcould.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @author lanjingjing
 * @description 支付接口
 * @date 2020/4/6
 */

@Service
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
