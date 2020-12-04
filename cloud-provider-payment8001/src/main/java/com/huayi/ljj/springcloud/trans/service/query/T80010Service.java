package com.huayi.ljj.springcloud.trans.service.query;

import com.huayi.ljj.springcloud.constant.EnumRespMsg;
import com.huayi.ljj.springcloud.dao.TblHuayiGoodsMapper;
import com.huayi.ljj.springcloud.dao.TblSaleTransMapper;
import com.huayi.ljj.springcloud.exception.BaseException;
import com.huayi.ljj.springcloud.model.TblHuayiGoods;
import com.huayi.ljj.springcloud.model.TblHuayiGoodsExample;
import com.huayi.ljj.springcloud.model.TblSaleTrans;
import com.huayi.ljj.springcloud.model.TblSaleTransExample;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseQueryService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req80010;
import com.huayi.ljj.springcloud.trans.pojo.resp.Resp80010;
import com.huayi.ljj.springcloud.trans.service.impl.T40004Service;
import com.huayi.ljj.springcloud.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 计算给定日期的收益，
 * 按日输出
 */
@Service("t80010")
public class T80010Service extends BaseQueryService {
    private TblSaleTransMapper tblSaleTransMapper;
    private TblHuayiGoodsMapper tblHuayiGoodsMapper;
    private static final Logger LOG = LoggerFactory.getLogger(T80010Service.class);
    @Override
    public void action(IServiceContext context) throws Exception {
        Req80010 req = (Req80010)context.getBaseReq();
        Resp80010 resp80010 = new Resp80010();
        LOG.info("T80010 >>>>>>>>>>>>>>>>>>>>>>>>");
        LOG.info("req:[{}]",req);

        if (req.getBeginDt().isEmpty()){
            throw  new BaseException("028003","开始日期不能为空");
        }
        if (req.getEndDt().isEmpty()){
            throw new BaseException("028004","结束日期不能为空");
        }
        //验证日期格式
        if (!DateUtil.isDate8(req.getBeginDt())){
           throw new BaseException("028005","日期格式不符");
        }
        String currentDt = req.getBeginDt();
        // 当日利润
        BigDecimal totalProfit = BigDecimal.ZERO;
        Map<String,BigDecimal> map = new HashMap<>();

        do {


             // 按照日期统计每天的收益
            TblSaleTransExample example = new TblSaleTransExample();
            example.createCriteria().andTranDtEqualTo(currentDt);
            List<TblSaleTrans> tblSaleTrans = tblSaleTransMapper.selectByExample(example);
            for (TblSaleTrans tblsaleTran: tblSaleTrans) {
                if (tblsaleTran.getThickness().isEmpty()){
                    continue;
                }

                //
                LOG.info("当前统计型号："+tblsaleTran.getSpecification()+"*"+tblsaleTran.getThickness()+">>>>>>>>>>>");

                TblHuayiGoodsExample example1 = new TblHuayiGoodsExample();
                example1.createCriteria().andTranDtEqualTo(currentDt).andSpecificationEqualTo(tblsaleTran.getSpecification())
                        .andThicknessEqualTo(tblsaleTran.getThickness());
                List<TblHuayiGoods> tblHuayiGoodsList = tblHuayiGoodsMapper.selectByExample(example1);
                // 交易日期  -型号 -厚度 唯一确定
                TblHuayiGoods tblHuayiGoods = tblHuayiGoodsList.get(0);
                // 成本单价
                BigDecimal costPrice = tblHuayiGoods.getCostPrice();
                // 销售单价
                BigDecimal price = tblsaleTran.getPrice();
                BigDecimal profit = price.subtract(costPrice).multiply(tblsaleTran.getQuanlity());
                totalProfit = totalProfit.add(profit);

            }
            map.put(currentDt,totalProfit);
        }while (currentDt.equals(req.getEndDt()));
        resp80010.setMap(map);
        resp80010.setRespCode(EnumRespMsg.SUCCESS.getCode());
        resp80010.setRespMsg(EnumRespMsg.SUCCESS.getMsg());
        LOG.info("============"+map.toString()+"=================");
        LOG.info("T80010 <<<<<<<<<<<<<<<<<<<<<<<");

        context.setBaseResp(resp80010);


    }



}
