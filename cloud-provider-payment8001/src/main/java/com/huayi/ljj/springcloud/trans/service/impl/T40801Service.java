package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.constant.EnumRespMsg;
import com.huayi.ljj.springcloud.dao.TblProdNameParaMapper;
import com.huayi.ljj.springcloud.exception.BaseException;
import com.huayi.ljj.springcloud.model.TblProdNamePara;
import com.huayi.ljj.springcloud.model.TblProdNameParaExample;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40801;
import com.huayi.ljj.springcloud.trans.pojo.resp.Resp40801;
import com.huayi.ljj.springcloud.trans.pojo.resp.sub.Resp40801List1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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

        List<TblProdNamePara> list = this.queryData(req);
        if (list == null){
            LOG.info("=============数据库无记录=================");
        }

        if (list!=null){
            LOG.info("数据库记录:[{}]",list);
            List<Resp40801List1> respList=new ArrayList<>();
            Resp40801List1 item = new Resp40801List1();
            list.forEach(tblProdNamePara->{
                item.setProductNo(tblProdNamePara.getProductNo());
                item.setProductKind(tblProdNamePara.getProductKind());
                item.setProductActulWeight(tblProdNamePara.getProductActulWeight());
                item.setProductTheoryWeight(tblProdNamePara.getProductTheoryWeight());
                item.setProductNm(tblProdNamePara.getProductNm());
                item.setProductLength(tblProdNamePara.getProductLength());
                item.setProductThickness(tblProdNamePara.getProductThickness());
                respList.add(item);
            });

            resp.setList(respList);
        }


        context.setBaseResp(resp);

        LOG.info("【T40801】 end <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }


    /**
     * 根据入参查询数据库
     * @param req40801
     * @return
     */
    private List<TblProdNamePara> queryData(Req40801 req40801){
        TblProdNameParaExample example = new TblProdNameParaExample();
        TblProdNameParaExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(req40801.getProductNo())){
            criteria.andProductNoEqualTo(req40801.getProductNo());
        }
        if (!StringUtils.isEmpty(req40801.getProductKind())){
            criteria.andProductKindEqualTo(req40801.getProductKind());
        }
        if (!StringUtils.isEmpty(req40801.getProductThickness())){
            criteria.andProductKindEqualTo(req40801.getProductThickness());
        }

        List<TblProdNamePara> list = prodNameParaMapper.selectByExample(example);
        return list;
    }
}


