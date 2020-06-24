package com.huayi.ljj.springcloud.constant;

public enum  EnumRespMsg {

    /**
     * 交易失败
     */
    FALIURE("999999","交易失败"),
    /**
     * 交易成功
     */
    SUCCESS("000000","交易成功"),
    /**
     * 交易码未正确配置
     */
    TRANS_CODE_NOT_FOUND("HY3001","交易码未正确配置"),
    /**
     * 交易报文转换对应交易报文出错
     */
    TRANS_MESSAGE("HY3002","交易报文转换对应交易报文出错"),
    /**
     * 插入数据库失败
     */
    INSERT_DATABASE_FALIURE("DB1001","插入数据库失败")
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
