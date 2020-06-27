package com.huayi.ljj.springcloud.trans.pojo.req;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lanjingjing
 * @description 产品种类配置
 * @date 2020/6/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req40105 extends BaseReq {
    /**
     * 产品编号
     */
    private String productNo;

    /**
     * 产品名称
     */
    private String productNm;

    /**
     * 产品型号
     */
    private String productKind;

    /**
     * 产品厚度
     */
    private String productThickness;

    /**
     * 产品长度
     */
    private String productLength;

    /**
     * 产品理论重量
     */
    private String productTheoryWeight;

    /**
     * 产品实际平均重量
     */
    private String productActulWeight;
}
