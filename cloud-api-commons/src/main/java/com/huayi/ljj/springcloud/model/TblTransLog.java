package com.huayi.ljj.springcloud.model;

import java.io.Serializable;

public class TblTransLog implements Serializable {
    /**
     * 流水号
     */
    private String transNo;

    /**
     * 交易日期
     */
    private String transDt;

    /**
     * 交易时间
     */
    private String transTm;

    /**
     * 事件
     */
    private String event;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 
     */
    private String transCd;

    /**
     * 产品号
     */
    private String prodCd;

    /**
     * 操作人
     */
    private String operatorNm;

    /**
     * 操作人ID
     */
    private String operatorId;

    /**
     * tbl_trans_log
     */
    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     * @return TRANS_NO 流水号
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * 流水号
     * @param transNo 流水号
     */
    public void setTransNo(String transNo) {
        this.transNo = transNo == null ? null : transNo.trim();
    }

    /**
     * 交易日期
     * @return TRANS_DT 交易日期
     */
    public String getTransDt() {
        return transDt;
    }

    /**
     * 交易日期
     * @param transDt 交易日期
     */
    public void setTransDt(String transDt) {
        this.transDt = transDt == null ? null : transDt.trim();
    }

    /**
     * 交易时间
     * @return TRANS_TM 交易时间
     */
    public String getTransTm() {
        return transTm;
    }

    /**
     * 交易时间
     * @param transTm 交易时间
     */
    public void setTransTm(String transTm) {
        this.transTm = transTm == null ? null : transTm.trim();
    }

    /**
     * 事件
     * @return EVENT 事件
     */
    public String getEvent() {
        return event;
    }

    /**
     * 事件
     * @param event 事件
     */
    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }

    /**
     * 订单编号
     * @return ORDER_NO 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 订单编号
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 
     * @return TRANS_CD 
     */
    public String getTransCd() {
        return transCd;
    }

    /**
     * 
     * @param transCd 
     */
    public void setTransCd(String transCd) {
        this.transCd = transCd == null ? null : transCd.trim();
    }

    /**
     * 产品号
     * @return PROD_CD 产品号
     */
    public String getProdCd() {
        return prodCd;
    }

    /**
     * 产品号
     * @param prodCd 产品号
     */
    public void setProdCd(String prodCd) {
        this.prodCd = prodCd == null ? null : prodCd.trim();
    }

    /**
     * 操作人
     * @return OPERATOR_NM 操作人
     */
    public String getOperatorNm() {
        return operatorNm;
    }

    /**
     * 操作人
     * @param operatorNm 操作人
     */
    public void setOperatorNm(String operatorNm) {
        this.operatorNm = operatorNm == null ? null : operatorNm.trim();
    }

    /**
     * 操作人ID
     * @return OPERATOR_ID 操作人ID
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * 操作人ID
     * @param operatorId 操作人ID
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transNo=").append(transNo);
        sb.append(", transDt=").append(transDt);
        sb.append(", transTm=").append(transTm);
        sb.append(", event=").append(event);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", transCd=").append(transCd);
        sb.append(", prodCd=").append(prodCd);
        sb.append(", operatorNm=").append(operatorNm);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}