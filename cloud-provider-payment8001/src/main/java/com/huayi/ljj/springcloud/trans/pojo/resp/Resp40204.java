package com.huayi.ljj.springcloud.trans.pojo.resp;

import com.huayi.ljj.springcloud.pojo.resp.BaseResp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resp40204 extends BaseResp {
    private static final long serialVersionUID = 8106333458198939241L;
    private String orderNo;
}
