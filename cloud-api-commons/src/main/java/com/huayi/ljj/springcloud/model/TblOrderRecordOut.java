package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblOrderRecordOut implements Serializable {
    /**
     * 订单编号
     */
    private String orderNo;

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
     * 供货商名称
     */
    private String supplierNm;

    /**
     * 供货商简码
     */
    private String supplierCd;

    /**
     * 出售单价
     */
    private BigDecimal salePrice;

    /**
     * 出售吨位价
     */
    private BigDecimal saleTonPrice;

    /**
     * 出售支数
     */
    private String saleNum;

    /**
     * 出售重量
     */
    private String saleWeight;

    /**
     * 流水号
     */
    private String transJnno;

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
     * 交易码
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
     * 供货商名称
     * @return SUPPLIER_NM 供货商名称
     */
    public String getSupplierNm() {
        return supplierNm;
    }

    /**
     * 供货商名称
     * @param supplierNm 供货商名称
     */
    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm == null ? null : supplierNm.trim();
    }

    /**
     * 供货商简码
     * @return SUPPLIER_CD 供货商简码
     */
    public String getSupplierCd() {
        return supplierCd;
    }

    /**
     * 供货商简码
     * @param supplierCd 供货商简码
     */
    public void setSupplierCd(String supplierCd) {
        this.supplierCd = supplierCd == null ? null : supplierCd.trim();
    }

    /**
     * 出售单价
     * @return SALE_PRICE 出售单价
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * 出售单价
     * @param salePrice 出售单价
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 出售吨位价
     * @return SALE_TON_PRICE 出售吨位价
     */
    public BigDecimal getSaleTonPrice() {
        return saleTonPrice;
    }

    /**
     * 出售吨位价
     * @param saleTonPrice 出售吨位价
     */
    public void setSaleTonPrice(BigDecimal saleTonPrice) {
        this.saleTonPrice = saleTonPrice;
    }

    /**
     * 出售支数
     * @return SALE_NUM 出售支数
     */
    public String getSaleNum() {
        return saleNum;
    }

    /**
     * 出售支数
     * @param saleNum 出售支数
     */
    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum == null ? null : saleNum.trim();
    }

    /**
     * 出售重量
     * @return SALE_WEIGHT 出售重量
     */
    public String getSaleWeight() {
        return saleWeight;
    }

    /**
     * 出售重量
     * @param saleWeight 出售重量
     */
    public void setSaleWeight(String saleWeight) {
        this.saleWeight = saleWeight == null ? null : saleWeight.trim();
    }

    /**
     * 流水号
     * @return TRANS_JNNO 流水号
     */
    public String getTransJnno() {
        return transJnno;
    }

    /**
     * 流水号
     * @param transJnno 流水号
     */
    public void setTransJnno(String transJnno) {
        this.transJnno = transJnno == null ? null : transJnno.trim();
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
     * 交易码
     * @return TRANS_CD 交易码
     */
    public String getTransCd() {
        return transCd;
    }

    /**
     * 交易码
     * @param transCd 交易码
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
        sb.append(", transJnno=").append(transJnno);
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