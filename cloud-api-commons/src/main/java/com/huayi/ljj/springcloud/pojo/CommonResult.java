package com.huayi.ljj.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lanjingjing
 * @description 前后端分离通用返回
 * @date 2020/4/6
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回的数据，可为空
     */
    private T data;
    public CommonResult(Integer code , String message){
        this(code,message,null);
    }
}
