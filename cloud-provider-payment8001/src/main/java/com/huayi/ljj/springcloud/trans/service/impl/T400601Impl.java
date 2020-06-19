package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.trans.pojo.req.Req400601;
import com.huayi.ljj.springcloud.trans.service.T400601;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("t400601")
public class T400601Impl implements T400601 {
    private static Logger LOG = LoggerFactory.getLogger(T400601Impl.class);
    @Override
    public void execute(IServiceContext context) {
        LOG.info("T400601Impl.excute>>>>>>>>>>>>>>>>");
        Req400601 req =(Req400601) context.getBaseReq();
        LOG.info("========req:[{}]\n=========",req);
        LOG.info("T400601Impl.excute<<<<<<<<<<<<<<<<");
    }
}
