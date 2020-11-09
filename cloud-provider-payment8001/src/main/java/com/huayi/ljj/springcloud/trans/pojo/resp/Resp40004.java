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
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.resp-Resp40004
 * date: 2020/11/9 0:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resp40004 extends BaseResp {
    private static final long serialVersionUID = 1533761941132997714L;

    /**
     * 处理的导入文件日期
     */
    private String importDate;
}
