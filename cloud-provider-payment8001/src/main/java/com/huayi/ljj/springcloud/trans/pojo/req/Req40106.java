package com.huayi.ljj.springcloud.trans.pojo.req;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req40106 extends BaseReq {
    private static final long serialVersionUID = -2739784673758132199L;

    /**
     * 厂商简码
     */
    private String manufacturerCode;

    /**
     * 厂商名称
     */
    private String manufacturerNm;

    /**
     * 厂商电话
     */
    private String manufacturerTel;

    /**
     * 运输单价
     */
    private BigDecimal transportationExpense;

    /**
     * 更新日期
     */
    private String updateDt;

    /**
     * 交易日期
     */
    private String transDt;

    /**
     * 交易时间
     */
    private String transTm;

}
