package com.huayi.ljj.springcloud.trans.pojo.resp;

import com.huayi.ljj.springcloud.pojo.resp.BaseResp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resp40106 extends BaseResp {
    private static final long serialVersionUID = -2589272362989079839L;
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
