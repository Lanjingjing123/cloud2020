package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.dao.TblProdNameParaMapper;
import com.huayi.ljj.springcloud.model.TblProdNamePara;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40105;
import com.huayi.ljj.springcloud.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lanjingjing
 * @description 产品种类维护
 * @date 2020/6/27
 */

@Service("t40105")
public class T40105Service extends BaseService {

    private static final Logger LOG = LoggerFactory.getLogger(T40105Service.class);

    @Resource
    private TblProdNameParaMapper prodNameParaMapper;

    @Override
    public void action(IServiceContext context) throws Exception {
        LOG.info("【T40105】 begin >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try{

            Req40105 req40105 = (Req40105) context.getBaseReq();
            TblProdNamePara tblProdNamePara = new TblProdNamePara();
            tblProdNamePara.setProductNo(req40105.getProductNo());
            tblProdNamePara.setProductNm(req40105.getProductNm());
            tblProdNamePara.setProductActulWeight(req40105.getProductActulWeight());
            tblProdNamePara.setProductThickness(req40105.getProductThickness());
            tblProdNamePara.setProductKind(req40105.getProductKind());
            tblProdNamePara.setProductLength(req40105.getProductLength());
            tblProdNamePara.setProductTheoryWeight(req40105.getProductTheoryWeight());
            tblProdNamePara.setProductThickness(tblProdNamePara.getProductThickness());


            tblProdNamePara.setCreatDt(DateUtil.getDate8());
            tblProdNamePara.setTransDt(DateUtil.getDate8());
            tblProdNamePara.setTransTm(DateUtil.getTime6());
            int count = prodNameParaMapper.insert(tblProdNamePara);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }


        LOG.info("【T40105】 end <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
