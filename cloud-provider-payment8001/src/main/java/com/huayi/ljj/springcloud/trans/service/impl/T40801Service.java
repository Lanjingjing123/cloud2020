package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.dao.TblProdNameParaMapper;
import com.huayi.ljj.springcloud.model.TblProdNamePara;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40801;
import com.huayi.ljj.springcloud.trans.pojo.resp.Resp40801;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author ljj
 * @doc 查询产品种类信息
 */
@Service("t40801")
public class T40801Service extends BaseService {
    private static final Logger LOG = LoggerFactory.getLogger(T40801Service.class);

    @Resource
    private TblProdNameParaMapper prodNameParaMapper;

    @Override
    public void action(IServiceContext context) throws Exception {
        LOG.info("【T40801】 begin >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");



        Req40801 req = (Req40801) context.getBaseReq();

        Resp40801 resp = new Resp40801();
        TblProdNamePara tblProdNamePara = null;


        if (!StringUtils.isEmpty(req.getProductNo())){
             tblProdNamePara = prodNameParaMapper.selectByPrimaryKey(req.getProductNo());
            resp.setProductNo(tblProdNamePara.getProductNo());
            resp.setProductNm(tblProdNamePara.getProductNm());
            resp.setProductKind(tblProdNamePara.getProductKind());
            resp.setProductThickness(tblProdNamePara.getProductThickness());
            resp.setProductActulWeight(tblProdNamePara.getProductActulWeight());
            resp.setProductLength(tblProdNamePara.getProductLength());
            resp.setProductTheoryWeight(tblProdNamePara.getProductTheoryWeight());

            context.setBaseResp(resp);
             return ;
        }


        LOG.info("【T40801】 end <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
