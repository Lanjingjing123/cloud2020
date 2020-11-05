package com.huayi.ljj.springcloud.trans.pojo.req;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.req-Req50001
 * date: 2020/9/18 15:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req50001 extends BaseReq {
    private static final long serialVersionUID = 531529964924665396L;

    private String loginName;
    private  String loginPassword;


}
