package com.huayi.ljj.springcloud.trans.service.impl;

import com.alibaba.excel.metadata.Sheet;
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
        ExcelUtil.writeWithMultipleSheel(fileFullPath,list1);

        LOG.info("export end <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        resp40002.setFileFullPath(fileFullPath);
        resp40002.setExportDate(tranDate);
        context.setBaseResp(resp40002);
        LOG.info("T40002 交易 end<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
