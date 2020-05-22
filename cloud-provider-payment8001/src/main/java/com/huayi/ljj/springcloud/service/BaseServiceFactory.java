package com.huayi.ljj.springcloud.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

public class BaseServiceFactory implements ApplicationContextAware ,IServiceFactory{

    protected static ApplicationContext applicationContext;

    /**
     * bean 服务集合
     */
    private Map<String,String> serviceMap;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BaseServiceFactory.applicationContext = applicationContext;
    }

    public Map<String, String> getServiceMap() {
        return serviceMap;
    }

    public void setServiceMap(Map<String, String> serviceMap) {
        this.serviceMap = serviceMap;
    }

    @Override
    public IService getServiceByTransCode(String transCode) throws Exception {
        IService serviceBean = (IService)applicationContext.getBean(this.serviceMap.get(transCode));
        if (serviceBean ==null){
            throw new RuntimeException("交易未配置");
        }
        return serviceBean;
    }
}
