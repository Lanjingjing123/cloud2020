package com.huayi.ljj.springcloud.trans.pojo.req;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req400601 extends BaseReq {
    private static final long serialVersionUID = 1929734492216747681L;

    private String orderNo;

    private String kinds;

}
