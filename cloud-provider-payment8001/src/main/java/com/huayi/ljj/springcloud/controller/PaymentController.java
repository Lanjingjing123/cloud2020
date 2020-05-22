package com.huayi.ljj.springcloud.controller;

import com.huayi.ljj.springcloud.base.impl.BasePortalTransferServiceImpl;
import com.huayi.ljj.springcloud.model.Payment;
import com.huayi.ljj.springcloud.pojo.CommonResult;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.*;
import com.huayi.ljj.springcloud.service.impl.BaseServiceContext;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lanjingjing
 * @description controller
 * @date 2020/4/6
 */
@RestController
@Slf4j
public class PaymentController {

    private static Logger LOG = LoggerFactory.getLogger(PaymentController.class);
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @Autowired
    private BaseServiceFactory baseServiceFactory;

    @Autowired
    private BasePortalTransferServiceImpl basePortalTransferService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        LOG.info("=============插入的结果{}]============",result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功,服务端口："+serverPort,result);

        }else {
            return new CommonResult(404,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id){
        Payment payment = paymentService.getPaymentById(id);
        LOG.info("12323123");
        LOG.info("=============查询的结果*{}]============",payment);
        if (payment !=null){
            return new CommonResult(200,"查询成功,服务端口："+serverPort,payment);

        }else {
            return new CommonResult(404,"无相关记录，查询ID："+id,null);
        }
    }


    @GetMapping(value = "/test")
    public CommonResult getPaymentById() throws Exception {
        IService service = baseServiceFactory.getServiceByTransCode("12345");
        System.out.println(service);
        if (service != null){
            return new CommonResult(200,"查询成功,服务端口："+serverPort,"1");
        }else {
            return new CommonResult(404,"无相关记录，查询ID：",null);
        }
    }

    @PostMapping(value = "/test")
    public CommonResult test(@RequestBody BaseReq baseReq) throws Exception {
        LOG.info("入参:[{}]",baseReq);
        IServiceContext context = new BaseServiceContext();
        // 设置统一上下文参数
        context.setBaseReq(baseReq);
        context.setParameter("a","123");
        context.setParameter("b","234");

        if ( basePortalTransferService!= null ){
            LOG.info("调用BasePortalTransferServiceImpl,服务前统一入口接入处理>>>>>>>>>>>");
            basePortalTransferService.execute(context);
            LOG.info("调用BasePortalTransferServiceImpl,服务统一入口接入处理结束<<<<<<<<<<<<<<");
            return new CommonResult(200,"查询成功,服务端口："+serverPort,"1");
        }else {
            return new CommonResult(404,"无相关记录，查询ID：",null);
        }
    }

}
