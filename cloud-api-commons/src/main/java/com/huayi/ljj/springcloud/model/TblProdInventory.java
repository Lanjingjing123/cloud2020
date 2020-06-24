package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblProdInventory implements Serializable {
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
    private BigDecimal carrPrice;

    /**
     * 
     */
    private String inStorageWeight;

    /**
     * 
     */
    private String inStorageNum;

    /**
     * 
     */
    private String inventoryNum;

    /**
     * 
     */
    private BigDecimal inStoragePrice;

    /**
     * 
     */
    private String updateDt;

    /**
     * 
     */
    private String createDt;

    /**
     * 
     */
    private String transTm;

    /**
     * 
     */
    private String transDt;

    /**
     * 
     */
    private Integer version;

    /**
     * tbl_prod_inventory
     */
    private static final long serialVersionUID = 1L;

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
     * @return CARR_PRICE 
     */
    public BigDecimal getCarrPrice() {
        return carrPrice;
    }

    /**
     * 
     * @param carrPrice 
     */
    public void setCarrPrice(BigDecimal carrPrice) {
        this.carrPrice = carrPrice;
    }

    /**
     * 
     * @return IN_STORAGE_WEIGHT 
     */
    public String getInStorageWeight() {
        return inStorageWeight;
    }

    /**
     * 
     * @param inStorageWeight 
     */
    public void setInStorageWeight(String inStorageWeight) {
        this.inStorageWeight = inStorageWeight == null ? null : inStorageWeight.trim();
    }

    /**
     * 
     * @return IN_STORAGE_NUM 
     */
    public String getInStorageNum() {
        return inStorageNum;
    }

    /**
     * 
     * @param inStorageNum 
     */
    public void setInStorageNum(String inStorageNum) {
        this.inStorageNum = inStorageNum == null ? null : inStorageNum.trim();
    }

    /**
     * 
     * @return INVENTORY_NUM 
     */
    public String getInventoryNum() {
        return inventoryNum;
    }

    /**
     * 
     * @param inventoryNum 
     */
    public void setInventoryNum(String inventoryNum) {
        this.inventoryNum = inventoryNum == null ? null : inventoryNum.trim();
    }

    /**
     * 
     * @return IN_STORAGE_PRICE 
     */
    public BigDecimal getInStoragePrice() {
        return inStoragePrice;
    }

    /**
     * 
     * @param inStoragePrice 
     */
    public void setInStoragePrice(BigDecimal inStoragePrice) {
        this.inStoragePrice = inStoragePrice;
    }

    /**
     * 
     * @return UPDATE_DT 
     */
    public String getUpdateDt() {
        return updateDt;
    }

    /**
     * 
     * @param updateDt 
     */
    public void setUpdateDt(String updateDt) {
        this.updateDt = updateDt == null ? null : updateDt.trim();
    }

    /**
     * 
     * @return CREATE_DT 
     */
    public String getCreateDt() {
        return createDt;
    }

    /**
     * 
     * @param createDt 
     */
    public void setCreateDt(String createDt) {
        this.createDt = createDt == null ? null : createDt.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productNm=").append(productNm);
        sb.append(", productKind=").append(productKind);
        sb.append(", productThickness=").append(productThickness);
        sb.append(", productLength=").append(productLength);
        sb.append(", carrPrice=").append(carrPrice);
        sb.append(", inStorageWeight=").append(inStorageWeight);
        sb.append(", inStorageNum=").append(inStorageNum);
        sb.append(", inventoryNum=").append(inventoryNum);
        sb.append(", inStoragePrice=").append(inStoragePrice);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", createDt=").append(createDt);
        sb.append(", transTm=").append(transTm);
        sb.append(", transDt=").append(transDt);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}