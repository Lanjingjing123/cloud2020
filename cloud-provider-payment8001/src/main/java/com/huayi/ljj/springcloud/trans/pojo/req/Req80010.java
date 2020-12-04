package com.huayi.ljj.springcloud.trans.pojo.req;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req80010  extends BaseReq {
    /**
     * 统计起始日期
     */
    private String beginDt;

    /**
     * 统计结束日期
     */
    private String endDt;
}
