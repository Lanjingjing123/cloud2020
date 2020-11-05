package com.huayi.ljj.springcloud.trans.pojo.resp;

import com.huayi.ljj.springcloud.pojo.resp.BaseResp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.resp-Resp40000
 * date: 2020/11/4 15:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resp40000 extends BaseResp {

    private static final long serialVersionUID = -6141024592957371933L;

    /**
     * 文件名称
     */
    private String fileName;
}
