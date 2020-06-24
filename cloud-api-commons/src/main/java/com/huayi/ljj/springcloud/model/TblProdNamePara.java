package com.huayi.ljj.springcloud.model;

import java.io.Serializable;

public class TblProdNamePara implements Serializable {
    /**
     * 产品编号
     */
    private String productNo;

    /**
     * 产品名称
     */
    private String productNm;

    /**
     * 产品型号
     */
    private String productKind;

    /**
     * 产品厚度
     */
    private String productThickness;

    /**
     * 产品长度
     */
    private String productLength;

    /**
     * 产品理论重量
     */
    private String productTheoryWeight;

    /**
     * 产品实际平均重量
     */
    private String productActulWeight;

    /**
     * 创建日期
     */
    private String creatDt;

    /**
     * 交易日期
     */
    private String transDt;

    /**
     * 交易时间
     */
    private String transTm;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 
     */
    private String extfld1;

    /**
     * 
     */
    private String extfld2;

    /**
     * 
     */
    private String extfld3;

    /**
     * tbl_prod_name_para
     */
    private static final long serialVersionUID = 1L;

    /**
     * 产品编号
     * @return PRODUCT_NO 产品编号
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * 产品编号
     * @param productNo 产品编号
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    /**
     * 产品名称
     * @return PRODUCT_NM 产品名称
     */
    public String getProductNm() {
        return productNm;
    }

    /**
     * 产品名称
     * @param productNm 产品名称
     */
    public void setProductNm(String productNm) {
        this.productNm = productNm == null ? null : productNm.trim();
    }

    /**
     * 产品型号
     * @return PRODUCT_KIND 产品型号
     */
    public String getProductKind() {
        return productKind;
    }

    /**
     * 产品型号
     * @param productKind 产品型号
     */
    public void setProductKind(String productKind) {
        this.productKind = productKind == null ? null : productKind.trim();
    }

    /**
     * 产品厚度
     * @return PRODUCT_THICKNESS 产品厚度
     */
    public String getProductThickness() {
        return productThickness;
    }

    /**
     * 产品厚度
     * @param productThickness 产品厚度
     */
    public void setProductThickness(String productThickness) {
        this.productThickness = productThickness == null ? null : productThickness.trim();
    }

    /**
     * 产品长度
     * @return PRODUCT_LENGTH 产品长度
     */
    public String getProductLength() {
        return productLength;
    }

    /**
     * 产品长度
     * @param productLength 产品长度
     */
    public void setProductLength(String productLength) {
        this.productLength = productLength == null ? null : productLength.trim();
    }

    /**
     * 产品理论重量
     * @return PRODUCT_THEORY_WEIGHT 产品理论重量
     */
    public String getProductTheoryWeight() {
        return productTheoryWeight;
    }

    /**
     * 产品理论重量
     * @param productTheoryWeight 产品理论重量
     */
    public void setProductTheoryWeight(String productTheoryWeight) {
        this.productTheoryWeight = productTheoryWeight == null ? null : productTheoryWeight.trim();
    }

    /**
     * 产品实际平均重量
     * @return PRODUCT_ACTUL_WEIGHT 产品实际平均重量
     */
    public String getProductActulWeight() {
        return productActulWeight;
    }

    /**
     * 产品实际平均重量
     * @param productActulWeight 产品实际平均重量
     */
    public void setProductActulWeight(String productActulWeight) {
        this.productActulWeight = productActulWeight == null ? null : productActulWeight.trim();
    }

    /**
     * 创建日期
     * @return CREAT_DT 创建日期
     */
    public String getCreatDt() {
        return creatDt;
    }

    /**
     * 创建日期
     * @param creatDt 创建日期
     */
    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt == null ? null : creatDt.trim();
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
     * 版本号
     * @return VERSION 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本号
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 
     * @return EXTFLD1 
     */
    public String getExtfld1() {
        return extfld1;
    }

    /**
     * 
     * @param extfld1 
     */
    public void setExtfld1(String extfld1) {
        this.extfld1 = extfld1 == null ? null : extfld1.trim();
    }

    /**
     * 
     * @return EXTFLD2 
     */
    public String getExtfld2() {
        return extfld2;
    }

    /**
     * 
     * @param extfld2 
     */
    public void setExtfld2(String extfld2) {
        this.extfld2 = extfld2 == null ? null : extfld2.trim();
    }

    /**
     * 
     * @return EXTFLD3 
     */
    public String getExtfld3() {
        return extfld3;
    }

    /**
     * 
     * @param extfld3 
     */
    public void setExtfld3(String extfld3) {
        this.extfld3 = extfld3 == null ? null : extfld3.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productNo=").append(productNo);
        sb.append(", productNm=").append(productNm);
        sb.append(", productKind=").append(productKind);
        sb.append(", productThickness=").append(productThickness);
        sb.append(", productLength=").append(productLength);
        sb.append(", productTheoryWeight=").append(productTheoryWeight);
        sb.append(", productActulWeight=").append(productActulWeight);
        sb.append(", creatDt=").append(creatDt);
        sb.append(", transDt=").append(transDt);
        sb.append(", transTm=").append(transTm);
        sb.append(", version=").append(version);
        sb.append(", extfld1=").append(extfld1);
        sb.append(", extfld2=").append(extfld2);
        sb.append(", extfld3=").append(extfld3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}