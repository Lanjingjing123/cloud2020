package com.huayi.ljj.springcloud.service.base;

import com.huayi.ljj.springcloud.service.IService;
import com.huayi.ljj.springcloud.service.IServiceContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.service.base-BaseQueryService
 * date: 2020/7/13 11:37
 */
public abstract class BaseQueryService  implements IService {
    /**
     * 业务类重写此方法,实现业务实现
     */
    public abstract void action (IServiceContext context) throws Exception;

    @Override
    public void execute(IServiceContext context) throws Exception {
        action(context);
    }
}
