package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblOrderRecordOut implements Serializable {
    /**
     * 
     */
    private String orderNo;

    /**
     * 
     */
    private String productNm;

    /**
     * 
     */
    private String productKind;

    /**
     * 
     */
    private String productThickness;

    /**
     * 
     */
    private String productLength;

    /**
     * 
     */
    private String supplierNm;

    /**
     * 
     */
    private String supplierCd;

    /**
     * 
     */
    private BigDecimal salePrice;

    /**
     * 
     */
    private BigDecimal saleTonPrice;

    /**
     * 
     */
    private String saleNum;

    /**
     * 
     */
    private String saleWeight;

    /**
     * 
     */
    private String transNo;

    /**
     * 
     */
    private String transDt;

    /**
     * 
     */
    private String transTm;

    /**
     * 
     */
    private Integer version;

    /**
     * 
     */
    private String transCd;

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
     * tbl_order_record_out
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return ORDER_NO 
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 
     * @param orderNo 
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 
     * @return PRODUCT_NM 
     */
    public String getProductNm() {
        return productNm;
    }

    /**
     * 
     * @param productNm 
     */
    public void setProductNm(String productNm) {
        this.productNm = productNm == null ? null : productNm.trim();
    }

    /**
     * 
     * @return PRODUCT_KIND 
     */
    public String getProductKind() {
        return productKind;
    }

    /**
     * 
     * @param productKind 
     */
    public void setProductKind(String productKind) {
        this.productKind = productKind == null ? null : productKind.trim();
    }

    /**
     * 
     * @return PRODUCT_THICKNESS 
     */
    public String getProductThickness() {
        return productThickness;
    }

    /**
     * 
     * @param productThickness 
     */
    public void setProductThickness(String productThickness) {
        this.productThickness = productThickness == null ? null : productThickness.trim();
    }

    /**
     * 
     * @return PRODUCT_LENGTH 
     */
    public String getProductLength() {
        return productLength;
    }

    /**
     * 
     * @param productLength 
     */
    public void setProductLength(String productLength) {
        this.productLength = productLength == null ? null : productLength.trim();
    }

    /**
     * 
     * @return SUPPLIER_NM 
     */
    public String getSupplierNm() {
        return supplierNm;
    }

    /**
     * 
     * @param supplierNm 
     */
    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm == null ? null : supplierNm.trim();
    }

    /**
     * 
     * @return SUPPLIER_CD 
     */
    public String getSupplierCd() {
        return supplierCd;
    }

    /**
     * 
     * @param supplierCd 
     */
    public void setSupplierCd(String supplierCd) {
        this.supplierCd = supplierCd == null ? null : supplierCd.trim();
    }

    /**
     * 
     * @return SALE_PRICE 
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * 
     * @param salePrice 
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 
     * @return SALE_TON_PRICE 
     */
    public BigDecimal getSaleTonPrice() {
        return saleTonPrice;
    }

    /**
     * 
     * @param saleTonPrice 
     */
    public void setSaleTonPrice(BigDecimal saleTonPrice) {
        this.saleTonPrice = saleTonPrice;
    }

    /**
     * 
     * @return SALE_NUM 
     */
    public String getSaleNum() {
        return saleNum;
    }

    /**
     * 
     * @param saleNum 
     */
    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum == null ? null : saleNum.trim();
    }

    /**
     * 
     * @return SALE_WEIGHT 
     */
    public String getSaleWeight() {
        return saleWeight;
    }

    /**
     * 
     * @param saleWeight 
     */
    public void setSaleWeight(String saleWeight) {
        this.saleWeight = saleWeight == null ? null : saleWeight.trim();
    }

    /**
     * 
     * @return TRANS_NO 
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * 
     * @param transNo 
     */
    public void setTransNo(String transNo) {
        this.transNo = transNo == null ? null : transNo.trim();
    }

    /**
     * 
     * @return TRANS_DT 
     */
    public String getTransDt() {
        return transDt;
    }

    /**
     * 
     * @param transDt 
     */
    public void setTransDt(String transDt) {
        this.transDt = transDt == null ? null : transDt.trim();
    }

    /**
     * 
     * @return TRANS_TM 
     */
    public String getTransTm() {
        return transTm;
    }

    /**
     * 
     * @param transTm 
     */
    public void setTransTm(String transTm) {
        this.transTm = transTm == null ? null : transTm.trim();
    }

    /**
     * 
     * @return VERSION 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(Integer version) {
        this.version = version;
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
        sb.append(", orderNo=").append(orderNo);
        sb.append(", productNm=").append(productNm);
        sb.append(", productKind=").append(productKind);
        sb.append(", productThickness=").append(productThickness);
        sb.append(", productLength=").append(productLength);
        sb.append(", supplierNm=").append(supplierNm);
        sb.append(", supplierCd=").append(supplierCd);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", saleTonPrice=").append(saleTonPrice);
        sb.append(", saleNum=").append(saleNum);
        sb.append(", saleWeight=").append(saleWeight);
        sb.append(", transNo=").append(transNo);
        sb.append(", transDt=").append(transDt);
        sb.append(", transTm=").append(transTm);
        sb.append(", version=").append(version);
        sb.append(", transCd=").append(transCd);
        sb.append(", extfld1=").append(extfld1);
        sb.append(", extfld2=").append(extfld2);
        sb.append(", extfld3=").append(extfld3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}