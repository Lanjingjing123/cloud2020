package com.huayi.ljj.springcloud.trans.pojo.req;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req40204 extends BaseReq {

    private static final long serialVersionUID = -5306733088465320831L;
    private String orderNo;

    private String kinds;
}
