package com.bestcfm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FoodImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodImageExample() {
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
     * 数据库表：foodimage
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

        public Criteria andFoodImageIsNull() {
            addCriterion("foodImage is null");
            return (Criteria) this;
        }

        public Criteria andFoodImageIsNotNull() {
            addCriterion("foodImage is not null");
            return (Criteria) this;
        }

        public Criteria andFoodImageEqualTo(String value) {
            addCriterion("foodImage =", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageNotEqualTo(String value) {
            addCriterion("foodImage <>", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageGreaterThan(String value) {
            addCriterion("foodImage >", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageGreaterThanOrEqualTo(String value) {
            addCriterion("foodImage >=", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageLessThan(String value) {
            addCriterion("foodImage <", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageLessThanOrEqualTo(String value) {
            addCriterion("foodImage <=", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageLike(String value) {
            addCriterion("foodImage like", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageNotLike(String value) {
            addCriterion("foodImage not like", value, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageIn(List<String> values) {
            addCriterion("foodImage in", values, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageNotIn(List<String> values) {
            addCriterion("foodImage not in", values, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageBetween(String value1, String value2) {
            addCriterion("foodImage between", value1, value2, "foodImage");
            return (Criteria) this;
        }

        public Criteria andFoodImageNotBetween(String value1, String value2) {
            addCriterion("foodImage not between", value1, value2, "foodImage");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNull() {
            addCriterion("dataFlag is null");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNotNull() {
            addCriterion("dataFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDataFlagEqualTo(Integer value) {
            addCriterion("dataFlag =", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotEqualTo(Integer value) {
            addCriterion("dataFlag <>", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThan(Integer value) {
            addCriterion("dataFlag >", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("dataFlag >=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThan(Integer value) {
            addCriterion("dataFlag <", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThanOrEqualTo(Integer value) {
            addCriterion("dataFlag <=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagIn(List<Integer> values) {
            addCriterion("dataFlag in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotIn(List<Integer> values) {
            addCriterion("dataFlag not in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagBetween(Integer value1, Integer value2) {
            addCriterion("dataFlag between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("dataFlag not between", value1, value2, "dataFlag");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：foodimage
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：foodimage
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