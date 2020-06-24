package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblProdInventory implements Serializable {
    /**
     * 产品型号
     */
    private String productKind;

    /**
     * 产品名称
     */
    private String productNm;

    /**
     * 产品厚度
     */
    private String productThickness;

    /**
     * 产品长度
     */
    private String productLength;

    /**
     * 搬运单价
     */
    private BigDecimal carrPrice;

    /**
     * 入库重量(吨)
     */
    private String inStorageWeight;

    /**
     * 入库数量()
     */
    private String inStorageNum;

    /**
     * 库存支数
     */
    private String inventoryNum;

    /**
     * 进货成本单价
     */
    private BigDecimal inStoragePrice;

    /**
     * 更新日期
     */
    private String updateDt;

    /**
     * 创建日期
     */
    private String createDt;

    /**
     * 交易时间
     */
    private String transTm;

    /**
     * 交易日期
     */
    private String transDt;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * tbl_prod_inventory
     */
    private static final long serialVersionUID = 1L;

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
     * 搬运单价
     * @return CARR_PRICE 搬运单价
     */
    public BigDecimal getCarrPrice() {
        return carrPrice;
    }

    /**
     * 搬运单价
     * @param carrPrice 搬运单价
     */
    public void setCarrPrice(BigDecimal carrPrice) {
        this.carrPrice = carrPrice;
    }

    /**
     * 入库重量(吨)
     * @return IN_STORAGE_WEIGHT 入库重量(吨)
     */
    public String getInStorageWeight() {
        return inStorageWeight;
    }

    /**
     * 入库重量(吨)
     * @param inStorageWeight 入库重量(吨)
     */
    public void setInStorageWeight(String inStorageWeight) {
        this.inStorageWeight = inStorageWeight == null ? null : inStorageWeight.trim();
    }

    /**
     * 入库数量()
     * @return IN_STORAGE_NUM 入库数量()
     */
    public String getInStorageNum() {
        return inStorageNum;
    }

    /**
     * 入库数量()
     * @param inStorageNum 入库数量()
     */
    public void setInStorageNum(String inStorageNum) {
        this.inStorageNum = inStorageNum == null ? null : inStorageNum.trim();
    }

    /**
     * 库存支数
     * @return INVENTORY_NUM 库存支数
     */
    public String getInventoryNum() {
        return inventoryNum;
    }

    /**
     * 库存支数
     * @param inventoryNum 库存支数
     */
    public void setInventoryNum(String inventoryNum) {
        this.inventoryNum = inventoryNum == null ? null : inventoryNum.trim();
    }

    /**
     * 进货成本单价
     * @return IN_STORAGE_PRICE 进货成本单价
     */
    public BigDecimal getInStoragePrice() {
        return inStoragePrice;
    }

    /**
     * 进货成本单价
     * @param inStoragePrice 进货成本单价
     */
    public void setInStoragePrice(BigDecimal inStoragePrice) {
        this.inStoragePrice = inStoragePrice;
    }

    /**
     * 更新日期
     * @return UPDATE_DT 更新日期
     */
    public String getUpdateDt() {
        return updateDt;
    }

    /**
     * 更新日期
     * @param updateDt 更新日期
     */
    public void setUpdateDt(String updateDt) {
        this.updateDt = updateDt == null ? null : updateDt.trim();
    }

    /**
     * 创建日期
     * @return CREATE_DT 创建日期
     */
    public String getCreateDt() {
        return createDt;
    }

    /**
     * 创建日期
     * @param createDt 创建日期
     */
    public void setCreateDt(String createDt) {
        this.createDt = createDt == null ? null : createDt.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productKind=").append(productKind);
        sb.append(", productNm=").append(productNm);
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