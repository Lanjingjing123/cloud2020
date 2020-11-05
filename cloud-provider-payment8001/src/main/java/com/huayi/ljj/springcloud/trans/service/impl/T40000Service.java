package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.dao.TblBuyTransMapper;
import com.huayi.ljj.springcloud.dao.TblHuayiGoodsMapper;
import com.huayi.ljj.springcloud.dao.TblSaleTransMapper;
import com.huayi.ljj.springcloud.model.*;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40000;
import com.huayi.ljj.springcloud.util.DateUtil;
import com.huayi.ljj.springcloud.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.service.impl-T40000Service
 * date: 2020/11/4 11:45
 * @doc : 每日导出excel文件
 * 步骤：1.查询出数据库前一日的所有型号数据，型号按照方管，扁管，角钢，圆管
 *      2. 导出数据
 */
@Service("t40000")
public class T40000Service extends BaseService {

    private static final Logger LOG = LoggerFactory.getLogger(T40000Service.class);

    @Resource
    private TblHuayiGoodsMapper tblHuayiGoodsMapper;

    @Resource
    private TblBuyTransMapper tblBuyTransMapper;

    @Resource
    private TblSaleTransMapper tblSaleTransMapper;

    @Override
    public void action(IServiceContext context) throws Exception {
        LOG.info("T40000 Begin>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        Req40000 req40000 = (Req40000)context.getBaseReq();
        LOG.info("请求参数req:[{}]",req40000);
        String currentDate = DateUtil.getDate8();
        String lastDate = DateUtil.getLastDate8();
        LOG.info("currentDate:"+currentDate+"lastDate:"+lastDate);

        TblHuayiGoods tblHuayiGoods2 = null;

        /** 查询上一天的所有数据进行更新 */
        TblHuayiGoodsExample example = new TblHuayiGoodsExample();
        example.createCriteria().andSpecificationIsNotNull().andTranDtEqualTo(lastDate);
        List<TblHuayiGoods> tblHuayiGoodsList = tblHuayiGoodsMapper.selectByExample(example);

        for (TblHuayiGoods tblHuayiGoods: tblHuayiGoodsList) {
            if (StringUtil.isEmpty(tblHuayiGoods.getSpecification())
                    || StringUtil.isEmpty(tblHuayiGoods.getThickness())){
                continue;
            }
            tblHuayiGoods2 = new TblHuayiGoods();

            // 型号
            String specification = tblHuayiGoods.getSpecification();
            // 厚度
            String thickness = tblHuayiGoods.getThickness();
            // 数量
            BigDecimal quanlity = tblHuayiGoods.getQuanlity();
            if (quanlity==null){
                quanlity = BigDecimal.ZERO;
            }

            LOG.info("specification:"+specification+",thickness:"+thickness+",");
            BeanUtils.copyProperties(tblHuayiGoods,tblHuayiGoods2);
            /** 查询当天入库记录与出库记录*/

            // 入库记录，加库存
            TblBuyTransExample buyTransExample = new TblBuyTransExample();
            buyTransExample.createCriteria().andTranDtEqualTo(currentDate).andSpecificationEqualTo(specification).andThicknessEqualTo(thickness);
            List<TblBuyTrans> tblBuyTransList = tblBuyTransMapper.selectByExample(buyTransExample);
            for (TblBuyTrans tblBuyTrans : tblBuyTransList) {
                // 数量
                BigDecimal addQuanlity = tblBuyTrans.getQuanlity();
                quanlity  = quanlity.add(addQuanlity);
                // 成本价
                BigDecimal costPrice = tblBuyTrans.getCostPrice();
                // 最新的成本价 > 以前的成本价，直接更新最新的成本价
                if (costPrice.compareTo(tblHuayiGoods.getCostPrice())>0){
                    tblHuayiGoods2.setCostPrice(costPrice);
                }
            }
            LOG.info("入库记录结束...");
            // 出库记录，减库存
            TblSaleTransExample example1Sale = new TblSaleTransExample();
            example1Sale.createCriteria().andSpecificationEqualTo(specification).andThicknessEqualTo(thickness).andTranDtEqualTo(currentDate);
            List<TblSaleTrans> tblSaleTransList = tblSaleTransMapper.selectByExample(example1Sale);
            for (TblSaleTrans tblSaleTrans: tblSaleTransList) {

                if(tblSaleTrans.getQuanlity()==null){

                  quanlity = quanlity.subtract(BigDecimal.ZERO);

                }else{
                    quanlity = quanlity.subtract(tblSaleTrans.getQuanlity());
                }

            }
            LOG.info("出库记录结束...");
            // 更新库存
            tblHuayiGoods2.setQuanlity(quanlity);
            // 每天新增一条记录入库
            tblHuayiGoods2.setTranDt(currentDate);
            tblHuayiGoodsMapper.insertSelective(tblHuayiGoods2);

            LOG.info("T40000 End<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        }

    }
}
