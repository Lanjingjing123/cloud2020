package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.constant.ConstanBiz;
import com.huayi.ljj.springcloud.constant.EnumRespMsg;
import com.huayi.ljj.springcloud.dao.TblManuFacturerParaMapper;
import com.huayi.ljj.springcloud.exception.BaseException;
import com.huayi.ljj.springcloud.model.TblManuFacturerPara;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40106;
import com.huayi.ljj.springcloud.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @doc 厂商信息维护
 * @author ljj
 */
@Service("t40106")
public class T40106Service extends BaseService {

    private static final Logger LOG = LoggerFactory.getLogger(T40106Service.class);

    @Resource
    private TblManuFacturerParaMapper manuFacturerParaMapper;
    @Override
    public void action(IServiceContext context) throws Exception{
        LOG.info("T40106 begin>>>>>>>>>>>>>>>>>>>>>>>>>");
        Req40106 req40106 = (Req40106) context.getBaseReq();
        LOG.info("T40106 【请求参数】:[{}]",req40106);

        TblManuFacturerPara tblManuFacturerPara = new TblManuFacturerPara();
        tblManuFacturerPara.setManufacturerCode(req40106.getManufacturerCode());
        tblManuFacturerPara.setManufacturerNm(req40106.getManufacturerNm());
        tblManuFacturerPara.setTransDt(DateUtil.getDate8());
        tblManuFacturerPara.setTransTm(DateUtil.getTime6());
        tblManuFacturerPara.setManufacturerTel(req40106.getManufacturerTel());
        tblManuFacturerPara.setTransportationExpense(req40106.getTransportationExpense());
        tblManuFacturerPara.setVersion(1);

        int count = manuFacturerParaMapper.insert(tblManuFacturerPara);

        if (count>0){
            LOG.info("=======插入，插入条数[{}]=====",count);
        }else{
            throw new BaseException(EnumRespMsg.INSERT_DATABASE_FALIURE.getCode(),EnumRespMsg.INSERT_DATABASE_FALIURE.getMsg());
        }

        LOG.info("T40106 end<<<<<<<<<<<<<<<<<<<<<<<<<<<");



    }
}
