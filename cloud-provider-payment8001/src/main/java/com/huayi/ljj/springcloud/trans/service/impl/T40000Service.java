package com.huayi.ljj.springcloud.trans.service.impl;

import com.huayi.ljj.springcloud.service.IServiceContext;
import com.huayi.ljj.springcloud.service.base.BaseService;
import com.huayi.ljj.springcloud.trans.pojo.req.Req40000;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.service.impl-T40000Service
 * date: 2020/11/4 11:45
 * @doc : 每日导出excel文件
 * 步骤：查询出数据库前一日的所有型号数据，型号按照方管，扁管，角钢，圆管
 */
public class T40000Service extends BaseService {
    @Override
    public void action(IServiceContext context) throws Exception {
        Req40000 req40000 = (Req40000)context.getBaseReq();


    }
}
