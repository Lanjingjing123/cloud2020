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
import com.huayi.ljj.springcloud.util.BeanMapUtil;
import com.huayi.ljj.springcloud.util.DateUtil;
import com.huayi.ljj.springcloud.util.TransJnnoGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Map;


public class GatewayCallService implements IGatewayCallService {
    private static Logger LOG = LoggerFactory.getLogger(GatewayCallService.class);
    private static final String reqPackageName = "com.huayi.ljj.springcloud.trans.pojo.req";
    @Resource
    private TblTransLogMapper transLogMapper;

    @Autowired
    private BaseServiceFactory baseServiceFactory;
    @Override
    public void execute(IServiceContext context) {
        LOG.info("BasePortalTranferServiceImpl.execute begin>>>>>>>>>>>>>>>>>>>>");
        LOG.info("context:[{}]",context);
        try{
            // 初始化请求报文，放入context中
            init(context);
            // 交易前日志报文处理
            before(context);
            // 执行目标交易
            action(context);


        }catch (Exception e){// 统一异常处理
            BaseResp baseResp = context.getBaseResp();
            if (baseResp ==null ){
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
            // 交易结束进行日志记录
            after(context);
        }

        LOG.info("BasePortalTranferServiceImpl.execute end<<<<<<<<<<<<<<<<<<<<<<");
    }


    public void init(IServiceContext context) throws BaseException {
        LOG.info("=====【init】 初始化请求报文开始>>>>>>>>>>>>>>>>>>>>>>>>");
        // 解析 reqMap
        Map reqMap = context.getParameter("reqMap");
        String transCode = String.valueOf(reqMap.get("transCode"));
        LOG.info("=========需要转换为对应请求的【交易码】:[{}]==========",transCode);
        // 将参数转为对应交易码的req
        BaseReq baseReq = null;
        try {
            baseReq = BeanMapUtil.map2bean(reqMap, transCode, reqPackageName);
        } catch (Exception e) {
            LOG.error("===========转换对应交易报文失败...,请检查交易码================");
            throw new BaseException(EnumRespMsg.TRANS_MESSAGE.getCode(),EnumRespMsg.TRANS_MESSAGE.getMsg());

        }
        context.setBaseReq(baseReq);
        LOG.info("=====【init】 初始化请求报文结束<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void before(IServiceContext context){
        // 记录日志
        LOG.info("【before】 日志记录开始>>>>>>>>>>>>>>>>>>>>>");

        // 生成后台流水号
        String tranJnno = TransJnnoGenerator.generator();
        LOG.info("========【后台交易流水号】：[{}]",tranJnno);
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

        LOG.info("【before】 日志记录结束<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void action(IServiceContext context) throws Exception{
        LOG.info("【action】 获取目标交易进行执行开始>>>>>>>>>>>>>>>>>>");
        BaseReq baseReq = context.getBaseReq();
        LOG.info("========执行交易码[{}]========",baseReq.getTransCode());
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

        LOG.info("【action】 获取目标交易进行执行结束<<<<<<<<<<<<<<<<<<<<<");

    }

    public void after(IServiceContext context){
        // 更新日志
        LOG.info("【after】 日志更新开始>>>>>>>>>>>>>>>>>>>>>");

        TblTransLog tblTransLog = context.getParameter("tblTransLog");

        tblTransLog.setEvent("after");
        tblTransLog.setTransDt(DateUtil.getDate8());
        tblTransLog.setTransTm(DateUtil.getTime6());
        transLogMapper.updateByPrimaryKey(tblTransLog);

        BaseResp baseResp = context.getBaseResp();
        if (baseResp == null){
            baseResp = new BaseResp();
        }
        // 公共报文set值
        baseResp.setFsideJnno(context.getBaseReq().getFsideJnno());
        baseResp.setTranJnno(context.getParameter("tranJnno"));
        baseResp.setCreateData(DateUtil.getDate8());
        baseResp.setCreateTime(DateUtil.getTime6());

        context.setBaseResp(baseResp);
        LOG.info("【after】 日志更新结束<<<<<<<<<<<<<<<<<<<<<<<");
    }
}

