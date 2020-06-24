package com.huayi.ljj.springcloud.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TblProdInventoryExample {
    /**
     * tbl_prod_inventory
     */
    protected String orderByClause;

    /**
     * tbl_prod_inventory
     */
    protected boolean distinct;

    /**
     * tbl_prod_inventory
     */
    protected List<Criteria> oredCriteria;

    public TblProdInventoryExample() {
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
     * tbl_prod_inventory
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

        public Criteria andCarrPriceIsNull() {
            addCriterion("CARR_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCarrPriceIsNotNull() {
            addCriterion("CARR_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCarrPriceEqualTo(BigDecimal value) {
            addCriterion("CARR_PRICE =", value, "carrPrice");
            return (Criteria) this;
        }

        public Criteria andCarrPriceNotEqualTo(BigDecimal value) {
            addCriterion("CARR_PRICE <>", value, "carrPrice");
            return (Criteria) this;
        }

        public Criteria andCarrPriceGreaterThan(BigDecimal value) {
            addCriterion("CARR_PRICE >", value, "carrPrice");
            return (Criteria) this;
        }

        public Criteria andCarrPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARR_PRICE >=", value, "carrPrice");
            return (Criteria) this;
        }

        public Criteria andCarrPriceLessThan(BigDecimal value) {
            addCriterion("CARR_PRICE <", value, "carrPrice");
            return (Criteria) this;
        }

        public Criteria andCarrPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARR_PRICE <=", value, "carrPrice");
            return (Criteria) this;
        }

        public Criteria andCarrPriceIn(List<BigDecimal> values) {
            addCriterion("CARR_PRICE in", values, "carrPrice");
            return (Criteria) this;
        }

        public Criteria andCarrPriceNotIn(List<BigDecimal> values) {
            addCriterion("CARR_PRICE not in", values, "carrPrice");
            return (Criteria) this;
        }

        public Criteria andCarrPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARR_PRICE between", value1, value2, "carrPrice");
            return (Criteria) this;
        }

        public Criteria andCarrPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARR_PRICE not between", value1, value2, "carrPrice");
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

        public Criteria andCreateDtIsNull() {
            addCriterion("CREATE_DT is null");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNotNull() {
            addCriterion("CREATE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDtEqualTo(String value) {
            addCriterion("CREATE_DT =", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotEqualTo(String value) {
            addCriterion("CREATE_DT <>", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThan(String value) {
            addCriterion("CREATE_DT >", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DT >=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThan(String value) {
            addCriterion("CREATE_DT <", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DT <=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLike(String value) {
            addCriterion("CREATE_DT like", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotLike(String value) {
            addCriterion("CREATE_DT not like", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtIn(List<String> values) {
            addCriterion("CREATE_DT in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotIn(List<String> values) {
            addCriterion("CREATE_DT not in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtBetween(String value1, String value2) {
            addCriterion("CREATE_DT between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotBetween(String value1, String value2) {
            addCriterion("CREATE_DT not between", value1, value2, "createDt");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tbl_prod_inventory
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