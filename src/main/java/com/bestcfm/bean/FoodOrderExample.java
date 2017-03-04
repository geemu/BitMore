package com.bestcfm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FoodOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodOrderExample() {
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
     * 类注释
     * GeneratedCriteria
     * 数据库表：foodorder
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoIsNull() {
            addCriterion("foodOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoIsNotNull() {
            addCriterion("foodOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoEqualTo(String value) {
            addCriterion("foodOrderNo =", value, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoNotEqualTo(String value) {
            addCriterion("foodOrderNo <>", value, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoGreaterThan(String value) {
            addCriterion("foodOrderNo >", value, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("foodOrderNo >=", value, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoLessThan(String value) {
            addCriterion("foodOrderNo <", value, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoLessThanOrEqualTo(String value) {
            addCriterion("foodOrderNo <=", value, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoLike(String value) {
            addCriterion("foodOrderNo like", value, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoNotLike(String value) {
            addCriterion("foodOrderNo not like", value, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoIn(List<String> values) {
            addCriterion("foodOrderNo in", values, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoNotIn(List<String> values) {
            addCriterion("foodOrderNo not in", values, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoBetween(String value1, String value2) {
            addCriterion("foodOrderNo between", value1, value2, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderNoNotBetween(String value1, String value2) {
            addCriterion("foodOrderNo not between", value1, value2, "foodOrderNo");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeIsNull() {
            addCriterion("foodOrderTime is null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeIsNotNull() {
            addCriterion("foodOrderTime is not null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeEqualTo(Date value) {
            addCriterion("foodOrderTime =", value, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeNotEqualTo(Date value) {
            addCriterion("foodOrderTime <>", value, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeGreaterThan(Date value) {
            addCriterion("foodOrderTime >", value, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("foodOrderTime >=", value, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeLessThan(Date value) {
            addCriterion("foodOrderTime <", value, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("foodOrderTime <=", value, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeIn(List<Date> values) {
            addCriterion("foodOrderTime in", values, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeNotIn(List<Date> values) {
            addCriterion("foodOrderTime not in", values, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeBetween(Date value1, Date value2) {
            addCriterion("foodOrderTime between", value1, value2, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("foodOrderTime not between", value1, value2, "foodOrderTime");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateIsNull() {
            addCriterion("foodOrderState is null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateIsNotNull() {
            addCriterion("foodOrderState is not null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateEqualTo(Integer value) {
            addCriterion("foodOrderState =", value, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateNotEqualTo(Integer value) {
            addCriterion("foodOrderState <>", value, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateGreaterThan(Integer value) {
            addCriterion("foodOrderState >", value, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodOrderState >=", value, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateLessThan(Integer value) {
            addCriterion("foodOrderState <", value, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("foodOrderState <=", value, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateIn(List<Integer> values) {
            addCriterion("foodOrderState in", values, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateNotIn(List<Integer> values) {
            addCriterion("foodOrderState not in", values, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("foodOrderState between", value1, value2, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("foodOrderState not between", value1, value2, "foodOrderState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountIsNull() {
            addCriterion("foodOrderCount is null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountIsNotNull() {
            addCriterion("foodOrderCount is not null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountEqualTo(Integer value) {
            addCriterion("foodOrderCount =", value, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountNotEqualTo(Integer value) {
            addCriterion("foodOrderCount <>", value, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountGreaterThan(Integer value) {
            addCriterion("foodOrderCount >", value, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodOrderCount >=", value, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountLessThan(Integer value) {
            addCriterion("foodOrderCount <", value, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("foodOrderCount <=", value, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountIn(List<Integer> values) {
            addCriterion("foodOrderCount in", values, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountNotIn(List<Integer> values) {
            addCriterion("foodOrderCount not in", values, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("foodOrderCount between", value1, value2, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("foodOrderCount not between", value1, value2, "foodOrderCount");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNull() {
            addCriterion("foodId is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("foodId is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Integer value) {
            addCriterion("foodId =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Integer value) {
            addCriterion("foodId <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Integer value) {
            addCriterion("foodId >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodId >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Integer value) {
            addCriterion("foodId <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("foodId <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Integer> values) {
            addCriterion("foodId in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Integer> values) {
            addCriterion("foodId not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Integer value1, Integer value2) {
            addCriterion("foodId between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("foodId not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNull() {
            addCriterion("foodName is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("foodName is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("foodName =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("foodName <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("foodName >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("foodName >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("foodName <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("foodName <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("foodName like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("foodName not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("foodName in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("foodName not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("foodName between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("foodName not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateIsNull() {
            addCriterion("foodOrderEvaState is null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateIsNotNull() {
            addCriterion("foodOrderEvaState is not null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateEqualTo(Integer value) {
            addCriterion("foodOrderEvaState =", value, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateNotEqualTo(Integer value) {
            addCriterion("foodOrderEvaState <>", value, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateGreaterThan(Integer value) {
            addCriterion("foodOrderEvaState >", value, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodOrderEvaState >=", value, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateLessThan(Integer value) {
            addCriterion("foodOrderEvaState <", value, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateLessThanOrEqualTo(Integer value) {
            addCriterion("foodOrderEvaState <=", value, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateIn(List<Integer> values) {
            addCriterion("foodOrderEvaState in", values, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateNotIn(List<Integer> values) {
            addCriterion("foodOrderEvaState not in", values, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateBetween(Integer value1, Integer value2) {
            addCriterion("foodOrderEvaState between", value1, value2, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderEvaStateNotBetween(Integer value1, Integer value2) {
            addCriterion("foodOrderEvaState not between", value1, value2, "foodOrderEvaState");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteIsNull() {
            addCriterion("foodOrderIsDelete is null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteIsNotNull() {
            addCriterion("foodOrderIsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteEqualTo(Integer value) {
            addCriterion("foodOrderIsDelete =", value, "foodOrderIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteNotEqualTo(Integer value) {
            addCriterion("foodOrderIsDelete <>", value, "foodOrderIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteGreaterThan(Integer value) {
            addCriterion("foodOrderIsDelete >", value, "foodOrderIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodOrderIsDelete >=", value, "foodOrderIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteLessThan(Integer value) {
            addCriterion("foodOrderIsDelete <", value, "foodOrderIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("foodOrderIsDelete <=", value, "foodOrderIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteIn(List<Integer> values) {
            addCriterion("foodOrderIsDelete in", values, "foodOrderIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteNotIn(List<Integer> values) {
            addCriterion("foodOrderIsDelete not in", values, "foodOrderIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("foodOrderIsDelete between", value1, value2, "foodOrderIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodOrderIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("foodOrderIsDelete not between", value1, value2, "foodOrderIsDelete");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：foodorder
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：foodorder
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