package com.bestcfm.bean;

import java.util.ArrayList;
import java.util.List;

public class DeskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeskExample() {
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
     * 数据库表：desk
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

        public Criteria andDeskIdIsNull() {
            addCriterion("deskId is null");
            return (Criteria) this;
        }

        public Criteria andDeskIdIsNotNull() {
            addCriterion("deskId is not null");
            return (Criteria) this;
        }

        public Criteria andDeskIdEqualTo(Integer value) {
            addCriterion("deskId =", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdNotEqualTo(Integer value) {
            addCriterion("deskId <>", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdGreaterThan(Integer value) {
            addCriterion("deskId >", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deskId >=", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdLessThan(Integer value) {
            addCriterion("deskId <", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdLessThanOrEqualTo(Integer value) {
            addCriterion("deskId <=", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdIn(List<Integer> values) {
            addCriterion("deskId in", values, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdNotIn(List<Integer> values) {
            addCriterion("deskId not in", values, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdBetween(Integer value1, Integer value2) {
            addCriterion("deskId between", value1, value2, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deskId not between", value1, value2, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountIsNull() {
            addCriterion("deskPeopleCount is null");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountIsNotNull() {
            addCriterion("deskPeopleCount is not null");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountEqualTo(Integer value) {
            addCriterion("deskPeopleCount =", value, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountNotEqualTo(Integer value) {
            addCriterion("deskPeopleCount <>", value, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountGreaterThan(Integer value) {
            addCriterion("deskPeopleCount >", value, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("deskPeopleCount >=", value, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountLessThan(Integer value) {
            addCriterion("deskPeopleCount <", value, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountLessThanOrEqualTo(Integer value) {
            addCriterion("deskPeopleCount <=", value, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountIn(List<Integer> values) {
            addCriterion("deskPeopleCount in", values, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountNotIn(List<Integer> values) {
            addCriterion("deskPeopleCount not in", values, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountBetween(Integer value1, Integer value2) {
            addCriterion("deskPeopleCount between", value1, value2, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskPeopleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("deskPeopleCount not between", value1, value2, "deskPeopleCount");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseIsNull() {
            addCriterion("deskIsInUse is null");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseIsNotNull() {
            addCriterion("deskIsInUse is not null");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseEqualTo(Integer value) {
            addCriterion("deskIsInUse =", value, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseNotEqualTo(Integer value) {
            addCriterion("deskIsInUse <>", value, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseGreaterThan(Integer value) {
            addCriterion("deskIsInUse >", value, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("deskIsInUse >=", value, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseLessThan(Integer value) {
            addCriterion("deskIsInUse <", value, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseLessThanOrEqualTo(Integer value) {
            addCriterion("deskIsInUse <=", value, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseIn(List<Integer> values) {
            addCriterion("deskIsInUse in", values, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseNotIn(List<Integer> values) {
            addCriterion("deskIsInUse not in", values, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseBetween(Integer value1, Integer value2) {
            addCriterion("deskIsInUse between", value1, value2, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsInUseNotBetween(Integer value1, Integer value2) {
            addCriterion("deskIsInUse not between", value1, value2, "deskIsInUse");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteIsNull() {
            addCriterion("deskIsDelete is null");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteIsNotNull() {
            addCriterion("deskIsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteEqualTo(Integer value) {
            addCriterion("deskIsDelete =", value, "deskIsDelete");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteNotEqualTo(Integer value) {
            addCriterion("deskIsDelete <>", value, "deskIsDelete");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteGreaterThan(Integer value) {
            addCriterion("deskIsDelete >", value, "deskIsDelete");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("deskIsDelete >=", value, "deskIsDelete");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteLessThan(Integer value) {
            addCriterion("deskIsDelete <", value, "deskIsDelete");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("deskIsDelete <=", value, "deskIsDelete");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteIn(List<Integer> values) {
            addCriterion("deskIsDelete in", values, "deskIsDelete");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteNotIn(List<Integer> values) {
            addCriterion("deskIsDelete not in", values, "deskIsDelete");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("deskIsDelete between", value1, value2, "deskIsDelete");
            return (Criteria) this;
        }

        public Criteria andDeskIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("deskIsDelete not between", value1, value2, "deskIsDelete");
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
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：desk
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：desk
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