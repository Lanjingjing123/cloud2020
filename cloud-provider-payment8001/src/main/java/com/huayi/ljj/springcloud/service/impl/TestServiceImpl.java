package com.huayi.ljj.springcloud.service.impl;

import com.huayi.ljj.springcloud.service.IService;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service(value = "testService")
public class TestServiceImpl implements ITestService, IService {

    private static final Logger LOG = LoggerFactory.getLogger(TestServiceImpl.class);
    @Override
    public void sayHello() {
        System.out.println("test service.................");
    }

    @Override
    public void execute(IServiceContext context) {
        LOG.info("TestServiceImpl.execute begin>>>>>>>>>>>>>>>>>>");
        LOG.info("TestServiceImpl.execute end<<<<<<<<<<<<<<<<<<<<<");
    }
}
