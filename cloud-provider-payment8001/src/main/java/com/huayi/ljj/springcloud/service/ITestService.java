package com.huayi.ljj.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public interface ITestService extends IService{
    /**
     * 测试
     */
    public void sayHello();
}
