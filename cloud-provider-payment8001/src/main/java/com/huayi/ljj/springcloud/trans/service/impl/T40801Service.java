package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.constant.EnumRespMsg;
import com.huayi.ljj.springcloud.dao.TblProdNameParaMapper;
import com.huayi.ljj.springcloud.exception.BaseException;
import com.huayi.ljj.springcloud.model.TblProdNamePara;
import com.huayi.ljj.springcloud.model.TblProdNameParaExample;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseQueryService;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40801;
import com.huayi.ljj.springcloud.trans.pojo.resp.Resp40801;
import com.huayi.ljj.springcloud.trans.pojo.resp.sub.Resp40801List1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author ljj
 * @doc 查询产品种类信息
 */
@Service("t40801")
public class T40801Service extends BaseQueryService {
    private static final Logger LOG = LoggerFactory.getLogger(T40801Service.class);

    @Resource
    private TblProdNameParaMapper prodNameParaMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void action(IServiceContext context) throws Exception {
        LOG.info("【T40801】 begin >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");




        Req40801 req = (Req40801) context.getBaseReq();

        Resp40801 resp = new Resp40801();

        List<TblProdNamePara> list = this.queryData(req);
        if (list == null||list.size()<=0){
            LOG.info("=============数据库无记录=================");
        }

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


        context.setBaseResp(resp);

        LOG.info("【T40801】 end <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }


    /**
     * 根据入参查询数据库,这里配置了缓存，60s过期
     * @param req40801
     * @return
     */
    public List<TblProdNamePara> queryData(Req40801 req40801){

        String key = "TblProdNamePara"+req40801.getProductNo();
        ValueOperations valueOperations = redisTemplate.opsForValue();
        LOG.info("redisTemplate"+redisTemplate);
        if (redisTemplate.hasKey(key)){
            LOG.info("从缓存中获取>>>>>>>>>>>>>>>>>>>>>>>>");
            List<TblProdNamePara> list = (List<TblProdNamePara>) valueOperations.get(key);
            return list;
        }

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

        valueOperations.set(key,list,60, TimeUnit.SECONDS);
        return list;
    }
}


