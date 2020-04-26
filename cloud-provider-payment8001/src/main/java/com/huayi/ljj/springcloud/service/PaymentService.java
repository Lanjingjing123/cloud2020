package com.huayi.ljj.springcloud.service;

import com.huayi.ljj.springcloud.entities.Payment;
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
