package com.huayi.ljj.springcloud.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TblOrderRecordOutExample {
    /**
     * tbl_order_record_out
     */
    protected String orderByClause;

    /**
     * tbl_order_record_out
     */
    protected boolean distinct;

    /**
     * tbl_order_record_out
     */
    protected List<Criteria> oredCriteria;

    public TblOrderRecordOutExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * tbl_order_record_out
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andProductNmIsNull() {
            addCriterion("PRODUCT_NM is null");
            return (Criteria) this;
        }

        public Criteria andProductNmIsNotNull() {
            addCriterion("PRODUCT_NM is not null");
            return (Criteria) this;
        }

        public Criteria andProductNmEqualTo(String value) {
            addCriterion("PRODUCT_NM =", value, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmNotEqualTo(String value) {
            addCriterion("PRODUCT_NM <>", value, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmGreaterThan(String value) {
            addCriterion("PRODUCT_NM >", value, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NM >=", value, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmLessThan(String value) {
            addCriterion("PRODUCT_NM <", value, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NM <=", value, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmLike(String value) {
            addCriterion("PRODUCT_NM like", value, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmNotLike(String value) {
            addCriterion("PRODUCT_NM not like", value, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmIn(List<String> values) {
            addCriterion("PRODUCT_NM in", values, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmNotIn(List<String> values) {
            addCriterion("PRODUCT_NM not in", values, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmBetween(String value1, String value2) {
            addCriterion("PRODUCT_NM between", value1, value2, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductNmNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NM not between", value1, value2, "productNm");
            return (Criteria) this;
        }

        public Criteria andProductKindIsNull() {
            addCriterion("PRODUCT_KIND is null");
            return (Criteria) this;
        }

        public Criteria andProductKindIsNotNull() {
            addCriterion("PRODUCT_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andProductKindEqualTo(String value) {
            addCriterion("PRODUCT_KIND =", value, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindNotEqualTo(String value) {
            addCriterion("PRODUCT_KIND <>", value, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindGreaterThan(String value) {
            addCriterion("PRODUCT_KIND >", value, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_KIND >=", value, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindLessThan(String value) {
            addCriterion("PRODUCT_KIND <", value, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_KIND <=", value, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindLike(String value) {
            addCriterion("PRODUCT_KIND like", value, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindNotLike(String value) {
            addCriterion("PRODUCT_KIND not like", value, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindIn(List<String> values) {
            addCriterion("PRODUCT_KIND in", values, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindNotIn(List<String> values) {
            addCriterion("PRODUCT_KIND not in", values, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindBetween(String value1, String value2) {
            addCriterion("PRODUCT_KIND between", value1, value2, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductKindNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_KIND not between", value1, value2, "productKind");
            return (Criteria) this;
        }

        public Criteria andProductThicknessIsNull() {
            addCriterion("PRODUCT_THICKNESS is null");
            return (Criteria) this;
        }

        public Criteria andProductThicknessIsNotNull() {
            addCriterion("PRODUCT_THICKNESS is not null");
            return (Criteria) this;
        }

        public Criteria andProductThicknessEqualTo(String value) {
            addCriterion("PRODUCT_THICKNESS =", value, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessNotEqualTo(String value) {
            addCriterion("PRODUCT_THICKNESS <>", value, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessGreaterThan(String value) {
            addCriterion("PRODUCT_THICKNESS >", value, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_THICKNESS >=", value, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessLessThan(String value) {
            addCriterion("PRODUCT_THICKNESS <", value, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_THICKNESS <=", value, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessLike(String value) {
            addCriterion("PRODUCT_THICKNESS like", value, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessNotLike(String value) {
            addCriterion("PRODUCT_THICKNESS not like", value, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessIn(List<String> values) {
            addCriterion("PRODUCT_THICKNESS in", values, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessNotIn(List<String> values) {
            addCriterion("PRODUCT_THICKNESS not in", values, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessBetween(String value1, String value2) {
            addCriterion("PRODUCT_THICKNESS between", value1, value2, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductThicknessNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_THICKNESS not between", value1, value2, "productThickness");
            return (Criteria) this;
        }

        public Criteria andProductLengthIsNull() {
            addCriterion("PRODUCT_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andProductLengthIsNotNull() {
            addCriterion("PRODUCT_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andProductLengthEqualTo(String value) {
            addCriterion("PRODUCT_LENGTH =", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthNotEqualTo(String value) {
            addCriterion("PRODUCT_LENGTH <>", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthGreaterThan(String value) {
            addCriterion("PRODUCT_LENGTH >", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LENGTH >=", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthLessThan(String value) {
            addCriterion("PRODUCT_LENGTH <", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LENGTH <=", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthLike(String value) {
            addCriterion("PRODUCT_LENGTH like", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthNotLike(String value) {
            addCriterion("PRODUCT_LENGTH not like", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthIn(List<String> values) {
            addCriterion("PRODUCT_LENGTH in", values, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthNotIn(List<String> values) {
            addCriterion("PRODUCT_LENGTH not in", values, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthBetween(String value1, String value2) {
            addCriterion("PRODUCT_LENGTH between", value1, value2, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_LENGTH not between", value1, value2, "productLength");
            return (Criteria) this;
        }

        public Criteria andSupplierNmIsNull() {
            addCriterion("SUPPLIER_NM is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNmIsNotNull() {
            addCriterion("SUPPLIER_NM is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNmEqualTo(String value) {
            addCriterion("SUPPLIER_NM =", value, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmNotEqualTo(String value) {
            addCriterion("SUPPLIER_NM <>", value, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmGreaterThan(String value) {
            addCriterion("SUPPLIER_NM >", value, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NM >=", value, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmLessThan(String value) {
            addCriterion("SUPPLIER_NM <", value, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NM <=", value, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmLike(String value) {
            addCriterion("SUPPLIER_NM like", value, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmNotLike(String value) {
            addCriterion("SUPPLIER_NM not like", value, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmIn(List<String> values) {
            addCriterion("SUPPLIER_NM in", values, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmNotIn(List<String> values) {
            addCriterion("SUPPLIER_NM not in", values, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NM between", value1, value2, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierNmNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NM not between", value1, value2, "supplierNm");
            return (Criteria) this;
        }

        public Criteria andSupplierCdIsNull() {
            addCriterion("SUPPLIER_CD is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCdIsNotNull() {
            addCriterion("SUPPLIER_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCdEqualTo(String value) {
            addCriterion("SUPPLIER_CD =", value, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdNotEqualTo(String value) {
            addCriterion("SUPPLIER_CD <>", value, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdGreaterThan(String value) {
            addCriterion("SUPPLIER_CD >", value, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CD >=", value, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdLessThan(String value) {
            addCriterion("SUPPLIER_CD <", value, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CD <=", value, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdLike(String value) {
            addCriterion("SUPPLIER_CD like", value, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdNotLike(String value) {
            addCriterion("SUPPLIER_CD not like", value, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdIn(List<String> values) {
            addCriterion("SUPPLIER_CD in", values, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdNotIn(List<String> values) {
            addCriterion("SUPPLIER_CD not in", values, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CD between", value1, value2, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSupplierCdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CD not between", value1, value2, "supplierCd");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(BigDecimal value) {
            addCriterion("SALE_PRICE =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("SALE_PRICE <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(BigDecimal value) {
            addCriterion("SALE_PRICE >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_PRICE >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(BigDecimal value) {
            addCriterion("SALE_PRICE <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_PRICE <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<BigDecimal> values) {
            addCriterion("SALE_PRICE in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("SALE_PRICE not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_PRICE between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_PRICE not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceIsNull() {
            addCriterion("SALE_TON_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceIsNotNull() {
            addCriterion("SALE_TON_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceEqualTo(BigDecimal value) {
            addCriterion("SALE_TON_PRICE =", value, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceNotEqualTo(BigDecimal value) {
            addCriterion("SALE_TON_PRICE <>", value, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceGreaterThan(BigDecimal value) {
            addCriterion("SALE_TON_PRICE >", value, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_TON_PRICE >=", value, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceLessThan(BigDecimal value) {
            addCriterion("SALE_TON_PRICE <", value, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_TON_PRICE <=", value, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceIn(List<BigDecimal> values) {
            addCriterion("SALE_TON_PRICE in", values, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceNotIn(List<BigDecimal> values) {
            addCriterion("SALE_TON_PRICE not in", values, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_TON_PRICE between", value1, value2, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTonPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_TON_PRICE not between", value1, value2, "saleTonPrice");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNull() {
            addCriterion("SALE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNotNull() {
            addCriterion("SALE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumEqualTo(String value) {
            addCriterion("SALE_NUM =", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotEqualTo(String value) {
            addCriterion("SALE_NUM <>", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThan(String value) {
            addCriterion("SALE_NUM >", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_NUM >=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThan(String value) {
            addCriterion("SALE_NUM <", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThanOrEqualTo(String value) {
            addCriterion("SALE_NUM <=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLike(String value) {
            addCriterion("SALE_NUM like", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotLike(String value) {
            addCriterion("SALE_NUM not like", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIn(List<String> values) {
            addCriterion("SALE_NUM in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotIn(List<String> values) {
            addCriterion("SALE_NUM not in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumBetween(String value1, String value2) {
            addCriterion("SALE_NUM between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotBetween(String value1, String value2) {
            addCriterion("SALE_NUM not between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleWeightIsNull() {
            addCriterion("SALE_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andSaleWeightIsNotNull() {
            addCriterion("SALE_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andSaleWeightEqualTo(String value) {
            addCriterion("SALE_WEIGHT =", value, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightNotEqualTo(String value) {
            addCriterion("SALE_WEIGHT <>", value, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightGreaterThan(String value) {
            addCriterion("SALE_WEIGHT >", value, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_WEIGHT >=", value, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightLessThan(String value) {
            addCriterion("SALE_WEIGHT <", value, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightLessThanOrEqualTo(String value) {
            addCriterion("SALE_WEIGHT <=", value, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightLike(String value) {
            addCriterion("SALE_WEIGHT like", value, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightNotLike(String value) {
            addCriterion("SALE_WEIGHT not like", value, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightIn(List<String> values) {
            addCriterion("SALE_WEIGHT in", values, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightNotIn(List<String> values) {
            addCriterion("SALE_WEIGHT not in", values, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightBetween(String value1, String value2) {
            addCriterion("SALE_WEIGHT between", value1, value2, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andSaleWeightNotBetween(String value1, String value2) {
            addCriterion("SALE_WEIGHT not between", value1, value2, "saleWeight");
            return (Criteria) this;
        }

        public Criteria andTransJnnoIsNull() {
            addCriterion("TRANS_JNNO is null");
            return (Criteria) this;
        }

        public Criteria andTransJnnoIsNotNull() {
            addCriterion("TRANS_JNNO is not null");
            return (Criteria) this;
        }

        public Criteria andTransJnnoEqualTo(String value) {
            addCriterion("TRANS_JNNO =", value, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoNotEqualTo(String value) {
            addCriterion("TRANS_JNNO <>", value, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoGreaterThan(String value) {
            addCriterion("TRANS_JNNO >", value, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_JNNO >=", value, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoLessThan(String value) {
            addCriterion("TRANS_JNNO <", value, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoLessThanOrEqualTo(String value) {
            addCriterion("TRANS_JNNO <=", value, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoLike(String value) {
            addCriterion("TRANS_JNNO like", value, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoNotLike(String value) {
            addCriterion("TRANS_JNNO not like", value, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoIn(List<String> values) {
            addCriterion("TRANS_JNNO in", values, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoNotIn(List<String> values) {
            addCriterion("TRANS_JNNO not in", values, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoBetween(String value1, String value2) {
            addCriterion("TRANS_JNNO between", value1, value2, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransJnnoNotBetween(String value1, String value2) {
            addCriterion("TRANS_JNNO not between", value1, value2, "transJnno");
            return (Criteria) this;
        }

        public Criteria andTransDtIsNull() {
            addCriterion("TRANS_DT is null");
            return (Criteria) this;
        }

        public Criteria andTransDtIsNotNull() {
            addCriterion("TRANS_DT is not null");
            return (Criteria) this;
        }

        public Criteria andTransDtEqualTo(String value) {
            addCriterion("TRANS_DT =", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtNotEqualTo(String value) {
            addCriterion("TRANS_DT <>", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtGreaterThan(String value) {
            addCriterion("TRANS_DT >", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_DT >=", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtLessThan(String value) {
            addCriterion("TRANS_DT <", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtLessThanOrEqualTo(String value) {
            addCriterion("TRANS_DT <=", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtLike(String value) {
            addCriterion("TRANS_DT like", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtNotLike(String value) {
            addCriterion("TRANS_DT not like", value, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtIn(List<String> values) {
            addCriterion("TRANS_DT in", values, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtNotIn(List<String> values) {
            addCriterion("TRANS_DT not in", values, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtBetween(String value1, String value2) {
            addCriterion("TRANS_DT between", value1, value2, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransDtNotBetween(String value1, String value2) {
            addCriterion("TRANS_DT not between", value1, value2, "transDt");
            return (Criteria) this;
        }

        public Criteria andTransTmIsNull() {
            addCriterion("TRANS_TM is null");
            return (Criteria) this;
        }

        public Criteria andTransTmIsNotNull() {
            addCriterion("TRANS_TM is not null");
            return (Criteria) this;
        }

        public Criteria andTransTmEqualTo(String value) {
            addCriterion("TRANS_TM =", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmNotEqualTo(String value) {
            addCriterion("TRANS_TM <>", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmGreaterThan(String value) {
            addCriterion("TRANS_TM >", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TM >=", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmLessThan(String value) {
            addCriterion("TRANS_TM <", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TM <=", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmLike(String value) {
            addCriterion("TRANS_TM like", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmNotLike(String value) {
            addCriterion("TRANS_TM not like", value, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmIn(List<String> values) {
            addCriterion("TRANS_TM in", values, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmNotIn(List<String> values) {
            addCriterion("TRANS_TM not in", values, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmBetween(String value1, String value2) {
            addCriterion("TRANS_TM between", value1, value2, "transTm");
            return (Criteria) this;
        }

        public Criteria andTransTmNotBetween(String value1, String value2) {
            addCriterion("TRANS_TM not between", value1, value2, "transTm");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andTransCdIsNull() {
            addCriterion("TRANS_CD is null");
            return (Criteria) this;
        }

        public Criteria andTransCdIsNotNull() {
            addCriterion("TRANS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTransCdEqualTo(String value) {
            addCriterion("TRANS_CD =", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotEqualTo(String value) {
            addCriterion("TRANS_CD <>", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdGreaterThan(String value) {
            addCriterion("TRANS_CD >", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_CD >=", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdLessThan(String value) {
            addCriterion("TRANS_CD <", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdLessThanOrEqualTo(String value) {
            addCriterion("TRANS_CD <=", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdLike(String value) {
            addCriterion("TRANS_CD like", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotLike(String value) {
            addCriterion("TRANS_CD not like", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdIn(List<String> values) {
            addCriterion("TRANS_CD in", values, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotIn(List<String> values) {
            addCriterion("TRANS_CD not in", values, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdBetween(String value1, String value2) {
            addCriterion("TRANS_CD between", value1, value2, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotBetween(String value1, String value2) {
            addCriterion("TRANS_CD not between", value1, value2, "transCd");
            return (Criteria) this;
        }

        public Criteria andExtfld1IsNull() {
            addCriterion("EXTFLD1 is null");
            return (Criteria) this;
        }

        public Criteria andExtfld1IsNotNull() {
            addCriterion("EXTFLD1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfld1EqualTo(String value) {
            addCriterion("EXTFLD1 =", value, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1NotEqualTo(String value) {
            addCriterion("EXTFLD1 <>", value, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1GreaterThan(String value) {
            addCriterion("EXTFLD1 >", value, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFLD1 >=", value, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1LessThan(String value) {
            addCriterion("EXTFLD1 <", value, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1LessThanOrEqualTo(String value) {
            addCriterion("EXTFLD1 <=", value, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1Like(String value) {
            addCriterion("EXTFLD1 like", value, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1NotLike(String value) {
            addCriterion("EXTFLD1 not like", value, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1In(List<String> values) {
            addCriterion("EXTFLD1 in", values, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1NotIn(List<String> values) {
            addCriterion("EXTFLD1 not in", values, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1Between(String value1, String value2) {
            addCriterion("EXTFLD1 between", value1, value2, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld1NotBetween(String value1, String value2) {
            addCriterion("EXTFLD1 not between", value1, value2, "extfld1");
            return (Criteria) this;
        }

        public Criteria andExtfld2IsNull() {
            addCriterion("EXTFLD2 is null");
            return (Criteria) this;
        }

        public Criteria andExtfld2IsNotNull() {
            addCriterion("EXTFLD2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfld2EqualTo(String value) {
            addCriterion("EXTFLD2 =", value, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2NotEqualTo(String value) {
            addCriterion("EXTFLD2 <>", value, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2GreaterThan(String value) {
            addCriterion("EXTFLD2 >", value, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFLD2 >=", value, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2LessThan(String value) {
            addCriterion("EXTFLD2 <", value, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2LessThanOrEqualTo(String value) {
            addCriterion("EXTFLD2 <=", value, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2Like(String value) {
            addCriterion("EXTFLD2 like", value, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2NotLike(String value) {
            addCriterion("EXTFLD2 not like", value, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2In(List<String> values) {
            addCriterion("EXTFLD2 in", values, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2NotIn(List<String> values) {
            addCriterion("EXTFLD2 not in", values, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2Between(String value1, String value2) {
            addCriterion("EXTFLD2 between", value1, value2, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld2NotBetween(String value1, String value2) {
            addCriterion("EXTFLD2 not between", value1, value2, "extfld2");
            return (Criteria) this;
        }

        public Criteria andExtfld3IsNull() {
            addCriterion("EXTFLD3 is null");
            return (Criteria) this;
        }

        public Criteria andExtfld3IsNotNull() {
            addCriterion("EXTFLD3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfld3EqualTo(String value) {
            addCriterion("EXTFLD3 =", value, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3NotEqualTo(String value) {
            addCriterion("EXTFLD3 <>", value, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3GreaterThan(String value) {
            addCriterion("EXTFLD3 >", value, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFLD3 >=", value, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3LessThan(String value) {
            addCriterion("EXTFLD3 <", value, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3LessThanOrEqualTo(String value) {
            addCriterion("EXTFLD3 <=", value, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3Like(String value) {
            addCriterion("EXTFLD3 like", value, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3NotLike(String value) {
            addCriterion("EXTFLD3 not like", value, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3In(List<String> values) {
            addCriterion("EXTFLD3 in", values, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3NotIn(List<String> values) {
            addCriterion("EXTFLD3 not in", values, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3Between(String value1, String value2) {
            addCriterion("EXTFLD3 between", value1, value2, "extfld3");
            return (Criteria) this;
        }

        public Criteria andExtfld3NotBetween(String value1, String value2) {
            addCriterion("EXTFLD3 not between", value1, value2, "extfld3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tbl_order_record_out
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}