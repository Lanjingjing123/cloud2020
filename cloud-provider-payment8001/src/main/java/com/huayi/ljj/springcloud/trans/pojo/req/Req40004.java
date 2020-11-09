package com.huayi.ljj.springcloud.trans.pojo.req;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.service.base.BaseService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.req-Req40004
 * date: 2020/11/9 0:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req40004 extends BaseReq {
    private static final long serialVersionUID = 7152704625069545785L;

    /**
     * 文件全路径
     */
    private String fileFullPath;
    /**
     * 导入的文件日期
     */
    private String importDate;

    /**
     * sheet 索引，从1开始
     */
    private String sheetNo;

    /**
     * 每个sheet读取的开始索引，从0开始
     */
    private String headLineMun;

    /**
     * in-入库；out-出库
     */
    private String type;

}
