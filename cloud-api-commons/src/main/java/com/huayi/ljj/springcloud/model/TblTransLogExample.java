package com.huayi.ljj.springcloud.model;

import java.util.ArrayList;
import java.util.List;

public class TblTransLogExample {
    /**
     * tbl_trans_log
     */
    protected String orderByClause;

    /**
     * tbl_trans_log
     */
    protected boolean distinct;

    /**
     * tbl_trans_log
     */
    protected List<Criteria> oredCriteria;

    public TblTransLogExample() {
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
     * tbl_trans_log
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

        public Criteria andEventIsNull() {
            addCriterion("EVENT is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("EVENT is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(String value) {
            addCriterion("EVENT =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(String value) {
            addCriterion("EVENT <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(String value) {
            addCriterion("EVENT >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(String value) {
            addCriterion("EVENT <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(String value) {
            addCriterion("EVENT <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLike(String value) {
            addCriterion("EVENT like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotLike(String value) {
            addCriterion("EVENT not like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<String> values) {
            addCriterion("EVENT in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<String> values) {
            addCriterion("EVENT not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(String value1, String value2) {
            addCriterion("EVENT between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(String value1, String value2) {
            addCriterion("EVENT not between", value1, value2, "event");
            return (Criteria) this;
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

        public Criteria andProdCdIsNull() {
            addCriterion("PROD_CD is null");
            return (Criteria) this;
        }

        public Criteria andProdCdIsNotNull() {
            addCriterion("PROD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andProdCdEqualTo(String value) {
            addCriterion("PROD_CD =", value, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdNotEqualTo(String value) {
            addCriterion("PROD_CD <>", value, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdGreaterThan(String value) {
            addCriterion("PROD_CD >", value, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_CD >=", value, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdLessThan(String value) {
            addCriterion("PROD_CD <", value, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdLessThanOrEqualTo(String value) {
            addCriterion("PROD_CD <=", value, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdLike(String value) {
            addCriterion("PROD_CD like", value, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdNotLike(String value) {
            addCriterion("PROD_CD not like", value, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdIn(List<String> values) {
            addCriterion("PROD_CD in", values, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdNotIn(List<String> values) {
            addCriterion("PROD_CD not in", values, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdBetween(String value1, String value2) {
            addCriterion("PROD_CD between", value1, value2, "prodCd");
            return (Criteria) this;
        }

        public Criteria andProdCdNotBetween(String value1, String value2) {
            addCriterion("PROD_CD not between", value1, value2, "prodCd");
            return (Criteria) this;
        }

        public Criteria andOperatorNmIsNull() {
            addCriterion("OPERATOR_NM is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNmIsNotNull() {
            addCriterion("OPERATOR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNmEqualTo(String value) {
            addCriterion("OPERATOR_NM =", value, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmNotEqualTo(String value) {
            addCriterion("OPERATOR_NM <>", value, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmGreaterThan(String value) {
            addCriterion("OPERATOR_NM >", value, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_NM >=", value, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmLessThan(String value) {
            addCriterion("OPERATOR_NM <", value, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_NM <=", value, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmLike(String value) {
            addCriterion("OPERATOR_NM like", value, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmNotLike(String value) {
            addCriterion("OPERATOR_NM not like", value, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmIn(List<String> values) {
            addCriterion("OPERATOR_NM in", values, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmNotIn(List<String> values) {
            addCriterion("OPERATOR_NM not in", values, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmBetween(String value1, String value2) {
            addCriterion("OPERATOR_NM between", value1, value2, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorNmNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_NM not between", value1, value2, "operatorNm");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("OPERATOR_ID like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("OPERATOR_ID not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tbl_trans_log
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