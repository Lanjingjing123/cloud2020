package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.dao.TblProdNameParaMapper;
import com.huayi.ljj.springcloud.model.TblProdNamePara;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40105;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author lanjingjing
 * @description 产品种类维护
 * @date 2020/6/27
 */

@Service("t40105")
public class T40105Service extends BaseService {

    private static final Logger LOG = LoggerFactory.getLogger(T40105Service.class);

    private TblProdNameParaMapper prodNameParaMapper;

    @Override
    public void action(IServiceContext context) throws Exception {
        LOG.info("【T40105】 begin >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Req40105 baseReq = (Req40105) context.getBaseReq();
        TblProdNamePara tblProdNamePara = new TblProdNamePara();
        tblProdNamePara.setProductNo(baseReq.getProductNo());

        int count = prodNameParaMapper.insert(tblProdNamePara);


        LOG.info("【T40105】 end <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
