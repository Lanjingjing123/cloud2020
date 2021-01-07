package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblHuayiGoods implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 规格
     */
    private String specification;

    /**
     * 厚度
     */
    private String thickness;

    /**
     * 支数
     */
    private BigDecimal quanlity;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

    /**
     * 重量(kg)
     */
    private BigDecimal weightPer;

    /**
     * 
     */
    private String tranDt;

    /**
     * 
     */
    private BigDecimal count;

    /**
     * 种类
     */
    private String kinds;

    /**
     * huayi_goods
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return ID 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
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

    /**
     * 支数
     * @return quanlity 支数
     */
    public BigDecimal getQuanlity() {
        return quanlity;
    }

    /**
     * 支数
     * @param quanlity 支数
     */
    public void setQuanlity(BigDecimal quanlity) {
        this.quanlity = quanlity;
    }

    /**
     * 成本价
     * @return cost_price 成本价
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * 成本价
     * @param costPrice 成本价
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 重量(kg)
     * @return weight_per 重量(kg)
     */
    public BigDecimal getWeightPer() {
        return weightPer;
    }

    /**
     * 重量(kg)
     * @param weightPer 重量(kg)
     */
    public void setWeightPer(BigDecimal weightPer) {
        this.weightPer = weightPer;
    }

    /**
     * 
     * @return tran_dt 
     */
    public String getTranDt() {
        return tranDt;
    }

    /**
     * 
     * @param tranDt 
     */
    public void setTranDt(String tranDt) {
        this.tranDt = tranDt == null ? null : tranDt.trim();
    }

    /**
     * 
     * @return count 
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
     * 
     * @param count 
     */
    public void setCount(BigDecimal count) {
        this.count = count;
    }

    /**
     * 种类
     * @return kinds 种类
     */
    public String getKinds() {
        return kinds;
    }

    /**
     * 种类
     * @param kinds 种类
     */
    public void setKinds(String kinds) {
        this.kinds = kinds == null ? null : kinds.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", specification=").append(specification);
        sb.append(", thickness=").append(thickness);
        sb.append(", quanlity=").append(quanlity);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", weightPer=").append(weightPer);
        sb.append(", tranDt=").append(tranDt);
        sb.append(", count=").append(count);
        sb.append(", kinds=").append(kinds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}