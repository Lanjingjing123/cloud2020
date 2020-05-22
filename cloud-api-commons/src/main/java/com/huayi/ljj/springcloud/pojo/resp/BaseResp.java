package com.huayi.ljj.springcloud.pojo.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResp implements Serializable {
    private static final long serialVersionUID = 7294420185418764083L;

    /**
     * 创建时间
     */
    private String createData;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 后台流水
     */
    private String tranJnno;
    /**
     * 发送方系统号
     */
    private String senderSID;
    /**
     * 响应码
     */
    private String respCode;
    /**
     * 响应信息
     */
    private String respMsg;
    /**
     * 拓展信息
     */
    private Map<String,Object> map;
}
