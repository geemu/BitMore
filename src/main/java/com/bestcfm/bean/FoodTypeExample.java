package com.bestcfm.bean;

import java.util.ArrayList;
import java.util.List;

public class FoodTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodTypeExample() {
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
     * 数据库表：foodtype
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

        public Criteria andFoodTypeIdIsNull() {
            addCriterion("foodTypeId is null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdIsNotNull() {
            addCriterion("foodTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdEqualTo(Integer value) {
            addCriterion("foodTypeId =", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdNotEqualTo(Integer value) {
            addCriterion("foodTypeId <>", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdGreaterThan(Integer value) {
            addCriterion("foodTypeId >", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodTypeId >=", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdLessThan(Integer value) {
            addCriterion("foodTypeId <", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("foodTypeId <=", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdIn(List<Integer> values) {
            addCriterion("foodTypeId in", values, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdNotIn(List<Integer> values) {
            addCriterion("foodTypeId not in", values, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("foodTypeId between", value1, value2, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("foodTypeId not between", value1, value2, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameIsNull() {
            addCriterion("foodTypeName is null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameIsNotNull() {
            addCriterion("foodTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameEqualTo(String value) {
            addCriterion("foodTypeName =", value, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameNotEqualTo(String value) {
            addCriterion("foodTypeName <>", value, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameGreaterThan(String value) {
            addCriterion("foodTypeName >", value, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("foodTypeName >=", value, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameLessThan(String value) {
            addCriterion("foodTypeName <", value, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameLessThanOrEqualTo(String value) {
            addCriterion("foodTypeName <=", value, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameLike(String value) {
            addCriterion("foodTypeName like", value, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameNotLike(String value) {
            addCriterion("foodTypeName not like", value, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameIn(List<String> values) {
            addCriterion("foodTypeName in", values, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameNotIn(List<String> values) {
            addCriterion("foodTypeName not in", values, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameBetween(String value1, String value2) {
            addCriterion("foodTypeName between", value1, value2, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNameNotBetween(String value1, String value2) {
            addCriterion("foodTypeName not between", value1, value2, "foodTypeName");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteIsNull() {
            addCriterion("foodTypeIsDelete is null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteIsNotNull() {
            addCriterion("foodTypeIsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteEqualTo(Integer value) {
            addCriterion("foodTypeIsDelete =", value, "foodTypeIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteNotEqualTo(Integer value) {
            addCriterion("foodTypeIsDelete <>", value, "foodTypeIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteGreaterThan(Integer value) {
            addCriterion("foodTypeIsDelete >", value, "foodTypeIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodTypeIsDelete >=", value, "foodTypeIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteLessThan(Integer value) {
            addCriterion("foodTypeIsDelete <", value, "foodTypeIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("foodTypeIsDelete <=", value, "foodTypeIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteIn(List<Integer> values) {
            addCriterion("foodTypeIsDelete in", values, "foodTypeIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteNotIn(List<Integer> values) {
            addCriterion("foodTypeIsDelete not in", values, "foodTypeIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("foodTypeIsDelete between", value1, value2, "foodTypeIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("foodTypeIsDelete not between", value1, value2, "foodTypeIsDelete");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：foodtype
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：foodtype
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