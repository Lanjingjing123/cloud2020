package com.huayi.ljj.springcloud.trans.pojo.resp;

import com.huayi.ljj.springcloud.pojo.resp.BaseResp;
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
public class Resp40105 extends BaseResp {
    private static final long serialVersionUID = -5859567475401123533L;
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
