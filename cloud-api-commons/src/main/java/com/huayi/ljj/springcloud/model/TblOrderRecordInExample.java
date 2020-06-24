package com.huayi.ljj.springcloud.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TblOrderRecordInExample {
    /**
     * tbl_order_record_in
     */
    protected String orderByClause;

    /**
     * tbl_order_record_in
     */
    protected boolean distinct;

    /**
     * tbl_order_record_in
     */
    protected List<Criteria> oredCriteria;

    public TblOrderRecordInExample() {
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
     * tbl_order_record_in
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

        public Criteria andPurchaseDtIsNull() {
            addCriterion("PURCHASE_DT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtIsNotNull() {
            addCriterion("PURCHASE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtEqualTo(String value) {
            addCriterion("PURCHASE_DT =", value, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtNotEqualTo(String value) {
            addCriterion("PURCHASE_DT <>", value, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtGreaterThan(String value) {
            addCriterion("PURCHASE_DT >", value, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DT >=", value, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtLessThan(String value) {
            addCriterion("PURCHASE_DT <", value, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DT <=", value, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtLike(String value) {
            addCriterion("PURCHASE_DT like", value, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtNotLike(String value) {
            addCriterion("PURCHASE_DT not like", value, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtIn(List<String> values) {
            addCriterion("PURCHASE_DT in", values, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtNotIn(List<String> values) {
            addCriterion("PURCHASE_DT not in", values, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtBetween(String value1, String value2) {
            addCriterion("PURCHASE_DT between", value1, value2, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andPurchaseDtNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_DT not between", value1, value2, "purchaseDt");
            return (Criteria) this;
        }

        public Criteria andTransNoIsNull() {
            addCriterion("TRANS_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransNoIsNotNull() {
            addCriterion("TRANS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransNoEqualTo(String value) {
            addCriterion("TRANS_NO =", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotEqualTo(String value) {
            addCriterion("TRANS_NO <>", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThan(String value) {
            addCriterion("TRANS_NO >", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_NO >=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThan(String value) {
            addCriterion("TRANS_NO <", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThanOrEqualTo(String value) {
            addCriterion("TRANS_NO <=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLike(String value) {
            addCriterion("TRANS_NO like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotLike(String value) {
            addCriterion("TRANS_NO not like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoIn(List<String> values) {
            addCriterion("TRANS_NO in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotIn(List<String> values) {
            addCriterion("TRANS_NO not in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoBetween(String value1, String value2) {
            addCriterion("TRANS_NO between", value1, value2, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotBetween(String value1, String value2) {
            addCriterion("TRANS_NO not between", value1, value2, "transNo");
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

        public Criteria andTransportationPriceIsNull() {
            addCriterion("TRANSPORTATION_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceIsNotNull() {
            addCriterion("TRANSPORTATION_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceEqualTo(BigDecimal value) {
            addCriterion("TRANSPORTATION_PRICE =", value, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceNotEqualTo(BigDecimal value) {
            addCriterion("TRANSPORTATION_PRICE <>", value, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceGreaterThan(BigDecimal value) {
            addCriterion("TRANSPORTATION_PRICE >", value, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSPORTATION_PRICE >=", value, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceLessThan(BigDecimal value) {
            addCriterion("TRANSPORTATION_PRICE <", value, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSPORTATION_PRICE <=", value, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceIn(List<BigDecimal> values) {
            addCriterion("TRANSPORTATION_PRICE in", values, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceNotIn(List<BigDecimal> values) {
            addCriterion("TRANSPORTATION_PRICE not in", values, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSPORTATION_PRICE between", value1, value2, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andTransportationPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSPORTATION_PRICE not between", value1, value2, "transportationPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceIsNull() {
            addCriterion("PRODUCT_OUT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceIsNotNull() {
            addCriterion("PRODUCT_OUT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_OUT_PRICE =", value, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_OUT_PRICE <>", value, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_OUT_PRICE >", value, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_OUT_PRICE >=", value, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceLessThan(BigDecimal value) {
            addCriterion("PRODUCT_OUT_PRICE <", value, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_OUT_PRICE <=", value, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_OUT_PRICE in", values, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_OUT_PRICE not in", values, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_OUT_PRICE between", value1, value2, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_OUT_PRICE not between", value1, value2, "productOutPrice");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountIsNull() {
            addCriterion("PRODUCT_OUT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountIsNotNull() {
            addCriterion("PRODUCT_OUT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_OUT_AMOUNT =", value, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_OUT_AMOUNT <>", value, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_OUT_AMOUNT >", value, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_OUT_AMOUNT >=", value, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountLessThan(BigDecimal value) {
            addCriterion("PRODUCT_OUT_AMOUNT <", value, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_OUT_AMOUNT <=", value, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_OUT_AMOUNT in", values, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_OUT_AMOUNT not in", values, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_OUT_AMOUNT between", value1, value2, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andProductOutAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_OUT_AMOUNT not between", value1, value2, "productOutAmount");
            return (Criteria) this;
        }

        public Criteria andCarryPriceIsNull() {
            addCriterion("CARRY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCarryPriceIsNotNull() {
            addCriterion("CARRY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCarryPriceEqualTo(BigDecimal value) {
            addCriterion("CARRY_PRICE =", value, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andCarryPriceNotEqualTo(BigDecimal value) {
            addCriterion("CARRY_PRICE <>", value, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andCarryPriceGreaterThan(BigDecimal value) {
            addCriterion("CARRY_PRICE >", value, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andCarryPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARRY_PRICE >=", value, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andCarryPriceLessThan(BigDecimal value) {
            addCriterion("CARRY_PRICE <", value, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andCarryPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARRY_PRICE <=", value, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andCarryPriceIn(List<BigDecimal> values) {
            addCriterion("CARRY_PRICE in", values, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andCarryPriceNotIn(List<BigDecimal> values) {
            addCriterion("CARRY_PRICE not in", values, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andCarryPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARRY_PRICE between", value1, value2, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andCarryPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARRY_PRICE not between", value1, value2, "carryPrice");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightIsNull() {
            addCriterion("IN_STORAGE_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightIsNotNull() {
            addCriterion("IN_STORAGE_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightEqualTo(String value) {
            addCriterion("IN_STORAGE_WEIGHT =", value, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightNotEqualTo(String value) {
            addCriterion("IN_STORAGE_WEIGHT <>", value, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightGreaterThan(String value) {
            addCriterion("IN_STORAGE_WEIGHT >", value, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightGreaterThanOrEqualTo(String value) {
            addCriterion("IN_STORAGE_WEIGHT >=", value, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightLessThan(String value) {
            addCriterion("IN_STORAGE_WEIGHT <", value, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightLessThanOrEqualTo(String value) {
            addCriterion("IN_STORAGE_WEIGHT <=", value, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightLike(String value) {
            addCriterion("IN_STORAGE_WEIGHT like", value, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightNotLike(String value) {
            addCriterion("IN_STORAGE_WEIGHT not like", value, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightIn(List<String> values) {
            addCriterion("IN_STORAGE_WEIGHT in", values, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightNotIn(List<String> values) {
            addCriterion("IN_STORAGE_WEIGHT not in", values, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightBetween(String value1, String value2) {
            addCriterion("IN_STORAGE_WEIGHT between", value1, value2, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageWeightNotBetween(String value1, String value2) {
            addCriterion("IN_STORAGE_WEIGHT not between", value1, value2, "inStorageWeight");
            return (Criteria) this;
        }

        public Criteria andInStorageNumIsNull() {
            addCriterion("IN_STORAGE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andInStorageNumIsNotNull() {
            addCriterion("IN_STORAGE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andInStorageNumEqualTo(String value) {
            addCriterion("IN_STORAGE_NUM =", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumNotEqualTo(String value) {
            addCriterion("IN_STORAGE_NUM <>", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumGreaterThan(String value) {
            addCriterion("IN_STORAGE_NUM >", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumGreaterThanOrEqualTo(String value) {
            addCriterion("IN_STORAGE_NUM >=", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumLessThan(String value) {
            addCriterion("IN_STORAGE_NUM <", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumLessThanOrEqualTo(String value) {
            addCriterion("IN_STORAGE_NUM <=", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumLike(String value) {
            addCriterion("IN_STORAGE_NUM like", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumNotLike(String value) {
            addCriterion("IN_STORAGE_NUM not like", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumIn(List<String> values) {
            addCriterion("IN_STORAGE_NUM in", values, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumNotIn(List<String> values) {
            addCriterion("IN_STORAGE_NUM not in", values, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumBetween(String value1, String value2) {
            addCriterion("IN_STORAGE_NUM between", value1, value2, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumNotBetween(String value1, String value2) {
            addCriterion("IN_STORAGE_NUM not between", value1, value2, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumIsNull() {
            addCriterion("INVENTORY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andInventoryNumIsNotNull() {
            addCriterion("INVENTORY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryNumEqualTo(String value) {
            addCriterion("INVENTORY_NUM =", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotEqualTo(String value) {
            addCriterion("INVENTORY_NUM <>", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumGreaterThan(String value) {
            addCriterion("INVENTORY_NUM >", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_NUM >=", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumLessThan(String value) {
            addCriterion("INVENTORY_NUM <", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_NUM <=", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumLike(String value) {
            addCriterion("INVENTORY_NUM like", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotLike(String value) {
            addCriterion("INVENTORY_NUM not like", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumIn(List<String> values) {
            addCriterion("INVENTORY_NUM in", values, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotIn(List<String> values) {
            addCriterion("INVENTORY_NUM not in", values, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumBetween(String value1, String value2) {
            addCriterion("INVENTORY_NUM between", value1, value2, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_NUM not between", value1, value2, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andPieceCountIsNull() {
            addCriterion("PIECE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPieceCountIsNotNull() {
            addCriterion("PIECE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPieceCountEqualTo(String value) {
            addCriterion("PIECE_COUNT =", value, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountNotEqualTo(String value) {
            addCriterion("PIECE_COUNT <>", value, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountGreaterThan(String value) {
            addCriterion("PIECE_COUNT >", value, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountGreaterThanOrEqualTo(String value) {
            addCriterion("PIECE_COUNT >=", value, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountLessThan(String value) {
            addCriterion("PIECE_COUNT <", value, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountLessThanOrEqualTo(String value) {
            addCriterion("PIECE_COUNT <=", value, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountLike(String value) {
            addCriterion("PIECE_COUNT like", value, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountNotLike(String value) {
            addCriterion("PIECE_COUNT not like", value, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountIn(List<String> values) {
            addCriterion("PIECE_COUNT in", values, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountNotIn(List<String> values) {
            addCriterion("PIECE_COUNT not in", values, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountBetween(String value1, String value2) {
            addCriterion("PIECE_COUNT between", value1, value2, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andPieceCountNotBetween(String value1, String value2) {
            addCriterion("PIECE_COUNT not between", value1, value2, "pieceCount");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(String value) {
            addCriterion("COUNT =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(String value) {
            addCriterion("COUNT <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(String value) {
            addCriterion("COUNT >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(String value) {
            addCriterion("COUNT >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(String value) {
            addCriterion("COUNT <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(String value) {
            addCriterion("COUNT <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLike(String value) {
            addCriterion("COUNT like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotLike(String value) {
            addCriterion("COUNT not like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<String> values) {
            addCriterion("COUNT in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<String> values) {
            addCriterion("COUNT not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(String value1, String value2) {
            addCriterion("COUNT between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(String value1, String value2) {
            addCriterion("COUNT not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceIsNull() {
            addCriterion("IN_STORAGE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceIsNotNull() {
            addCriterion("IN_STORAGE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceEqualTo(BigDecimal value) {
            addCriterion("IN_STORAGE_PRICE =", value, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceNotEqualTo(BigDecimal value) {
            addCriterion("IN_STORAGE_PRICE <>", value, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceGreaterThan(BigDecimal value) {
            addCriterion("IN_STORAGE_PRICE >", value, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_STORAGE_PRICE >=", value, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceLessThan(BigDecimal value) {
            addCriterion("IN_STORAGE_PRICE <", value, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_STORAGE_PRICE <=", value, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceIn(List<BigDecimal> values) {
            addCriterion("IN_STORAGE_PRICE in", values, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceNotIn(List<BigDecimal> values) {
            addCriterion("IN_STORAGE_PRICE not in", values, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_STORAGE_PRICE between", value1, value2, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andInStoragePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_STORAGE_PRICE not between", value1, value2, "inStoragePrice");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIsNull() {
            addCriterion("UPDATE_DT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIsNotNull() {
            addCriterion("UPDATE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDtEqualTo(String value) {
            addCriterion("UPDATE_DT =", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotEqualTo(String value) {
            addCriterion("UPDATE_DT <>", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtGreaterThan(String value) {
            addCriterion("UPDATE_DT >", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DT >=", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLessThan(String value) {
            addCriterion("UPDATE_DT <", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DT <=", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLike(String value) {
            addCriterion("UPDATE_DT like", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotLike(String value) {
            addCriterion("UPDATE_DT not like", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIn(List<String> values) {
            addCriterion("UPDATE_DT in", values, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotIn(List<String> values) {
            addCriterion("UPDATE_DT not in", values, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtBetween(String value1, String value2) {
            addCriterion("UPDATE_DT between", value1, value2, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DT not between", value1, value2, "updateDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtIsNull() {
            addCriterion("CREAT_DT is null");
            return (Criteria) this;
        }

        public Criteria andCreatDtIsNotNull() {
            addCriterion("CREAT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatDtEqualTo(String value) {
            addCriterion("CREAT_DT =", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtNotEqualTo(String value) {
            addCriterion("CREAT_DT <>", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtGreaterThan(String value) {
            addCriterion("CREAT_DT >", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtGreaterThanOrEqualTo(String value) {
            addCriterion("CREAT_DT >=", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtLessThan(String value) {
            addCriterion("CREAT_DT <", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtLessThanOrEqualTo(String value) {
            addCriterion("CREAT_DT <=", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtLike(String value) {
            addCriterion("CREAT_DT like", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtNotLike(String value) {
            addCriterion("CREAT_DT not like", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtIn(List<String> values) {
            addCriterion("CREAT_DT in", values, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtNotIn(List<String> values) {
            addCriterion("CREAT_DT not in", values, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtBetween(String value1, String value2) {
            addCriterion("CREAT_DT between", value1, value2, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtNotBetween(String value1, String value2) {
            addCriterion("CREAT_DT not between", value1, value2, "creatDt");
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
     * tbl_order_record_in
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