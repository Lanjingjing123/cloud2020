package com.huayi.ljj.springcloud.base;

import com.huayi.ljj.springcloud.service.IServiceContext;

public interface IGatewayCallService {
    public void execute(IServiceContext context);
}
