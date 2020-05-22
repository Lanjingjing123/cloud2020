package com.huayi.ljj.springcloud.service;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.pojo.resp.BaseResp;

public interface IServiceContext extends IEpayContext{

    public BaseReq getBaseReq();

    public void setBaseReq(BaseReq baseReq);

    public BaseResp getBaseResp();

    public void setBaseResp(BaseResp baseResp);
}
