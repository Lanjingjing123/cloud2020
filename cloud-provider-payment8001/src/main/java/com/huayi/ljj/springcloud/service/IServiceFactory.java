package com.huayi.ljj.springcloud.service;

public interface IServiceFactory {
    public IService getServiceByTransCode(String transCode) throws Exception;
}
