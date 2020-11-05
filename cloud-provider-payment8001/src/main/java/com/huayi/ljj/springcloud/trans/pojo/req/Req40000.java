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
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.req-Req40000
 * date: 2020/11/4 15:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req40000 extends BaseReq {
    private static final long serialVersionUID = 4164624459074141489L;

    /**
     * 产品名称:方管-fg,扁管-bg,圆管-yg,其他-qt
     */
    private String productNm;

    /**
     * 导出路径-绝对路径
     */
    private String exportPath;

    private String extfld1;

    private String extfld2;



}
