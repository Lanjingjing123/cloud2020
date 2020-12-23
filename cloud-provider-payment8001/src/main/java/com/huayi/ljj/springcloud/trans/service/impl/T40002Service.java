package com.huayi.ljj.springcloud.trans.service.impl;

import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import com.huayi.ljj.springcloud.dao.TblHuayiGoodsMapper;
import com.huayi.ljj.springcloud.exception.BaseException;
import com.huayi.ljj.springcloud.model.HuayiModelProperty;
import com.huayi.ljj.springcloud.model.TblHuayiGoods;
import com.huayi.ljj.springcloud.model.TblHuayiGoodsExample;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40002;
import com.huayi.ljj.springcloud.trans.pojo.resp.Resp40002;
import com.huayi.ljj.springcloud.util.DateUtil;
import com.huayi.ljj.springcloud.util.ExcelUtil;
import com.huayi.ljj.springcloud.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.service.impl-T40002Service
 * date: 2020/11/7 8:46
 * 分类查询数据，生成表格
 */
@Service("t40002")
public class T40002Service extends BaseService {
    private static final Logger LOG = LoggerFactory.getLogger(T40002Service.class);

    @Resource
    private TblHuayiGoodsMapper tblHuayiGoodsMapper;

    @Override
    public void action(IServiceContext context) throws Exception {
        LOG.info("T40002 交易 begin>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Req40002 req40002 = (Req40002)context.getBaseReq();
        Resp40002 resp40002 = new Resp40002();

        List<String> productNmlist = new ArrayList<>();
        productNmlist.add("QT");
        productNmlist.add("YG");
        productNmlist.add("FG");
        productNmlist.add("BG");
        LOG.info("请求报文:[{}]",req40002);

        String tranDate = DateUtil.getDate8();
        if (StringUtil.isNotEmpty(req40002.getExportDate())){
            tranDate = req40002.getExportDate();
        }



        String filePath = req40002.getExportPath();
        String fileName = "华亿库存"+tranDate+".xlsx";
        String fileFullPath = null;
        if (filePath.endsWith("/")){
            fileFullPath = filePath+fileName;
        }else{
            fileFullPath = filePath+"/"+fileName;
        }

        LOG.info("fileFullPath="+fileFullPath);




        LOG.info("export begin >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // 所有sheet 放入list,放入list

        ArrayList<ExcelUtil.MultipleSheelPropety> list1 = new ArrayList<>();
        int j =0;
        for (String productNm: productNmlist) { // 分类查询，每一个类型一个sheet
            j++;
            TblHuayiGoodsExample example = new TblHuayiGoodsExample();
            example.createCriteria().andTranDtEqualTo(tranDate).andKindsEqualTo(productNm);
//            example.setOrderByClause("SPECIFICATION");
            List<TblHuayiGoods> tblHuayiGoodsList = tblHuayiGoodsMapper.selectByExample(example);

            List<HuayiModelProperty> tableHeaderExcel = new ArrayList<HuayiModelProperty>();

            List<String> list = new ArrayList<>();
            HuayiModelProperty tableModelProperty =null;
            int i =0;
            // 每个sheet的数据进行绑定
            for (TblHuayiGoods tblHuayiGoods :tblHuayiGoodsList) {
                if (StringUtil.isEmpty(tblHuayiGoods.getSpecification())){
                    continue;
                }
                i++;


                // 非首行且下一型号与上一型号不同，便先增加一个空行
                if (!list.contains(tblHuayiGoods.getSpecification())){
                        list.add(tblHuayiGoods.getSpecification());
                        if (i!=1){
                            tableModelProperty = new HuayiModelProperty();
                            tableModelProperty.setSpecification("");
                            tableHeaderExcel.add(tableModelProperty);
                        }

                }

                tableModelProperty = new HuayiModelProperty();
                tableModelProperty.setSpecification(tblHuayiGoods.getSpecification());
                tableModelProperty.setThickness(tblHuayiGoods.getThickness());
                tableModelProperty.setQuanlity(tblHuayiGoods.getQuanlity());
                tableModelProperty.setCostPrice(tblHuayiGoods.getCostPrice());
                // 吨位价
                if (tblHuayiGoods.getCostPrice()!=null && tblHuayiGoods.getCostPrice().compareTo(BigDecimal.ZERO)>0
                    && tblHuayiGoods.getWeightPer()!=null && tblHuayiGoods.getWeightPer().compareTo(BigDecimal.ZERO)>0){

                  tableModelProperty.setTonPrice(tblHuayiGoods.getCostPrice().divide(tblHuayiGoods.getWeightPer(),2,BigDecimal.ROUND_UP).multiply(new BigDecimal("1000")).setScale(2,BigDecimal.ROUND_UP));
                }
                tableModelProperty.setWeightPer(tblHuayiGoods.getWeightPer());
                tableModelProperty.setKinds(tblHuayiGoods.getKinds());
                tableModelProperty.setTranDt(tblHuayiGoods.getTranDt());
                tableHeaderExcel.add(tableModelProperty);

            }

            // 初始化表名
            Sheet sheet = new Sheet(j,0);
            if (productNm.equals("QT")){
                sheet.setSheetName("角钢,槽钢,工字钢");
            }else if (productNm.equals("FG")){
                sheet.setSheetName("方管");
            }else if(productNm.equals("YG")){
                sheet.setSheetName("圆管");
            }else if (productNm.equals("BG")){
                sheet.setSheetName("扁管");
            }

            ExcelUtil.MultipleSheelPropety multipleSheelPropety = new ExcelUtil.MultipleSheelPropety();
            multipleSheelPropety.setData(tableHeaderExcel);
            multipleSheelPropety.setSheet(sheet);
            list1.add(multipleSheelPropety);
        }

        // 增加一个拓展的热镀锌
        j++;
        List<String> kinds = new ArrayList<>();
        kinds.add("φ19");
        kinds.add("φ25");
        kinds.add("φ32");
        kinds.add("φ42");
        kinds.add("φ48");
        kinds.add("φ60");
        kinds.add("φ76");
        kinds.add("φ89");
        kinds.add("φ114");
        kinds.add("φ140");
        kinds.add("φ165");
        kinds.add("φ219");
        ExcelUtil.MultipleSheelPropety multipleSheelPropety = new ExcelUtil.MultipleSheelPropety();
        List<HuayiModelProperty> tableHeaderExcel = new ArrayList<HuayiModelProperty>();
        // 初始化表名
        Sheet sheet = new Sheet(j,0);
        sheet.setSheetName("热镀锌圆管");
        for (String specification : kinds) {
            //
            BigDecimal priceTonPrice = new BigDecimal(req40002.getRYGPrice());
            // 截取直径
            int d = Integer.parseInt(specification.replace("φ",""));
            for (int m=0;m<12;m++){  // 每种型号 12个厚度，先统一设置单价4800/吨

                HuayiModelProperty tableModelProperty = new HuayiModelProperty();
                tableModelProperty.setSpecification(specification);
                double thickness = 2+0.25*m;
                BigDecimal weightPer = new BigDecimal((d-thickness)*thickness*6*0.02466).setScale(3,BigDecimal.ROUND_UP);

                tableModelProperty.setThickness(thickness+"");
                tableModelProperty.setKinds("RYG");
                tableModelProperty.setTranDt(tranDate);
                tableModelProperty.setTonPrice(priceTonPrice.multiply(new BigDecimal("1000")).setScale(2,BigDecimal.ROUND_UP));
                tableModelProperty.setWeightPer(weightPer);
                tableModelProperty.setCostPrice(weightPer.multiply(priceTonPrice).setScale(2,BigDecimal.ROUND_UP));
                tableModelProperty.setQuanlity(BigDecimal.ZERO);
                tableHeaderExcel.add(tableModelProperty);


                if (m==11){ // 每种型号最后一个厚度之后需要增加一个空行
                    tableModelProperty = new HuayiModelProperty();
                    tableModelProperty.setSpecification("");
                    tableHeaderExcel.add(tableModelProperty);
                }


            }


        }
        multipleSheelPropety.setData(tableHeaderExcel);
        multipleSheelPropety.setSheet(sheet);

        list1.add(multipleSheelPropety);


        // 增加一个拓展的热镀锌方管
        j++;
        List<String> kinds_FG = new ArrayList<>();
        kinds_FG.add("30*30");
        kinds_FG.add("40*40");
        kinds_FG.add("50*50");
        kinds_FG.add("60*60");
        kinds_FG.add("80*80");
        kinds_FG.add("100*100");
        kinds_FG.add("120*120");
        kinds_FG.add("150*150");
        kinds_FG.add("200*200");
        kinds_FG.add("20*40");
        kinds_FG.add("30*50");
        kinds_FG.add("40*60");
        kinds_FG.add("40*80");
        kinds_FG.add("50*100");
        kinds_FG.add("60*80");
        kinds_FG.add("60*120");
        kinds_FG.add("80*160");

        ExcelUtil.MultipleSheelPropety multipleSheelPropety_FG = new ExcelUtil.MultipleSheelPropety();
        List<HuayiModelProperty> tableHeaderExcel_FG = new ArrayList<HuayiModelProperty>();
        // 初始化表名
        Sheet sheet_FG = new Sheet(j,0);
        sheet_FG.setSheetName("热镀锌方管");
        for (String specification : kinds_FG) {
            // 默认5000 一吨
            BigDecimal priceTonPrice = new BigDecimal(req40002.getRFGPrice());
            // 截取长,宽
            int weigth = Integer.parseInt(specification.split("\\*")[0]);
            int legth = Integer.parseInt(specification.split("\\*")[1]);

            for (int m=0;m<11;m++){  // 每种型号 12个厚度，先统一设置单价5000/吨

                HuayiModelProperty tableModelProperty = new HuayiModelProperty();
                tableModelProperty.setSpecification(specification);
                double thickness = 2.5+0.25*m;
                BigDecimal weightPer = new BigDecimal((weigth+legth)*2*6*thickness*0.00785).setScale(3,BigDecimal.ROUND_UP);

                tableModelProperty.setThickness(thickness+"");
                tableModelProperty.setKinds("RFG");
                tableModelProperty.setTranDt(tranDate);
                tableModelProperty.setTonPrice(priceTonPrice.multiply(new BigDecimal("1000")).setScale(2,BigDecimal.ROUND_UP));
                tableModelProperty.setWeightPer(weightPer);
                tableModelProperty.setCostPrice(weightPer.multiply(priceTonPrice).setScale(2,BigDecimal.ROUND_UP));
                tableModelProperty.setQuanlity(BigDecimal.ZERO);
                tableHeaderExcel_FG.add(tableModelProperty);


                if (m==10){ // 每种型号最后一个厚度之后需要增加一个空行
                    tableModelProperty = new HuayiModelProperty();
                    tableModelProperty.setSpecification("");
                    tableHeaderExcel_FG.add(tableModelProperty);
                }


            }


        }
        multipleSheelPropety_FG.setData(tableHeaderExcel_FG);
        multipleSheelPropety_FG.setSheet(sheet_FG);

        list1.add(multipleSheelPropety_FG);



        ExcelUtil.writeWithMultipleSheel(fileFullPath,list1);

        LOG.info("export end <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        resp40002.setFileFullPath(fileFullPath);
        resp40002.setExportDate(tranDate);
        context.setBaseResp(resp40002);
        LOG.info("T40002 交易 end<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
