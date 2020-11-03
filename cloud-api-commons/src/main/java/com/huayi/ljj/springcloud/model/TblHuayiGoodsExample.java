package com.huayi.ljj.springcloud.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TblHuayiGoodsExample {
    /**
     * huayi_goods
     */
    protected String orderByClause;

    /**
     * huayi_goods
     */
    protected boolean distinct;

    /**
     * huayi_goods
     */
    protected List<Criteria> oredCriteria;

    public TblHuayiGoodsExample() {
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
     * huayi_goods
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

        public Criteria andTranDtIsNull() {
            addCriterion("tran_dt is null");
            return (Criteria) this;
        }

        public Criteria andTranDtIsNotNull() {
            addCriterion("tran_dt is not null");
            return (Criteria) this;
        }

        public Criteria andTranDtEqualTo(String value) {
            addCriterion("tran_dt =", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtNotEqualTo(String value) {
            addCriterion("tran_dt <>", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtGreaterThan(String value) {
            addCriterion("tran_dt >", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtGreaterThanOrEqualTo(String value) {
            addCriterion("tran_dt >=", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtLessThan(String value) {
            addCriterion("tran_dt <", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtLessThanOrEqualTo(String value) {
            addCriterion("tran_dt <=", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtLike(String value) {
            addCriterion("tran_dt like", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtNotLike(String value) {
            addCriterion("tran_dt not like", value, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtIn(List<String> values) {
            addCriterion("tran_dt in", values, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtNotIn(List<String> values) {
            addCriterion("tran_dt not in", values, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtBetween(String value1, String value2) {
            addCriterion("tran_dt between", value1, value2, "tranDt");
            return (Criteria) this;
        }

        public Criteria andTranDtNotBetween(String value1, String value2) {
            addCriterion("tran_dt not between", value1, value2, "tranDt");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(BigDecimal value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(BigDecimal value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(BigDecimal value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(BigDecimal value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<BigDecimal> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<BigDecimal> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * huayi_goods
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