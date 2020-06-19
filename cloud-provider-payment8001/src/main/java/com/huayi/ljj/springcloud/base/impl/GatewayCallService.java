package com.huayi.ljj.springcloud.base.impl;

import com.huayi.ljj.springcloud.base.IGatewayCallService;
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


public class GatewayCallService implements IGatewayCallService {
    private static Logger LOG = LoggerFactory.getLogger(GatewayCallService.class);

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


        }catch (Exception e){// 统一异常处理
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
            context.setBaseResp(baseResp);

            e.printStackTrace();
        }finally {
            // 日志

            after(context);
        }

        LOG.info("BasePortalTranferServiceImpl.execute end<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void before(IServiceContext context){
        // 记录日志
        LOG.info("GatewayCallService.before 日志记录开始>>>>>>>>>>>>>>>>>>>>>");
        // 生成后台流水号
        String tranJnno = TransJnnoGenerator.generator();
        LOG.info("后台交易流水号：[{}]",tranJnno);
        context.setParameter("tranJnno",tranJnno);

        TblTransLog tblTransLog = new TblTransLog();
        BaseReq baseReq = context.getBaseReq();

        tblTransLog.setOperatorId(baseReq.getCustomerNo());//用户号
        tblTransLog.setOperatorNm(baseReq.getCustomerNm());//用户名
        tblTransLog.setEvent("init");
        tblTransLog.setTransNo(tranJnno);
        tblTransLog.setTransDt(DateUtil.getDate8());
        tblTransLog.setTransTm(DateUtil.getTime6());
        transLogMapper.insert(tblTransLog);
        context.setParameter("tblTransLog",tblTransLog);

        LOG.info("GatewayCallService.before 日志记录结束<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void action(IServiceContext context) throws Exception{
        BaseReq baseReq = context.getBaseReq();
        LOG.info("执行交易码[{}]",baseReq.getTransCode());
        IService service = null;
        try {
             service = baseServiceFactory.getServiceByTransCode(baseReq.getTransCode());

        } catch (Exception e) {
            LOG.error("交易获取失败，请查看该服务是否配置");
            throw new BaseException(EnumRespMsg.TRANS_CODE_NOT_FOUND.getCode(),EnumRespMsg.TRANS_CODE_NOT_FOUND.getMsg());
        }

        // 交易执行
        try{
            service.execute(context);
        }catch (Exception e){
            LOG.error("交易执行错误...");
            throw e;
        }

    }

    public void after(IServiceContext context){
        // 更新日志
        LOG.info("GatewayCallService.after begin>>>>>>>>>>>>>>>>>>>>>");

        TblTransLog tblTransLog = context.getParameter("tblTransLog");

        tblTransLog.setEvent("after");
        tblTransLog.setTransDt(DateUtil.getDate8());
        tblTransLog.setTransTm(DateUtil.getTime6());
        transLogMapper.updateByPrimaryKey(tblTransLog);
//        transLogMapper.updateByPrimaryKeySelective(tblTransLog);

        BaseResp baseResp = context.getBaseResp();
        baseResp.setFsideJnno(context.getBaseReq().getFsideJnno());
        baseResp.setTranJnno(context.getParameter("tranJnno"));
        baseResp.setCreateData(DateUtil.getDate8());
        baseResp.setCreateTime(DateUtil.getTime6());

        context.setBaseResp(baseResp);
        LOG.info("GatewayCallService.after end<<<<<<<<<<<<<<<<<<<<<<<");
    }
}

