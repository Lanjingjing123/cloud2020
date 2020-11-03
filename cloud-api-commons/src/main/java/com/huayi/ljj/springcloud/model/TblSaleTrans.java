package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblSaleTrans implements Serializable {
    /**
     * 收货单位
     */
    private String buyer;

    /**
     * 货名
     */
    private String goodsNm;

    /**
     * 规格
     */
    private String specification;

    /**
     * 单位
     */
    private String unit;

    /**
     * 数量
     */
    private BigDecimal quanlity;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 是否付款
     */
    private String payment;

    /**
     * 
     */
    private String memo;

    /**
     * 交易日期
     */
    private String tranDt;

    /**
     * 清单编号
     */
    private String orderNo;

    /**
     * 厚度
     */
    private String thickness;

    /**
     * sale_trans
     */
    private static final long serialVersionUID = 1L;

    /**
     * 收货单位
     * @return BUYER 收货单位
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * 收货单位
     * @param buyer 收货单位
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    /**
     * 货名
     * @return GOODS_NM 货名
     */
    public String getGoodsNm() {
        return goodsNm;
    }

    /**
     * 货名
     * @param goodsNm 货名
     */
    public void setGoodsNm(String goodsNm) {
        this.goodsNm = goodsNm == null ? null : goodsNm.trim();
    }

    /**
     * 规格
     * @return SPECIFICATION 规格
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * 规格
     * @param specification 规格
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * 单位
     * @return UNIT 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 单位
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 数量
     * @return QUANLITY 数量
     */
    public BigDecimal getQuanlity() {
        return quanlity;
    }

    /**
     * 数量
     * @param quanlity 数量
     */
    public void setQuanlity(BigDecimal quanlity) {
        this.quanlity = quanlity;
    }

    /**
     * 单价
     * @return PRICE 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 单价
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 金额
     * @return AMOUNT 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 金额
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 是否付款
     * @return PAYMENT 是否付款
     */
    public String getPayment() {
        return payment;
    }

    /**
     * 是否付款
     * @param payment 是否付款
     */
    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    /**
     * 
     * @return memo 
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 
     * @param memo 
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 交易日期
     * @return TRAN_DT 交易日期
     */
    public String getTranDt() {
        return tranDt;
    }

    /**
     * 交易日期
     * @param tranDt 交易日期
     */
    public void setTranDt(String tranDt) {
        this.tranDt = tranDt == null ? null : tranDt.trim();
    }

    /**
     * 清单编号
     * @return ORDER_NO 清单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 清单编号
     * @param orderNo 清单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 厚度
     * @return THICKNESS 厚度
     */
    public String getThickness() {
        return thickness;
    }

    /**
     * 厚度
     * @param thickness 厚度
     */
    public void setThickness(String thickness) {
        this.thickness = thickness == null ? null : thickness.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", buyer=").append(buyer);
        sb.append(", goodsNm=").append(goodsNm);
        sb.append(", specification=").append(specification);
        sb.append(", unit=").append(unit);
        sb.append(", quanlity=").append(quanlity);
        sb.append(", price=").append(price);
        sb.append(", amount=").append(amount);
        sb.append(", payment=").append(payment);
        sb.append(", memo=").append(memo);
        sb.append(", tranDt=").append(tranDt);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", thickness=").append(thickness);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}