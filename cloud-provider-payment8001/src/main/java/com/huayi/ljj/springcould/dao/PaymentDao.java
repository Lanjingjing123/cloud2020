package com.huayi.ljj.springcould.dao;

import com.huayi.ljj.springcould.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);



}
