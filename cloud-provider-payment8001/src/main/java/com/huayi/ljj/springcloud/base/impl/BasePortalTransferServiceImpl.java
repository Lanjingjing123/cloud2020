package com.huayi.ljj.springcloud.base.impl;

import com.huayi.ljj.springcloud.base.IPortalTransferService;
import com.huayi.ljj.springcloud.constant.EnumRespMsg;
import com.huayi.ljj.springcloud.dao.TblTransLogMapper;
import com.huayi.ljj.springcloud.exception.BaseException;
import com.huayi.ljj.springcloud.model.TblTransLog;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.pojo.resp.BaseResp;
import com.huayi.ljj.springcloud.service.BaseServiceFactory;
import com.huayi.ljj.springcloud.service.IService;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.util.DateUtil;
import com.huayi.ljj.springcloud.util.TransJnnoGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


public class BasePortalTransferServiceImpl implements IPortalTransferService {
    private static Logger LOG = LoggerFactory.getLogger(BasePortalTransferServiceImpl.class);

    @Resource
    private TblTransLogMapper transLogMapper;

    @Autowired
    private BaseServiceFactory baseServiceFactory;
    @Override
    public void execute(IServiceContext context) {
        LOG.info("BasePortalTranferServiceImpl.execute begin>>>>>>>>>>>>>>>>>>>>");
        // TODO
        LOG.info("context:[{}]",context);
        try{
            before(context);

            action(context);

            after(context);
        }catch (Exception e){
            BaseResp baseResp = context.getBaseResp();
            if (baseResp !=null ){
                baseResp = new BaseResp();
            }
            if (e instanceof BaseException){
                baseResp.setRespCode(((BaseException) e).getiErrCode());
                baseResp.setRespMsg(((BaseException) e).getiErrMessage());

            } else{
                baseResp.setRespCode(EnumRespMsg.FALIURE.getCode());
                baseResp.setRespMsg(EnumRespMsg.FALIURE.getMsg());
            }

            e.printStackTrace();
        }
        LOG.info("BasePortalTranferServiceImpl.execute end<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void before(IServiceContext context){
        // 记录日志
        LOG.info("BasePortalTransferServiceImpl.before begin>>>>>>>>>>>>>>>>>>>>>");
        String transNo = TransJnnoGenerator.generator();//生成流水号
        TblTransLog tblTransLog = new TblTransLog();
        BaseReq baseReq = context.getBaseReq();

        tblTransLog.setOperatorId(baseReq.getCustomerNo());//用户号
        tblTransLog.setOperatorNm(baseReq.getCustomerNm());//用户名
        tblTransLog.setEvent("init");
        tblTransLog.setTransNo(transNo);
        tblTransLog.setTransDt(DateUtil.getDate8());
        tblTransLog.setTransTm(DateUtil.getTime6());
        transLogMapper.insert(tblTransLog);
        context.setParameter("tblTransLog",tblTransLog);

        LOG.info("BasePortalTransferServiceImpl.before end<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void action(IServiceContext context) throws Exception{
        BaseReq baseReq = context.getBaseReq();
        try {
            IService service = baseServiceFactory.getServiceByTransCode(baseReq.getTransCode());
            service.execute(context);
        } catch (Exception e) {
            LOG.error("交易获取失败，请查看该服务是否配置");
            throw e;
        }
    }

    public void after(IServiceContext context){
        // 更新日志
        LOG.info("BasePortalTransferServiceImpl.after begin>>>>>>>>>>>>>>>>>>>>>");

        TblTransLog tblTransLog = context.getParameter("tblTransLog");

        tblTransLog.setEvent("after");
        tblTransLog.setTransDt(DateUtil.getDate8());
        tblTransLog.setTransTm(DateUtil.getTime6());
        transLogMapper.updateByPrimaryKey(tblTransLog);
//        transLogMapper.updateByPrimaryKeySelective(tblTransLog);

        LOG.info("BasePortalTransferServiceImpl.after end<<<<<<<<<<<<<<<<<<<<<<<");
    }
}

