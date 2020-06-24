package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblOrderRecordIn implements Serializable {
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
     * 进货日期
     */
    private String purchaseDt;

    /**
     * 流水号
     */
    private String transNo;

    /**
     * 供货商名称
     */
    private String supplierNm;

    /**
     * 供货商简码
     */
    private String supplierCd;

    /**
     * 运输单价
     */
    private BigDecimal transportationPrice;

    /**
     * 产品出厂单价
     */
    private BigDecimal productOutPrice;

    /**
     * 产品出厂总金额
     */
    private BigDecimal productOutAmount;

    /**
     * 搬运单价
     */
    private BigDecimal carryPrice;

    /**
     * 入库重量(吨)
     */
    private String inStorageWeight;

    /**
     * 入库数量
     */
    private String inStorageNum;

    /**
     * 库存支数
     */
    private String inventoryNum;

    /**
     * 单件支数
     */
    private String pieceCount;

    /**
     * 件数
     */
    private String count;

    /**
     * 入库成本单价
     */
    private BigDecimal inStoragePrice;

    /**
     * 更新日期
     */
    private String updateDt;

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
     * tbl_order_record_in
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
     * 进货日期
     * @return PURCHASE_DT 进货日期
     */
    public String getPurchaseDt() {
        return purchaseDt;
    }

    /**
     * 进货日期
     * @param purchaseDt 进货日期
     */
    public void setPurchaseDt(String purchaseDt) {
        this.purchaseDt = purchaseDt == null ? null : purchaseDt.trim();
    }

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
     * 运输单价
     * @return TRANSPORTATION_PRICE 运输单价
     */
    public BigDecimal getTransportationPrice() {
        return transportationPrice;
    }

    /**
     * 运输单价
     * @param transportationPrice 运输单价
     */
    public void setTransportationPrice(BigDecimal transportationPrice) {
        this.transportationPrice = transportationPrice;
    }

    /**
     * 产品出厂单价
     * @return PRODUCT_OUT_PRICE 产品出厂单价
     */
    public BigDecimal getProductOutPrice() {
        return productOutPrice;
    }

    /**
     * 产品出厂单价
     * @param productOutPrice 产品出厂单价
     */
    public void setProductOutPrice(BigDecimal productOutPrice) {
        this.productOutPrice = productOutPrice;
    }

    /**
     * 产品出厂总金额
     * @return PRODUCT_OUT_AMOUNT 产品出厂总金额
     */
    public BigDecimal getProductOutAmount() {
        return productOutAmount;
    }

    /**
     * 产品出厂总金额
     * @param productOutAmount 产品出厂总金额
     */
    public void setProductOutAmount(BigDecimal productOutAmount) {
        this.productOutAmount = productOutAmount;
    }

    /**
     * 搬运单价
     * @return CARRY_PRICE 搬运单价
     */
    public BigDecimal getCarryPrice() {
        return carryPrice;
    }

    /**
     * 搬运单价
     * @param carryPrice 搬运单价
     */
    public void setCarryPrice(BigDecimal carryPrice) {
        this.carryPrice = carryPrice;
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
     * 入库数量
     * @return IN_STORAGE_NUM 入库数量
     */
    public String getInStorageNum() {
        return inStorageNum;
    }

    /**
     * 入库数量
     * @param inStorageNum 入库数量
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
     * 单件支数
     * @return PIECE_COUNT 单件支数
     */
    public String getPieceCount() {
        return pieceCount;
    }

    /**
     * 单件支数
     * @param pieceCount 单件支数
     */
    public void setPieceCount(String pieceCount) {
        this.pieceCount = pieceCount == null ? null : pieceCount.trim();
    }

    /**
     * 件数
     * @return COUNT 件数
     */
    public String getCount() {
        return count;
    }

    /**
     * 件数
     * @param count 件数
     */
    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    /**
     * 入库成本单价
     * @return IN_STORAGE_PRICE 入库成本单价
     */
    public BigDecimal getInStoragePrice() {
        return inStoragePrice;
    }

    /**
     * 入库成本单价
     * @param inStoragePrice 入库成本单价
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
        sb.append(", purchaseDt=").append(purchaseDt);
        sb.append(", transNo=").append(transNo);
        sb.append(", supplierNm=").append(supplierNm);
        sb.append(", supplierCd=").append(supplierCd);
        sb.append(", transportationPrice=").append(transportationPrice);
        sb.append(", productOutPrice=").append(productOutPrice);
        sb.append(", productOutAmount=").append(productOutAmount);
        sb.append(", carryPrice=").append(carryPrice);
        sb.append(", inStorageWeight=").append(inStorageWeight);
        sb.append(", inStorageNum=").append(inStorageNum);
        sb.append(", inventoryNum=").append(inventoryNum);
        sb.append(", pieceCount=").append(pieceCount);
        sb.append(", count=").append(count);
        sb.append(", inStoragePrice=").append(inStoragePrice);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", creatDt=").append(creatDt);
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