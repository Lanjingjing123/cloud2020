package com.huayi.ljj.springcloud.exception;

public class BaseException extends Exception {
    private static final long serialVersionUID = 1779993643126543901L;

    public String iErrCode="";

    public String iErrMessage="";

    public BaseException(String aMessage){
        super(aMessage);
        this.iErrMessage = aMessage;
    }

    public BaseException(String code,String aMessage){
        super(aMessage);
        this.iErrCode = code.trim();
        this.iErrMessage = aMessage;
    }

    public BaseException(Throwable cause){
        super(cause);
    }

    public String getiErrMessage() {
        return iErrMessage;
    }

    public String getiErrCode() {
        return iErrCode;
    }

    public static void main(String[] args) {
        int i = 12;
        if (i>1){
            try {
                throw new BaseException("200120","错误信息测试");
            } catch (BaseException e) {
                System.out.println(e.getiErrCode()+":"+e.getiErrMessage());
                e.printStackTrace();
            }
        }
    }

}
