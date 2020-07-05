package com.huayi.ljj.springcloud.trans.pojo.resp.sub;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lanjingjing
 * @description 集合
 * @date 2020/7/5
 */
@Data
public class Resp40801List1 implements Serializable {
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
