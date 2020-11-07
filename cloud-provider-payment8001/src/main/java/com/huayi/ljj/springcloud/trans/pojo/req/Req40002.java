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
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.req-Req40002
 * date: 2020/11/7 8:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req40002  extends BaseReq {


    private static final long serialVersionUID = -4229379891694395332L;

    /**
     *  数据导出日期
     */
    private String exportDate;
    /**
     * 产品名称:方管-fg,扁管-bg,圆管-yg,其他-qt
     */
    private String productNm;

    /**
     * 导出路径
     */
    private String exportPath;

}
