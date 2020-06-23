package com.huayi.ljj.springcloud.controller;

import com.huayi.ljj.springcloud.base.impl.GatewayCallService;
import com.huayi.ljj.springcloud.constant.EnumRespMsg;
import com.huayi.ljj.springcloud.model.Payment;
import com.huayi.ljj.springcloud.pojo.CommonResult;
import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.pojo.resp.BaseResp;
import com.huayi.ljj.springcloud.service.*;
import com.huayi.ljj.springcloud.service.impl.BaseServiceContext;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

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

    @Autowired
    private BaseServiceFactory baseServiceFactory;

    @Autowired
    private GatewayCallService gatewayCallService;

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
    public BaseResp test(@RequestBody BaseReq baseReq) throws Exception {


        LOG.info("入参:[{}]",baseReq);
        IServiceContext context = new BaseServiceContext();
        // 设置统一上下文参数
        context.setBaseReq(baseReq);
        context.setParameter("a","123");
        context.setParameter("b","234");

        if ( gatewayCallService != null ){
            LOG.info("调用BasePortalTransferServiceImpl,服务前统一入口接入处理>>>>>>>>>>>");
            gatewayCallService.execute(context);
            LOG.info("调用BasePortalTransferServiceImpl,服务统一入口接入处理结束<<<<<<<<<<<<<<");

        }else{
            LOG.error("beanID=basePortalTransferService实例化失败...");
            // 赋响应信息
            BaseResp baseResp = new BaseResp();
            baseResp.setRespCode(EnumRespMsg.FALIURE.getCode());
            baseResp.setRespMsg(EnumRespMsg.FALIURE.getMsg());
            context.setBaseResp(baseResp);
        }

        BaseResp baseResp = context.getBaseResp();
        LOG.info("平台响应信息[{}]",baseResp);
        return baseResp;
    }

    @PostMapping(value = "/test2")
    public BaseResp test(@RequestBody Map<String,String> reqMap) throws Exception {

        LOG.info("============【原始请求】:{}============",reqMap);

        IServiceContext context = new BaseServiceContext();
        // 设置统一上下文参数

        context.setParameter("reqMap",reqMap);
        context.setParameter("a","123");
        context.setParameter("b","234");

        if ( gatewayCallService != null ){
            LOG.info("调用BasePortalTransferServiceImpl,服务前统一入口接入处理>>>>>>>>>>>");
            gatewayCallService.execute(context);
            LOG.info("调用BasePortalTransferServiceImpl,服务统一入口接入处理结束<<<<<<<<<<<<<<");

        }else{
            LOG.error("beanID=basePortalTransferService实例化失败...");
            // 赋响应信息
            BaseResp baseResp = new BaseResp();
            baseResp.setRespCode(EnumRespMsg.FALIURE.getCode());
            baseResp.setRespMsg(EnumRespMsg.FALIURE.getMsg());
            context.setBaseResp(baseResp);
        }

        BaseResp baseResp = context.getBaseResp();
        LOG.info("======平台响应信息[{}]======",baseResp);
        return baseResp;
    }

}
