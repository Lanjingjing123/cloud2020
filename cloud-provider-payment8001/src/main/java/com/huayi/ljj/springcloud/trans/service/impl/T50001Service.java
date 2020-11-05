package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.constant.EnumRespMsg;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req50001;
import com.huayi.ljj.springcloud.trans.pojo.resp.Resp50001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.service.impl-T50001Service
 * date: 2020/9/18 15:39
 */
@Service("t50001")
public class T50001Service extends BaseService {
    private static final Logger LOG = LoggerFactory.getLogger(T50001Service.class);
    @Override
    public void action(IServiceContext context) throws Exception {
        Req50001 req = (Req50001) context.getBaseReq();
        LOG.info("req[{}]",req);

        Resp50001 resp50001 = new Resp50001();
        resp50001.setRespCode(EnumRespMsg.SUCCESS.getCode());
        resp50001.setRespMsg(EnumRespMsg.SUCCESS.getMsg());
        context.setBaseResp(resp50001);
    }
}
