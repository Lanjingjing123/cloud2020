package com.huayi.ljj.springcloud.trans.pojo.resp;

import com.huayi.ljj.springcloud.pojo.resp.BaseResp;
import com.huayi.ljj.springcloud.trans.pojo.resp.sub.Resp40801List1;
import lombok.Data;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.trans.pojo.resp-Resp40801
 * date: 2020/7/3 17:38
 */
@Data
public class Resp40801 extends BaseResp {
    private static final long serialVersionUID = -554643423401374197L;
    private List<Resp40801List1> list;
}
