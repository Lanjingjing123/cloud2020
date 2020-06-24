package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.constant.EnumRespMsg;
import com.huayi.ljj.springcloud.dao.TblManuFacturerParaMapper;
import com.huayi.ljj.springcloud.model.TblManuFacturerPara;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40204;
import com.huayi.ljj.springcloud.trans.pojo.resp.Resp40204;
import com.huayi.ljj.springcloud.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

@Service("t40204")
public class T40204Service extends BaseService {

    private static final Logger LOG = LoggerFactory.getLogger(T40204Service.class);
    @Resource
    private TblManuFacturerParaMapper manuFacturerParaMapper;
    @Override
    public void action (IServiceContext context) throws Exception{
        LOG.info("T40204 begin >>>>>>>>>>>>>>>>");
        Req40204 req =(Req40204) context.getBaseReq();
        LOG.info("========req:[{}]\n=========",req);

        Resp40204 resp40204 = new Resp40204();
        resp40204.setOrderNo(req.getOrderNo());
        TblManuFacturerPara tblManuFacturerPara = new TblManuFacturerPara();
        tblManuFacturerPara.setManufacturerCode("1001");
        tblManuFacturerPara.setManufacturerNm("方管测试");
        tblManuFacturerPara.setManufacturerCode(new Random().nextLong()+"");
        tblManuFacturerPara.setTransDt(DateUtil.getDate8());
        manuFacturerParaMapper.insert(tblManuFacturerPara);

        // 交易成功
        resp40204.setRespCode(EnumRespMsg.SUCCESS.getCode());
        resp40204.setRespMsg(EnumRespMsg.SUCCESS.getMsg());
        context.setBaseResp(resp40204);
        LOG.info("T40204 end <<<<<<<<<<<<<<<<");
    }
}
