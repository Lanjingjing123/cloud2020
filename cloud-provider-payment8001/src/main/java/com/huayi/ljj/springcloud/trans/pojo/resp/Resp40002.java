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
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.resp-Resp40002
 * date: 2020/11/7 9:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resp40002 extends BaseResp {
    private static final long serialVersionUID = 8458973697247226147L;

    /**
     * 导出日期
     */
    private String exportDate;
    /**
     * 文件全路径
     */
    private String fileFullPath;


}
