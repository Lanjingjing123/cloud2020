package com.huayi.ljj.springcloud.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TblBuyTransExample {
    /**
     * buy_trans
     */
    protected String orderByClause;

    /**
     * buy_trans
     */
    protected boolean distinct;

    /**
     * buy_trans
     */
    protected List<Criteria> oredCriteria;

    public TblBuyTransExample() {
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
     * buy_trans
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

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andGoodsNmIsNull() {
            addCriterion("GOODS_NM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNmIsNotNull() {
            addCriterion("GOODS_NM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNmEqualTo(String value) {
            addCriterion("GOODS_NM =", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotEqualTo(String value) {
            addCriterion("GOODS_NM <>", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmGreaterThan(String value) {
            addCriterion("GOODS_NM >", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NM >=", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmLessThan(String value) {
            addCriterion("GOODS_NM <", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NM <=", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmLike(String value) {
            addCriterion("GOODS_NM like", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotLike(String value) {
            addCriterion("GOODS_NM not like", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmIn(List<String> values) {
            addCriterion("GOODS_NM in", values, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotIn(List<String> values) {
            addCriterion("GOODS_NM not in", values, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmBetween(String value1, String value2) {
            addCriterion("GOODS_NM between", value1, value2, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotBetween(String value1, String value2) {
            addCriterion("GOODS_NM not between", value1, value2, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("SPECIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("SPECIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("SPECIFICATION =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("SPECIFICATION <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("SPECIFICATION >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("SPECIFICATION <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("SPECIFICATION like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("SPECIFICATION not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("SPECIFICATION in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("SPECIFICATION not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("SPECIFICATION between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("SPECIFICATION not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNull() {
            addCriterion("THICKNESS is null");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNotNull() {
            addCriterion("THICKNESS is not null");
            return (Criteria) this;
        }

        public Criteria andThicknessEqualTo(String value) {
            addCriterion("THICKNESS =", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotEqualTo(String value) {
            addCriterion("THICKNESS <>", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThan(String value) {
            addCriterion("THICKNESS >", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThanOrEqualTo(String value) {
            addCriterion("THICKNESS >=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThan(String value) {
            addCriterion("THICKNESS <", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThanOrEqualTo(String value) {
            addCriterion("THICKNESS <=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLike(String value) {
            addCriterion("THICKNESS like", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotLike(String value) {
            addCriterion("THICKNESS not like", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessIn(List<String> values) {
            addCriterion("THICKNESS in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotIn(List<String> values) {
            addCriterion("THICKNESS not in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessBetween(String value1, String value2) {
            addCriterion("THICKNESS between", value1, value2, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotBetween(String value1, String value2) {
            addCriterion("THICKNESS not between", value1, value2, "thickness");
            return (Criteria) this;
        }

        public Criteria andQuantityPerIsNull() {
            addCriterion("quantity_per is null");
            return (Criteria) this;
        }

        public Criteria andQuantityPerIsNotNull() {
            addCriterion("quantity_per is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityPerEqualTo(BigDecimal value) {
            addCriterion("quantity_per =", value, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andQuantityPerNotEqualTo(BigDecimal value) {
            addCriterion("quantity_per <>", value, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andQuantityPerGreaterThan(BigDecimal value) {
            addCriterion("quantity_per >", value, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andQuantityPerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity_per >=", value, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andQuantityPerLessThan(BigDecimal value) {
            addCriterion("quantity_per <", value, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andQuantityPerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity_per <=", value, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andQuantityPerIn(List<BigDecimal> values) {
            addCriterion("quantity_per in", values, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andQuantityPerNotIn(List<BigDecimal> values) {
            addCriterion("quantity_per not in", values, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andQuantityPerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity_per between", value1, value2, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andQuantityPerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity_per not between", value1, value2, "quantityPer");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesIsNull() {
            addCriterion("NUMBER_OF_CASES is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesIsNotNull() {
            addCriterion("NUMBER_OF_CASES is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesEqualTo(BigDecimal value) {
            addCriterion("NUMBER_OF_CASES =", value, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesNotEqualTo(BigDecimal value) {
            addCriterion("NUMBER_OF_CASES <>", value, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesGreaterThan(BigDecimal value) {
            addCriterion("NUMBER_OF_CASES >", value, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMBER_OF_CASES >=", value, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesLessThan(BigDecimal value) {
            addCriterion("NUMBER_OF_CASES <", value, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMBER_OF_CASES <=", value, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesIn(List<BigDecimal> values) {
            addCriterion("NUMBER_OF_CASES in", values, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesNotIn(List<BigDecimal> values) {
            addCriterion("NUMBER_OF_CASES not in", values, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMBER_OF_CASES between", value1, value2, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andNumberOfCasesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMBER_OF_CASES not between", value1, value2, "numberOfCases");
            return (Criteria) this;
        }

        public Criteria andQuanlityIsNull() {
            addCriterion("quanlity is null");
            return (Criteria) this;
        }

        public Criteria andQuanlityIsNotNull() {
            addCriterion("quanlity is not null");
            return (Criteria) this;
        }

        public Criteria andQuanlityEqualTo(BigDecimal value) {
            addCriterion("quanlity =", value, "quanlity");
            return (Criteria) this;
        }

        public Criteria andQuanlityNotEqualTo(BigDecimal value) {
            addCriterion("quanlity <>", value, "quanlity");
            return (Criteria) this;
        }

        public Criteria andQuanlityGreaterThan(BigDecimal value) {
            addCriterion("quanlity >", value, "quanlity");
            return (Criteria) this;
        }

        public Criteria andQuanlityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quanlity >=", value, "quanlity");
            return (Criteria) this;
        }

        public Criteria andQuanlityLessThan(BigDecimal value) {
            addCriterion("quanlity <", value, "quanlity");
            return (Criteria) this;
        }

        public Criteria andQuanlityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quanlity <=", value, "quanlity");
            return (Criteria) this;
        }

        public Criteria andQuanlityIn(List<BigDecimal> values) {
            addCriterion("quanlity in", values, "quanlity");
            return (Criteria) this;
        }

        public Criteria andQuanlityNotIn(List<BigDecimal> values) {
            addCriterion("quanlity not in", values, "quanlity");
            return (Criteria) this;
        }

        public Criteria andQuanlityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quanlity between", value1, value2, "quanlity");
            return (Criteria) this;
        }

        public Criteria andQuanlityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quanlity not between", value1, value2, "quanlity");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIsNull() {
            addCriterion("total_weight is null");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIsNotNull() {
            addCriterion("total_weight is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWeightEqualTo(BigDecimal value) {
            addCriterion("total_weight =", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotEqualTo(BigDecimal value) {
            addCriterion("total_weight <>", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightGreaterThan(BigDecimal value) {
            addCriterion("total_weight >", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_weight >=", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightLessThan(BigDecimal value) {
            addCriterion("total_weight <", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_weight <=", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIn(List<BigDecimal> values) {
            addCriterion("total_weight in", values, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotIn(List<BigDecimal> values) {
            addCriterion("total_weight not in", values, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_weight between", value1, value2, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_weight not between", value1, value2, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andWeightPerIsNull() {
            addCriterion("weight_per is null");
            return (Criteria) this;
        }

        public Criteria andWeightPerIsNotNull() {
            addCriterion("weight_per is not null");
            return (Criteria) this;
        }

        public Criteria andWeightPerEqualTo(BigDecimal value) {
            addCriterion("weight_per =", value, "weightPer");
            return (Criteria) this;
        }

        public Criteria andWeightPerNotEqualTo(BigDecimal value) {
            addCriterion("weight_per <>", value, "weightPer");
            return (Criteria) this;
        }

        public Criteria andWeightPerGreaterThan(BigDecimal value) {
            addCriterion("weight_per >", value, "weightPer");
            return (Criteria) this;
        }

        public Criteria andWeightPerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight_per >=", value, "weightPer");
            return (Criteria) this;
        }

        public Criteria andWeightPerLessThan(BigDecimal value) {
            addCriterion("weight_per <", value, "weightPer");
            return (Criteria) this;
        }

        public Criteria andWeightPerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight_per <=", value, "weightPer");
            return (Criteria) this;
        }

        public Criteria andWeightPerIn(List<BigDecimal> values) {
            addCriterion("weight_per in", values, "weightPer");
            return (Criteria) this;
        }

        public Criteria andWeightPerNotIn(List<BigDecimal> values) {
            addCriterion("weight_per not in", values, "weightPer");
            return (Criteria) this;
        }

        public Criteria andWeightPerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight_per between", value1, value2, "weightPer");
            return (Criteria) this;
        }

        public Criteria andWeightPerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight_per not between", value1, value2, "weightPer");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andTranDtIsNull() {
            addCriterion("TRAN_DT is null");
            return (Criteria) this;
        }

        public Criteria andTranDtIsNotNull() {
            addCriterion("TRAN_DT is not null");
            return (Criteria) this;
        }

        public Criteria andTranDtEqualTo(String value) {
            addCriterion("TRAN_DT =", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtNotEqualTo(String value) {
            addCriterion("TRAN_DT <>", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtGreaterThan(String value) {
            addCriterion("TRAN_DT >", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtGreaterThanOrEqualTo(String value) {
            addCriterion("TRAN_DT >=", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtLessThan(String value) {
            addCriterion("TRAN_DT <", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtLessThanOrEqualTo(String value) {
            addCriterion("TRAN_DT <=", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtLike(String value) {
            addCriterion("TRAN_DT like", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtNotLike(String value) {
            addCriterion("TRAN_DT not like", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtIn(List<String> values) {
            addCriterion("TRAN_DT in", values, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtNotIn(List<String> values) {
            addCriterion("TRAN_DT not in", values, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtBetween(String value1, String value2) {
            addCriterion("TRAN_DT between", value1, value2, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtNotBetween(String value1, String value2) {
            addCriterion("TRAN_DT not between", value1, value2, "tranDt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * buy_trans
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