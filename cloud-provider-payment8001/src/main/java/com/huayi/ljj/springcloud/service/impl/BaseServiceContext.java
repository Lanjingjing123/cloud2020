package com.huayi.ljj.springcloud.service.impl;

import com.huayi.ljj.springcloud.pojo.req.BaseReq;
import com.huayi.ljj.springcloud.pojo.resp.BaseResp;
import com.huayi.ljj.springcloud.service.IServiceContext;

import java.util.HashMap;
import java.util.Map;

    public class BaseServiceContext implements IServiceContext {
    /**
     * 服务请求对象
     */
    private BaseReq baseReq = null;

    /**
     * 服务响应对象
     */
    private BaseResp baseResp= null;

    private Map<String,Object> parameterMap = new HashMap<String, Object>();

    @Override
    public BaseReq getBaseReq() {
        return this.baseReq;
    }

    @Override
    public void setBaseReq(BaseReq baseReq) {
        this.baseReq = baseReq;
    }

    @Override
    public BaseResp getBaseResp() {
        return this.baseResp;
    }

    @Override
    public void setBaseResp(BaseResp baseResp) {
        this.baseResp = baseResp;
    }

    /**
     * 获取上下文参数
     * @param key
     * @param <E>
     * @return
     */
    @Override
    public <E> E getParameter(String key) {
        return (E)this.parameterMap.get(key);
    }

    /**
     * 设置上下文参数
     * @param key
     * @param value
     */
    @Override
    public void setParameter(String key, Object value) {
        this.parameterMap.put(key,value);
    }


    @Override
    public boolean containsParameter(String key) {
        return this.parameterMap.containsKey(key);
    }

    @Override
    public Map<String, Object> getParameterMap() {
        return this.parameterMap;
    }

    @Override
    public String toString() {
        return "BaseServiceContext{" +
                "baseReq=" + baseReq +
                ", baseResp=" + baseResp +
                ", parameterMap=" + parameterMap +
                '}';
    }
}
