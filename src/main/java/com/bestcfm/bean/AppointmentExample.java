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

        public Criteria andAppointIdIsNull() {
            addCriterion("appointId is null");
            return (Criteria) this;
        }

        public Criteria andAppointIdIsNotNull() {
            addCriterion("appointId is not null");
            return (Criteria) this;
        }

        public Criteria andAppointIdEqualTo(Integer value) {
            addCriterion("appointId =", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdNotEqualTo(Integer value) {
            addCriterion("appointId <>", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdGreaterThan(Integer value) {
            addCriterion("appointId >", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appointId >=", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdLessThan(Integer value) {
            addCriterion("appointId <", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdLessThanOrEqualTo(Integer value) {
            addCriterion("appointId <=", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdIn(List<Integer> values) {
            addCriterion("appointId in", values, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdNotIn(List<Integer> values) {
            addCriterion("appointId not in", values, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdBetween(Integer value1, Integer value2) {
            addCriterion("appointId between", value1, value2, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appointId not between", value1, value2, "appointId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("userAccount is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("userAccount is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("userAccount =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("userAccount <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("userAccount >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("userAccount >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("userAccount <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("userAccount <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("userAccount like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("userAccount not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("userAccount in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("userAccount not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("userAccount between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("userAccount not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameIsNull() {
            addCriterion("appointUserName is null");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameIsNotNull() {
            addCriterion("appointUserName is not null");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameEqualTo(String value) {
            addCriterion("appointUserName =", value, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameNotEqualTo(String value) {
            addCriterion("appointUserName <>", value, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameGreaterThan(String value) {
            addCriterion("appointUserName >", value, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("appointUserName >=", value, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameLessThan(String value) {
            addCriterion("appointUserName <", value, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameLessThanOrEqualTo(String value) {
            addCriterion("appointUserName <=", value, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameLike(String value) {
            addCriterion("appointUserName like", value, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameNotLike(String value) {
            addCriterion("appointUserName not like", value, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameIn(List<String> values) {
            addCriterion("appointUserName in", values, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameNotIn(List<String> values) {
            addCriterion("appointUserName not in", values, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameBetween(String value1, String value2) {
            addCriterion("appointUserName between", value1, value2, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointUserNameNotBetween(String value1, String value2) {
            addCriterion("appointUserName not between", value1, value2, "appointUserName");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIsNull() {
            addCriterion("appointTime is null");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIsNotNull() {
            addCriterion("appointTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppointTimeEqualTo(Date value) {
            addCriterion("appointTime =", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotEqualTo(Date value) {
            addCriterion("appointTime <>", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeGreaterThan(Date value) {
            addCriterion("appointTime >", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appointTime >=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeLessThan(Date value) {
            addCriterion("appointTime <", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeLessThanOrEqualTo(Date value) {
            addCriterion("appointTime <=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIn(List<Date> values) {
            addCriterion("appointTime in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotIn(List<Date> values) {
            addCriterion("appointTime not in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeBetween(Date value1, Date value2) {
            addCriterion("appointTime between", value1, value2, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotBetween(Date value1, Date value2) {
            addCriterion("appointTime not between", value1, value2, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountIsNull() {
            addCriterion("appointPeopleCount is null");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountIsNotNull() {
            addCriterion("appointPeopleCount is not null");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountEqualTo(Integer value) {
            addCriterion("appointPeopleCount =", value, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountNotEqualTo(Integer value) {
            addCriterion("appointPeopleCount <>", value, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountGreaterThan(Integer value) {
            addCriterion("appointPeopleCount >", value, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("appointPeopleCount >=", value, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountLessThan(Integer value) {
            addCriterion("appointPeopleCount <", value, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountLessThanOrEqualTo(Integer value) {
            addCriterion("appointPeopleCount <=", value, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountIn(List<Integer> values) {
            addCriterion("appointPeopleCount in", values, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountNotIn(List<Integer> values) {
            addCriterion("appointPeopleCount not in", values, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountBetween(Integer value1, Integer value2) {
            addCriterion("appointPeopleCount between", value1, value2, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointPeopleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("appointPeopleCount not between", value1, value2, "appointPeopleCount");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteIsNull() {
            addCriterion("appointIsDelete is null");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteIsNotNull() {
            addCriterion("appointIsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteEqualTo(Integer value) {
            addCriterion("appointIsDelete =", value, "appointIsDelete");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteNotEqualTo(Integer value) {
            addCriterion("appointIsDelete <>", value, "appointIsDelete");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteGreaterThan(Integer value) {
            addCriterion("appointIsDelete >", value, "appointIsDelete");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("appointIsDelete >=", value, "appointIsDelete");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteLessThan(Integer value) {
            addCriterion("appointIsDelete <", value, "appointIsDelete");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("appointIsDelete <=", value, "appointIsDelete");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteIn(List<Integer> values) {
            addCriterion("appointIsDelete in", values, "appointIsDelete");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteNotIn(List<Integer> values) {
            addCriterion("appointIsDelete not in", values, "appointIsDelete");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("appointIsDelete between", value1, value2, "appointIsDelete");
            return (Criteria) this;
        }

        public Criteria andAppointIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("appointIsDelete not between", value1, value2, "appointIsDelete");
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