package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblBuyTrans implements Serializable {
    /**
     * 进货公司
     */
    private String company;

    /**
     * 货名
     */
    private String goodsNm;

    /**
     * 规格
     */
    private String specification;

    /**
     * 厚度
     */
    private String thickness;

    /**
     * 每件支数
     */
    private BigDecimal quantityPer;

    /**
     * 件数
     */
    private BigDecimal numberOfCases;

    /**
     * 总支数
     */
    private BigDecimal quanlity;

    /**
     * 总重
     */
    private BigDecimal totalWeight;

    /**
     * 进价单价
     */
    private BigDecimal price;

    /**
     * 进价总金额
     */
    private BigDecimal totalAmount;

    /**
     * 货、搬运费
     */
    private BigDecimal fee;

    /**
     * 单支重量
     */
    private BigDecimal weightPer;

    /**
     * 成本价格
     */
    private BigDecimal costPrice;

    /**
     * 备注
     */
    private String memo;

    /**
     * 
     */
    private String tranDt;

    /**
     * buy_trans
     */
    private static final long serialVersionUID = 1L;

    /**
     * 进货公司
     * @return COMPANY 进货公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 进货公司
     * @param company 进货公司
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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
     * 每件支数
     * @return quantity_per 每件支数
     */
    public BigDecimal getQuantityPer() {
        return quantityPer;
    }

    /**
     * 每件支数
     * @param quantityPer 每件支数
     */
    public void setQuantityPer(BigDecimal quantityPer) {
        this.quantityPer = quantityPer;
    }

    /**
     * 件数
     * @return NUMBER_OF_CASES 件数
     */
    public BigDecimal getNumberOfCases() {
        return numberOfCases;
    }

    /**
     * 件数
     * @param numberOfCases 件数
     */
    public void setNumberOfCases(BigDecimal numberOfCases) {
        this.numberOfCases = numberOfCases;
    }

    /**
     * 总支数
     * @return quanlity 总支数
     */
    public BigDecimal getQuanlity() {
        return quanlity;
    }

    /**
     * 总支数
     * @param quanlity 总支数
     */
    public void setQuanlity(BigDecimal quanlity) {
        this.quanlity = quanlity;
    }

    /**
     * 总重
     * @return total_weight 总重
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * 总重
     * @param totalWeight 总重
     */
    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * 进价单价
     * @return price 进价单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 进价单价
     * @param price 进价单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 进价总金额
     * @return total_amount 进价总金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 进价总金额
     * @param totalAmount 进价总金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 货、搬运费
     * @return fee 货、搬运费
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 货、搬运费
     * @param fee 货、搬运费
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 单支重量
     * @return weight_per 单支重量
     */
    public BigDecimal getWeightPer() {
        return weightPer;
    }

    /**
     * 单支重量
     * @param weightPer 单支重量
     */
    public void setWeightPer(BigDecimal weightPer) {
        this.weightPer = weightPer;
    }

    /**
     * 成本价格
     * @return cost_price 成本价格
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * 成本价格
     * @param costPrice 成本价格
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 备注
     * @return memo 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 备注
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 
     * @return TRAN_DT 
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", company=").append(company);
        sb.append(", goodsNm=").append(goodsNm);
        sb.append(", specification=").append(specification);
        sb.append(", thickness=").append(thickness);
        sb.append(", quantityPer=").append(quantityPer);
        sb.append(", numberOfCases=").append(numberOfCases);
        sb.append(", quanlity=").append(quanlity);
        sb.append(", totalWeight=").append(totalWeight);
        sb.append(", price=").append(price);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", fee=").append(fee);
        sb.append(", weightPer=").append(weightPer);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", memo=").append(memo);
        sb.append(", tranDt=").append(tranDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}