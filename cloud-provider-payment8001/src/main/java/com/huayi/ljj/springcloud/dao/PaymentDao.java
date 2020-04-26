package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);



}
