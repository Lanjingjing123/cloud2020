package com.huayi.ljj.springcloud.service;

import java.util.Map;

public abstract interface IEpayContext {
    public abstract <E> E getParameter(String paramString);

    public abstract void setParameter(String paramString,Object paramObject);

    public abstract boolean containsParameter(String paramString);

    public abstract Map<String,Object> getParameterMap();
}
