package com.bestcfm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppointmentExample() {
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
     * 数据库表：appointment
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

        public Criteria andPhoneNumIsNull() {
            addCriterion("phoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phoneNum =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phoneNum <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phoneNum >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNum >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phoneNum <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phoneNum <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phoneNum like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phoneNum not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phoneNum in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phoneNum not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phoneNum between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phoneNum not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPeopleCountIsNull() {
            addCriterion("peopleCount is null");
            return (Criteria) this;
        }

        public Criteria andPeopleCountIsNotNull() {
            addCriterion("peopleCount is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleCountEqualTo(Integer value) {
            addCriterion("peopleCount =", value, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andPeopleCountNotEqualTo(Integer value) {
            addCriterion("peopleCount <>", value, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andPeopleCountGreaterThan(Integer value) {
            addCriterion("peopleCount >", value, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andPeopleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("peopleCount >=", value, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andPeopleCountLessThan(Integer value) {
            addCriterion("peopleCount <", value, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andPeopleCountLessThanOrEqualTo(Integer value) {
            addCriterion("peopleCount <=", value, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andPeopleCountIn(List<Integer> values) {
            addCriterion("peopleCount in", values, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andPeopleCountNotIn(List<Integer> values) {
            addCriterion("peopleCount not in", values, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andPeopleCountBetween(Integer value1, Integer value2) {
            addCriterion("peopleCount between", value1, value2, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andPeopleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("peopleCount not between", value1, value2, "peopleCount");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeIsNull() {
            addCriterion("earliestTime is null");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeIsNotNull() {
            addCriterion("earliestTime is not null");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeEqualTo(Date value) {
            addCriterion("earliestTime =", value, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeNotEqualTo(Date value) {
            addCriterion("earliestTime <>", value, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeGreaterThan(Date value) {
            addCriterion("earliestTime >", value, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("earliestTime >=", value, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeLessThan(Date value) {
            addCriterion("earliestTime <", value, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeLessThanOrEqualTo(Date value) {
            addCriterion("earliestTime <=", value, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeIn(List<Date> values) {
            addCriterion("earliestTime in", values, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeNotIn(List<Date> values) {
            addCriterion("earliestTime not in", values, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeBetween(Date value1, Date value2) {
            addCriterion("earliestTime between", value1, value2, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andEarliestTimeNotBetween(Date value1, Date value2) {
            addCriterion("earliestTime not between", value1, value2, "earliestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeIsNull() {
            addCriterion("latestTime is null");
            return (Criteria) this;
        }

        public Criteria andLatestTimeIsNotNull() {
            addCriterion("latestTime is not null");
            return (Criteria) this;
        }

        public Criteria andLatestTimeEqualTo(Date value) {
            addCriterion("latestTime =", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeNotEqualTo(Date value) {
            addCriterion("latestTime <>", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeGreaterThan(Date value) {
            addCriterion("latestTime >", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("latestTime >=", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeLessThan(Date value) {
            addCriterion("latestTime <", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeLessThanOrEqualTo(Date value) {
            addCriterion("latestTime <=", value, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeIn(List<Date> values) {
            addCriterion("latestTime in", values, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeNotIn(List<Date> values) {
            addCriterion("latestTime not in", values, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeBetween(Date value1, Date value2) {
            addCriterion("latestTime between", value1, value2, "latestTime");
            return (Criteria) this;
        }

        public Criteria andLatestTimeNotBetween(Date value1, Date value2) {
            addCriterion("latestTime not between", value1, value2, "latestTime");
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
     * 数据库表：appointment
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：appointment
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