package com.huayi.ljj.springcloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TblManuFacturerPara implements Serializable {
    /**
     * 厂商简码
     */
    private String manufacturerCode;

    /**
     * 厂商名称
     */
    private String manufacturerNm;

    /**
     * 厂商电话
     */
    private String manufacturerTel;

    /**
     * 运输单价
     */
    private BigDecimal transportationExpense;

    /**
     * 更新日期
     */
    private String updateDt;

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
     * 
     */
    private String extfld4;

    /**
     * 
     */
    private String extfld5;

    /**
     * 
     */
    private String extfld6;

    /**
     * 
     */
    private String extfld7;

    /**
     * 
     */
    private String extfld8;

    /**
     * 
     */
    private String extfld9;

    /**
     * tbl_manufacturer_para
     */
    private static final long serialVersionUID = 1L;

    /**
     * 厂商简码
     * @return MANUFACTURER_CODE 厂商简码
     */
    public String getManufacturerCode() {
        return manufacturerCode;
    }

    /**
     * 厂商简码
     * @param manufacturerCode 厂商简码
     */
    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode == null ? null : manufacturerCode.trim();
    }

    /**
     * 厂商名称
     * @return MANUFACTURER_NM 厂商名称
     */
    public String getManufacturerNm() {
        return manufacturerNm;
    }

    /**
     * 厂商名称
     * @param manufacturerNm 厂商名称
     */
    public void setManufacturerNm(String manufacturerNm) {
        this.manufacturerNm = manufacturerNm == null ? null : manufacturerNm.trim();
    }

    /**
     * 厂商电话
     * @return MANUFACTURER_TEL 厂商电话
     */
    public String getManufacturerTel() {
        return manufacturerTel;
    }

    /**
     * 厂商电话
     * @param manufacturerTel 厂商电话
     */
    public void setManufacturerTel(String manufacturerTel) {
        this.manufacturerTel = manufacturerTel == null ? null : manufacturerTel.trim();
    }

    /**
     * 运输单价
     * @return TRANSPORTATION_EXPENSE 运输单价
     */
    public BigDecimal getTransportationExpense() {
        return transportationExpense;
    }

    /**
     * 运输单价
     * @param transportationExpense 运输单价
     */
    public void setTransportationExpense(BigDecimal transportationExpense) {
        this.transportationExpense = transportationExpense;
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

    /**
     * 
     * @return EXTFLD4 
     */
    public String getExtfld4() {
        return extfld4;
    }

    /**
     * 
     * @param extfld4 
     */
    public void setExtfld4(String extfld4) {
        this.extfld4 = extfld4 == null ? null : extfld4.trim();
    }

    /**
     * 
     * @return EXTFLD5 
     */
    public String getExtfld5() {
        return extfld5;
    }

    /**
     * 
     * @param extfld5 
     */
    public void setExtfld5(String extfld5) {
        this.extfld5 = extfld5 == null ? null : extfld5.trim();
    }

    /**
     * 
     * @return EXTFLD6 
     */
    public String getExtfld6() {
        return extfld6;
    }

    /**
     * 
     * @param extfld6 
     */
    public void setExtfld6(String extfld6) {
        this.extfld6 = extfld6 == null ? null : extfld6.trim();
    }

    /**
     * 
     * @return EXTFLD7 
     */
    public String getExtfld7() {
        return extfld7;
    }

    /**
     * 
     * @param extfld7 
     */
    public void setExtfld7(String extfld7) {
        this.extfld7 = extfld7 == null ? null : extfld7.trim();
    }

    /**
     * 
     * @return EXTFLD8 
     */
    public String getExtfld8() {
        return extfld8;
    }

    /**
     * 
     * @param extfld8 
     */
    public void setExtfld8(String extfld8) {
        this.extfld8 = extfld8 == null ? null : extfld8.trim();
    }

    /**
     * 
     * @return EXTFLD9 
     */
    public String getExtfld9() {
        return extfld9;
    }

    /**
     * 
     * @param extfld9 
     */
    public void setExtfld9(String extfld9) {
        this.extfld9 = extfld9 == null ? null : extfld9.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", manufacturerCode=").append(manufacturerCode);
        sb.append(", manufacturerNm=").append(manufacturerNm);
        sb.append(", manufacturerTel=").append(manufacturerTel);
        sb.append(", transportationExpense=").append(transportationExpense);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", transDt=").append(transDt);
        sb.append(", transTm=").append(transTm);
        sb.append(", version=").append(version);
        sb.append(", transCd=").append(transCd);
        sb.append(", extfld1=").append(extfld1);
        sb.append(", extfld2=").append(extfld2);
        sb.append(", extfld3=").append(extfld3);
        sb.append(", extfld4=").append(extfld4);
        sb.append(", extfld5=").append(extfld5);
        sb.append(", extfld6=").append(extfld6);
        sb.append(", extfld7=").append(extfld7);
        sb.append(", extfld8=").append(extfld8);
        sb.append(", extfld9=").append(extfld9);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}