package com.huayi.ljj.springcloud.trans.pojo.req;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.req-Req40801
 * date: 2020/7/3 17:36
 */
@Data
public class Req40801 extends BaseReq {
    private static final long serialVersionUID = 8711049143354714969L;
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


}
