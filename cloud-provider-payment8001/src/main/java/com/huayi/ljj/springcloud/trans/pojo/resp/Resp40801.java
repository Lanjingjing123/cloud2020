package com.huayi.ljj.springcloud.trans.pojo.resp;

import com.huayi.ljj.springcloud.pojo.resp.BaseResp;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.resp-Resp40801
 * date: 2020/7/3 17:38
 */
@Data
public class Resp40801 extends BaseResp {
    private static final long serialVersionUID = -554643423401374197L;
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
