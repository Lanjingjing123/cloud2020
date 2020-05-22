package com.huayi.ljj.springcloud.pojo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseReq  implements Serializable {
    private static final long serialVersionUID = -8423701392202132000L;
    /**
     * 交易码
     */
    private String transCode;
    /**
     * 创建时间
     */
    private String createData;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 发送方系统号
     */
    private String senderSID;
    /**
     * 前台流水号
     */
    private String fsideJnno;
    /**
     * 客户号
     */
    private String customerNo;
    /**
     * 客户姓名
     */
    private String customerNm;
    /**
     * 扩展信息
     */
    private Map<String,Object> map;
}
