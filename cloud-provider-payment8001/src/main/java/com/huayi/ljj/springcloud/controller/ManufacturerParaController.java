package com.huayi.ljj.springcloud.controller;

import com.huayi.ljj.springcloud.model.TblManuFacturerPara;
import com.huayi.ljj.springcloud.pojo.CommonResult;
import com.huayi.ljj.springcloud.service.IManufactureParaManager;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@Slf4j
public class ManufacturerParaController {
    private static Logger logger = LoggerFactory.getLogger(ManufacturerParaController.class);
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private IManufactureParaManager manufactureParaManager;

//    @PostMapping(value = "/manufacturePara/create")
    @RequestMapping(value = "/manufacturePara/create",method = RequestMethod.POST)
    public CommonResult create(@RequestBody TblManuFacturerPara tblManuFacturerPara){

        logger.info("=============request[{}]============",tblManuFacturerPara);
        int result = manufactureParaManager.create(tblManuFacturerPara);
        logger.info("=============插入的结果{}]============",result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功,服务端口："+serverPort,result);

        }else {
            return new CommonResult(404,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/manufacturePara/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") String id){
        TblManuFacturerPara tblManuFacturerPara = manufactureParaManager.getManuFacturerParaById(id);
        logger.info("12323123");
        logger.info("=============查询的结果*{}]============",tblManuFacturerPara);
        if (tblManuFacturerPara !=null){
            return new CommonResult(200,"查询成功,服务端口："+serverPort,tblManuFacturerPara);

        }else {
            return new CommonResult(404,"无相关记录，查询ID："+id,null);
        }
    }



}
