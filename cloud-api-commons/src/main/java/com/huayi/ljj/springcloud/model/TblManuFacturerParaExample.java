package com.huayi.ljj.springcloud.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TblManuFacturerParaExample {
    /**
     * tbl_manufacturer_para
     */
    protected String orderByClause;

    /**
     * tbl_manufacturer_para
     */
    protected boolean distinct;

    /**
     * tbl_manufacturer_para
     */
    protected List<Criteria> oredCriteria;

    public TblManuFacturerParaExample() {
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
     * tbl_manufacturer_para
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

        public Criteria andManufacturerCodeIsNull() {
            addCriterion("MANUFACTURER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeIsNotNull() {
            addCriterion("MANUFACTURER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeEqualTo(String value) {
            addCriterion("MANUFACTURER_CODE =", value, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeNotEqualTo(String value) {
            addCriterion("MANUFACTURER_CODE <>", value, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeGreaterThan(String value) {
            addCriterion("MANUFACTURER_CODE >", value, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_CODE >=", value, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeLessThan(String value) {
            addCriterion("MANUFACTURER_CODE <", value, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_CODE <=", value, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeLike(String value) {
            addCriterion("MANUFACTURER_CODE like", value, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeNotLike(String value) {
            addCriterion("MANUFACTURER_CODE not like", value, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeIn(List<String> values) {
            addCriterion("MANUFACTURER_CODE in", values, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeNotIn(List<String> values) {
            addCriterion("MANUFACTURER_CODE not in", values, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_CODE between", value1, value2, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerCodeNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_CODE not between", value1, value2, "manufacturerCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmIsNull() {
            addCriterion("MANUFACTURER_NM is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmIsNotNull() {
            addCriterion("MANUFACTURER_NM is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmEqualTo(String value) {
            addCriterion("MANUFACTURER_NM =", value, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmNotEqualTo(String value) {
            addCriterion("MANUFACTURER_NM <>", value, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmGreaterThan(String value) {
            addCriterion("MANUFACTURER_NM >", value, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_NM >=", value, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmLessThan(String value) {
            addCriterion("MANUFACTURER_NM <", value, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_NM <=", value, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmLike(String value) {
            addCriterion("MANUFACTURER_NM like", value, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmNotLike(String value) {
            addCriterion("MANUFACTURER_NM not like", value, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmIn(List<String> values) {
            addCriterion("MANUFACTURER_NM in", values, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmNotIn(List<String> values) {
            addCriterion("MANUFACTURER_NM not in", values, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_NM between", value1, value2, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerNmNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_NM not between", value1, value2, "manufacturerNm");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelIsNull() {
            addCriterion("MANUFACTURER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelIsNotNull() {
            addCriterion("MANUFACTURER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelEqualTo(String value) {
            addCriterion("MANUFACTURER_TEL =", value, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelNotEqualTo(String value) {
            addCriterion("MANUFACTURER_TEL <>", value, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelGreaterThan(String value) {
            addCriterion("MANUFACTURER_TEL >", value, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_TEL >=", value, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelLessThan(String value) {
            addCriterion("MANUFACTURER_TEL <", value, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_TEL <=", value, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelLike(String value) {
            addCriterion("MANUFACTURER_TEL like", value, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelNotLike(String value) {
            addCriterion("MANUFACTURER_TEL not like", value, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelIn(List<String> values) {
            addCriterion("MANUFACTURER_TEL in", values, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelNotIn(List<String> values) {
            addCriterion("MANUFACTURER_TEL not in", values, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_TEL between", value1, value2, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andManufacturerTelNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_TEL not between", value1, value2, "manufacturerTel");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseIsNull() {
            addCriterion("TRANSPORTATION_EXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseIsNotNull() {
            addCriterion("TRANSPORTATION_EXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseEqualTo(BigDecimal value) {
            addCriterion("TRANSPORTATION_EXPENSE =", value, "transportationExpense");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseNotEqualTo(BigDecimal value) {
            addCriterion("TRANSPORTATION_EXPENSE <>", value, "transportationExpense");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseGreaterThan(BigDecimal value) {
            addCriterion("TRANSPORTATION_EXPENSE >", value, "transportationExpense");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSPORTATION_EXPENSE >=", value, "transportationExpense");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseLessThan(BigDecimal value) {
            addCriterion("TRANSPORTATION_EXPENSE <", value, "transportationExpense");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSPORTATION_EXPENSE <=", value, "transportationExpense");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseIn(List<BigDecimal> values) {
            addCriterion("TRANSPORTATION_EXPENSE in", values, "transportationExpense");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseNotIn(List<BigDecimal> values) {
            addCriterion("TRANSPORTATION_EXPENSE not in", values, "transportationExpense");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSPORTATION_EXPENSE between", value1, value2, "transportationExpense");
            return (Criteria) this;
        }

        public Criteria andTransportationExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSPORTATION_EXPENSE not between", value1, value2, "transportationExpense");
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

        public Criteria andExtfld4IsNull() {
            addCriterion("EXTFLD4 is null");
            return (Criteria) this;
        }

        public Criteria andExtfld4IsNotNull() {
            addCriterion("EXTFLD4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfld4EqualTo(String value) {
            addCriterion("EXTFLD4 =", value, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4NotEqualTo(String value) {
            addCriterion("EXTFLD4 <>", value, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4GreaterThan(String value) {
            addCriterion("EXTFLD4 >", value, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFLD4 >=", value, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4LessThan(String value) {
            addCriterion("EXTFLD4 <", value, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4LessThanOrEqualTo(String value) {
            addCriterion("EXTFLD4 <=", value, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4Like(String value) {
            addCriterion("EXTFLD4 like", value, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4NotLike(String value) {
            addCriterion("EXTFLD4 not like", value, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4In(List<String> values) {
            addCriterion("EXTFLD4 in", values, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4NotIn(List<String> values) {
            addCriterion("EXTFLD4 not in", values, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4Between(String value1, String value2) {
            addCriterion("EXTFLD4 between", value1, value2, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld4NotBetween(String value1, String value2) {
            addCriterion("EXTFLD4 not between", value1, value2, "extfld4");
            return (Criteria) this;
        }

        public Criteria andExtfld5IsNull() {
            addCriterion("EXTFLD5 is null");
            return (Criteria) this;
        }

        public Criteria andExtfld5IsNotNull() {
            addCriterion("EXTFLD5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfld5EqualTo(String value) {
            addCriterion("EXTFLD5 =", value, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5NotEqualTo(String value) {
            addCriterion("EXTFLD5 <>", value, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5GreaterThan(String value) {
            addCriterion("EXTFLD5 >", value, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFLD5 >=", value, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5LessThan(String value) {
            addCriterion("EXTFLD5 <", value, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5LessThanOrEqualTo(String value) {
            addCriterion("EXTFLD5 <=", value, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5Like(String value) {
            addCriterion("EXTFLD5 like", value, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5NotLike(String value) {
            addCriterion("EXTFLD5 not like", value, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5In(List<String> values) {
            addCriterion("EXTFLD5 in", values, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5NotIn(List<String> values) {
            addCriterion("EXTFLD5 not in", values, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5Between(String value1, String value2) {
            addCriterion("EXTFLD5 between", value1, value2, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld5NotBetween(String value1, String value2) {
            addCriterion("EXTFLD5 not between", value1, value2, "extfld5");
            return (Criteria) this;
        }

        public Criteria andExtfld6IsNull() {
            addCriterion("EXTFLD6 is null");
            return (Criteria) this;
        }

        public Criteria andExtfld6IsNotNull() {
            addCriterion("EXTFLD6 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfld6EqualTo(String value) {
            addCriterion("EXTFLD6 =", value, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6NotEqualTo(String value) {
            addCriterion("EXTFLD6 <>", value, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6GreaterThan(String value) {
            addCriterion("EXTFLD6 >", value, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFLD6 >=", value, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6LessThan(String value) {
            addCriterion("EXTFLD6 <", value, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6LessThanOrEqualTo(String value) {
            addCriterion("EXTFLD6 <=", value, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6Like(String value) {
            addCriterion("EXTFLD6 like", value, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6NotLike(String value) {
            addCriterion("EXTFLD6 not like", value, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6In(List<String> values) {
            addCriterion("EXTFLD6 in", values, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6NotIn(List<String> values) {
            addCriterion("EXTFLD6 not in", values, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6Between(String value1, String value2) {
            addCriterion("EXTFLD6 between", value1, value2, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld6NotBetween(String value1, String value2) {
            addCriterion("EXTFLD6 not between", value1, value2, "extfld6");
            return (Criteria) this;
        }

        public Criteria andExtfld7IsNull() {
            addCriterion("EXTFLD7 is null");
            return (Criteria) this;
        }

        public Criteria andExtfld7IsNotNull() {
            addCriterion("EXTFLD7 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfld7EqualTo(String value) {
            addCriterion("EXTFLD7 =", value, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7NotEqualTo(String value) {
            addCriterion("EXTFLD7 <>", value, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7GreaterThan(String value) {
            addCriterion("EXTFLD7 >", value, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFLD7 >=", value, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7LessThan(String value) {
            addCriterion("EXTFLD7 <", value, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7LessThanOrEqualTo(String value) {
            addCriterion("EXTFLD7 <=", value, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7Like(String value) {
            addCriterion("EXTFLD7 like", value, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7NotLike(String value) {
            addCriterion("EXTFLD7 not like", value, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7In(List<String> values) {
            addCriterion("EXTFLD7 in", values, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7NotIn(List<String> values) {
            addCriterion("EXTFLD7 not in", values, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7Between(String value1, String value2) {
            addCriterion("EXTFLD7 between", value1, value2, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld7NotBetween(String value1, String value2) {
            addCriterion("EXTFLD7 not between", value1, value2, "extfld7");
            return (Criteria) this;
        }

        public Criteria andExtfld8IsNull() {
            addCriterion("EXTFLD8 is null");
            return (Criteria) this;
        }

        public Criteria andExtfld8IsNotNull() {
            addCriterion("EXTFLD8 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfld8EqualTo(String value) {
            addCriterion("EXTFLD8 =", value, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8NotEqualTo(String value) {
            addCriterion("EXTFLD8 <>", value, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8GreaterThan(String value) {
            addCriterion("EXTFLD8 >", value, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFLD8 >=", value, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8LessThan(String value) {
            addCriterion("EXTFLD8 <", value, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8LessThanOrEqualTo(String value) {
            addCriterion("EXTFLD8 <=", value, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8Like(String value) {
            addCriterion("EXTFLD8 like", value, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8NotLike(String value) {
            addCriterion("EXTFLD8 not like", value, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8In(List<String> values) {
            addCriterion("EXTFLD8 in", values, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8NotIn(List<String> values) {
            addCriterion("EXTFLD8 not in", values, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8Between(String value1, String value2) {
            addCriterion("EXTFLD8 between", value1, value2, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld8NotBetween(String value1, String value2) {
            addCriterion("EXTFLD8 not between", value1, value2, "extfld8");
            return (Criteria) this;
        }

        public Criteria andExtfld9IsNull() {
            addCriterion("EXTFLD9 is null");
            return (Criteria) this;
        }

        public Criteria andExtfld9IsNotNull() {
            addCriterion("EXTFLD9 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfld9EqualTo(String value) {
            addCriterion("EXTFLD9 =", value, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9NotEqualTo(String value) {
            addCriterion("EXTFLD9 <>", value, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9GreaterThan(String value) {
            addCriterion("EXTFLD9 >", value, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFLD9 >=", value, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9LessThan(String value) {
            addCriterion("EXTFLD9 <", value, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9LessThanOrEqualTo(String value) {
            addCriterion("EXTFLD9 <=", value, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9Like(String value) {
            addCriterion("EXTFLD9 like", value, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9NotLike(String value) {
            addCriterion("EXTFLD9 not like", value, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9In(List<String> values) {
            addCriterion("EXTFLD9 in", values, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9NotIn(List<String> values) {
            addCriterion("EXTFLD9 not in", values, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9Between(String value1, String value2) {
            addCriterion("EXTFLD9 between", value1, value2, "extfld9");
            return (Criteria) this;
        }

        public Criteria andExtfld9NotBetween(String value1, String value2) {
            addCriterion("EXTFLD9 not between", value1, value2, "extfld9");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tbl_manufacturer_para
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