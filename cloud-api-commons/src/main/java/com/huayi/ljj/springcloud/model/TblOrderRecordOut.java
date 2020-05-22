package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblOrderRecordOut implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.ORDER_NO
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.PRODUCT_NM
     *
     * @mbggenerated
     */
    private String productNm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.PRODUCT_KIND
     *
     * @mbggenerated
     */
    private String productKind;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.PRODUCT_THICKNESS
     *
     * @mbggenerated
     */
    private String productThickness;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.PRODUCT_LENGTH
     *
     * @mbggenerated
     */
    private String productLength;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.SUPPLIER_NM
     *
     * @mbggenerated
     */
    private String supplierNm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.SUPPLIER_CD
     *
     * @mbggenerated
     */
    private String supplierCd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.SALE_PRICE
     *
     * @mbggenerated
     */
    private BigDecimal salePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.SALE_TON_PRICE
     *
     * @mbggenerated
     */
    private BigDecimal saleTonPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.SALE_NUM
     *
     * @mbggenerated
     */
    private String saleNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.SALE_WEIGHT
     *
     * @mbggenerated
     */
    private String saleWeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.TRANS_NO
     *
     * @mbggenerated
     */
    private String transNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.TRANS_DT
     *
     * @mbggenerated
     */
    private String transDt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.TRANS_TM
     *
     * @mbggenerated
     */
    private String transTm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.VERSION
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.TRANS_CD
     *
     * @mbggenerated
     */
    private String transCd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.EXTFLD1
     *
     * @mbggenerated
     */
    private String extfld1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.EXTFLD2
     *
     * @mbggenerated
     */
    private String extfld2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order_record_out.EXTFLD3
     *
     * @mbggenerated
     */
    private String extfld3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_order_record_out
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.ORDER_NO
     *
     * @return the value of tbl_order_record_out.ORDER_NO
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.ORDER_NO
     *
     * @param orderNo the value for tbl_order_record_out.ORDER_NO
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.PRODUCT_NM
     *
     * @return the value of tbl_order_record_out.PRODUCT_NM
     *
     * @mbggenerated
     */
    public String getProductNm() {
        return productNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.PRODUCT_NM
     *
     * @param productNm the value for tbl_order_record_out.PRODUCT_NM
     *
     * @mbggenerated
     */
    public void setProductNm(String productNm) {
        this.productNm = productNm == null ? null : productNm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.PRODUCT_KIND
     *
     * @return the value of tbl_order_record_out.PRODUCT_KIND
     *
     * @mbggenerated
     */
    public String getProductKind() {
        return productKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.PRODUCT_KIND
     *
     * @param productKind the value for tbl_order_record_out.PRODUCT_KIND
     *
     * @mbggenerated
     */
    public void setProductKind(String productKind) {
        this.productKind = productKind == null ? null : productKind.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.PRODUCT_THICKNESS
     *
     * @return the value of tbl_order_record_out.PRODUCT_THICKNESS
     *
     * @mbggenerated
     */
    public String getProductThickness() {
        return productThickness;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.PRODUCT_THICKNESS
     *
     * @param productThickness the value for tbl_order_record_out.PRODUCT_THICKNESS
     *
     * @mbggenerated
     */
    public void setProductThickness(String productThickness) {
        this.productThickness = productThickness == null ? null : productThickness.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.PRODUCT_LENGTH
     *
     * @return the value of tbl_order_record_out.PRODUCT_LENGTH
     *
     * @mbggenerated
     */
    public String getProductLength() {
        return productLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.PRODUCT_LENGTH
     *
     * @param productLength the value for tbl_order_record_out.PRODUCT_LENGTH
     *
     * @mbggenerated
     */
    public void setProductLength(String productLength) {
        this.productLength = productLength == null ? null : productLength.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.SUPPLIER_NM
     *
     * @return the value of tbl_order_record_out.SUPPLIER_NM
     *
     * @mbggenerated
     */
    public String getSupplierNm() {
        return supplierNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.SUPPLIER_NM
     *
     * @param supplierNm the value for tbl_order_record_out.SUPPLIER_NM
     *
     * @mbggenerated
     */
    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm == null ? null : supplierNm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.SUPPLIER_CD
     *
     * @return the value of tbl_order_record_out.SUPPLIER_CD
     *
     * @mbggenerated
     */
    public String getSupplierCd() {
        return supplierCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.SUPPLIER_CD
     *
     * @param supplierCd the value for tbl_order_record_out.SUPPLIER_CD
     *
     * @mbggenerated
     */
    public void setSupplierCd(String supplierCd) {
        this.supplierCd = supplierCd == null ? null : supplierCd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.SALE_PRICE
     *
     * @return the value of tbl_order_record_out.SALE_PRICE
     *
     * @mbggenerated
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.SALE_PRICE
     *
     * @param salePrice the value for tbl_order_record_out.SALE_PRICE
     *
     * @mbggenerated
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.SALE_TON_PRICE
     *
     * @return the value of tbl_order_record_out.SALE_TON_PRICE
     *
     * @mbggenerated
     */
    public BigDecimal getSaleTonPrice() {
        return saleTonPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.SALE_TON_PRICE
     *
     * @param saleTonPrice the value for tbl_order_record_out.SALE_TON_PRICE
     *
     * @mbggenerated
     */
    public void setSaleTonPrice(BigDecimal saleTonPrice) {
        this.saleTonPrice = saleTonPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.SALE_NUM
     *
     * @return the value of tbl_order_record_out.SALE_NUM
     *
     * @mbggenerated
     */
    public String getSaleNum() {
        return saleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.SALE_NUM
     *
     * @param saleNum the value for tbl_order_record_out.SALE_NUM
     *
     * @mbggenerated
     */
    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum == null ? null : saleNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.SALE_WEIGHT
     *
     * @return the value of tbl_order_record_out.SALE_WEIGHT
     *
     * @mbggenerated
     */
    public String getSaleWeight() {
        return saleWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.SALE_WEIGHT
     *
     * @param saleWeight the value for tbl_order_record_out.SALE_WEIGHT
     *
     * @mbggenerated
     */
    public void setSaleWeight(String saleWeight) {
        this.saleWeight = saleWeight == null ? null : saleWeight.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.TRANS_NO
     *
     * @return the value of tbl_order_record_out.TRANS_NO
     *
     * @mbggenerated
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.TRANS_NO
     *
     * @param transNo the value for tbl_order_record_out.TRANS_NO
     *
     * @mbggenerated
     */
    public void setTransNo(String transNo) {
        this.transNo = transNo == null ? null : transNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.TRANS_DT
     *
     * @return the value of tbl_order_record_out.TRANS_DT
     *
     * @mbggenerated
     */
    public String getTransDt() {
        return transDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.TRANS_DT
     *
     * @param transDt the value for tbl_order_record_out.TRANS_DT
     *
     * @mbggenerated
     */
    public void setTransDt(String transDt) {
        this.transDt = transDt == null ? null : transDt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.TRANS_TM
     *
     * @return the value of tbl_order_record_out.TRANS_TM
     *
     * @mbggenerated
     */
    public String getTransTm() {
        return transTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.TRANS_TM
     *
     * @param transTm the value for tbl_order_record_out.TRANS_TM
     *
     * @mbggenerated
     */
    public void setTransTm(String transTm) {
        this.transTm = transTm == null ? null : transTm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.VERSION
     *
     * @return the value of tbl_order_record_out.VERSION
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.VERSION
     *
     * @param version the value for tbl_order_record_out.VERSION
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.TRANS_CD
     *
     * @return the value of tbl_order_record_out.TRANS_CD
     *
     * @mbggenerated
     */
    public String getTransCd() {
        return transCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.TRANS_CD
     *
     * @param transCd the value for tbl_order_record_out.TRANS_CD
     *
     * @mbggenerated
     */
    public void setTransCd(String transCd) {
        this.transCd = transCd == null ? null : transCd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.EXTFLD1
     *
     * @return the value of tbl_order_record_out.EXTFLD1
     *
     * @mbggenerated
     */
    public String getExtfld1() {
        return extfld1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.EXTFLD1
     *
     * @param extfld1 the value for tbl_order_record_out.EXTFLD1
     *
     * @mbggenerated
     */
    public void setExtfld1(String extfld1) {
        this.extfld1 = extfld1 == null ? null : extfld1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.EXTFLD2
     *
     * @return the value of tbl_order_record_out.EXTFLD2
     *
     * @mbggenerated
     */
    public String getExtfld2() {
        return extfld2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.EXTFLD2
     *
     * @param extfld2 the value for tbl_order_record_out.EXTFLD2
     *
     * @mbggenerated
     */
    public void setExtfld2(String extfld2) {
        this.extfld2 = extfld2 == null ? null : extfld2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order_record_out.EXTFLD3
     *
     * @return the value of tbl_order_record_out.EXTFLD3
     *
     * @mbggenerated
     */
    public String getExtfld3() {
        return extfld3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order_record_out.EXTFLD3
     *
     * @param extfld3 the value for tbl_order_record_out.EXTFLD3
     *
     * @mbggenerated
     */
    public void setExtfld3(String extfld3) {
        this.extfld3 = extfld3 == null ? null : extfld3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_order_record_out
     *
     * @mbggenerated
     */
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