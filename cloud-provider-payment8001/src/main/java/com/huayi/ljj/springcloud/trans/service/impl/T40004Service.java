package com.huayi.ljj.springcloud.trans.service.impl;

import com.alibaba.excel.metadata.Sheet;
import com.huayi.ljj.springcloud.dao.TblBuyTransMapper;
import com.huayi.ljj.springcloud.dao.TblSaleTransMapper;
import com.huayi.ljj.springcloud.exception.BaseException;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40004;
import com.huayi.ljj.springcloud.util.ExcelUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.service.impl-T40004Service
 * date: 2020/11/9 0:09
 *  导入文件
 */

@Service("t40004")
public class T40004Service extends BaseService {

    private static final Logger LOG = LoggerFactory.getLogger(T40004Service.class);
    @Resource
    private TblBuyTransMapper tblBuyTransMapper;

    @Resource
    private TblSaleTransMapper tblSaleTransMapper;

    @Override
    public void action(IServiceContext context) throws Exception {
        Req40004 req40004 = (Req40004)context.getBaseReq();
        LOG.info("请求：[{}]",req40004);

        // 文件全路径
        String fileFullPath = req40004.getFileFullPath();
        // 读文件
        // 从第三个sheet，第二行开始-index=1:第二行
        Sheet sheet = new Sheet(Integer.parseInt(req40004.getSheetNo()), Integer.parseInt(req40004.getHeadLineMun()));
        sheet.setSheetName(req40004.getImportDate());
        List<Object> objects = ExcelUtil.readLessThan1000RowBySheet(fileFullPath,sheet);
        objects.forEach(System.out::println);

        //入库
        if (req40004.getType().equals("in")){
            LOG.info("录入进货表");

        }else if(req40004.getType().equals("out")){// 出库
            LOG.info("录入出库表");

        }else{
            throw new BaseException("020001","type值只能传入in-入库,out-出库");
        }




    }
}
