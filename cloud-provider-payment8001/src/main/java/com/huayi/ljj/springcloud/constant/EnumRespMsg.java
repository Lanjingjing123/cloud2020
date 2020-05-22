package com.huayi.ljj.springcloud.constant;

public enum  EnumRespMsg {

    /**
     * 交易失败
     */
    FALIURE("999999","交易失败"),
    /**
     * 交易成功
     */
    SUCCESS("000000","交易成功")
    ;
    EnumRespMsg(String code,String msg){
        this.code = code;
        this.msg = msg;

    }
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
