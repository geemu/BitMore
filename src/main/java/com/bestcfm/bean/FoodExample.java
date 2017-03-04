package com.bestcfm.bean;

import java.util.ArrayList;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
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
     * 数据库表：food
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

        public Criteria andFoodPriceIsNull() {
            addCriterion("foodPrice is null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNotNull() {
            addCriterion("foodPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceEqualTo(Float value) {
            addCriterion("foodPrice =", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotEqualTo(Float value) {
            addCriterion("foodPrice <>", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThan(Float value) {
            addCriterion("foodPrice >", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("foodPrice >=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThan(Float value) {
            addCriterion("foodPrice <", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThanOrEqualTo(Float value) {
            addCriterion("foodPrice <=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIn(List<Float> values) {
            addCriterion("foodPrice in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotIn(List<Float> values) {
            addCriterion("foodPrice not in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceBetween(Float value1, Float value2) {
            addCriterion("foodPrice between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotBetween(Float value1, Float value2) {
            addCriterion("foodPrice not between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodStoreIsNull() {
            addCriterion("foodStore is null");
            return (Criteria) this;
        }

        public Criteria andFoodStoreIsNotNull() {
            addCriterion("foodStore is not null");
            return (Criteria) this;
        }

        public Criteria andFoodStoreEqualTo(Integer value) {
            addCriterion("foodStore =", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreNotEqualTo(Integer value) {
            addCriterion("foodStore <>", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreGreaterThan(Integer value) {
            addCriterion("foodStore >", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodStore >=", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreLessThan(Integer value) {
            addCriterion("foodStore <", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreLessThanOrEqualTo(Integer value) {
            addCriterion("foodStore <=", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreIn(List<Integer> values) {
            addCriterion("foodStore in", values, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreNotIn(List<Integer> values) {
            addCriterion("foodStore not in", values, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreBetween(Integer value1, Integer value2) {
            addCriterion("foodStore between", value1, value2, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreNotBetween(Integer value1, Integer value2) {
            addCriterion("foodStore not between", value1, value2, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodSalesIsNull() {
            addCriterion("foodSales is null");
            return (Criteria) this;
        }

        public Criteria andFoodSalesIsNotNull() {
            addCriterion("foodSales is not null");
            return (Criteria) this;
        }

        public Criteria andFoodSalesEqualTo(Integer value) {
            addCriterion("foodSales =", value, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodSalesNotEqualTo(Integer value) {
            addCriterion("foodSales <>", value, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodSalesGreaterThan(Integer value) {
            addCriterion("foodSales >", value, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodSales >=", value, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodSalesLessThan(Integer value) {
            addCriterion("foodSales <", value, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodSalesLessThanOrEqualTo(Integer value) {
            addCriterion("foodSales <=", value, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodSalesIn(List<Integer> values) {
            addCriterion("foodSales in", values, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodSalesNotIn(List<Integer> values) {
            addCriterion("foodSales not in", values, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodSalesBetween(Integer value1, Integer value2) {
            addCriterion("foodSales between", value1, value2, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("foodSales not between", value1, value2, "foodSales");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceIsNull() {
            addCriterion("foodIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceIsNotNull() {
            addCriterion("foodIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceEqualTo(String value) {
            addCriterion("foodIntroduce =", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceNotEqualTo(String value) {
            addCriterion("foodIntroduce <>", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceGreaterThan(String value) {
            addCriterion("foodIntroduce >", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("foodIntroduce >=", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceLessThan(String value) {
            addCriterion("foodIntroduce <", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceLessThanOrEqualTo(String value) {
            addCriterion("foodIntroduce <=", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceLike(String value) {
            addCriterion("foodIntroduce like", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceNotLike(String value) {
            addCriterion("foodIntroduce not like", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceIn(List<String> values) {
            addCriterion("foodIntroduce in", values, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceNotIn(List<String> values) {
            addCriterion("foodIntroduce not in", values, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceBetween(String value1, String value2) {
            addCriterion("foodIntroduce between", value1, value2, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceNotBetween(String value1, String value2) {
            addCriterion("foodIntroduce not between", value1, value2, "foodIntroduce");
            return (Criteria) this;
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

        public Criteria andFoodIsDeleteIsNull() {
            addCriterion("foodIsDelete is null");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteIsNotNull() {
            addCriterion("foodIsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteEqualTo(Integer value) {
            addCriterion("foodIsDelete =", value, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteNotEqualTo(Integer value) {
            addCriterion("foodIsDelete <>", value, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteGreaterThan(Integer value) {
            addCriterion("foodIsDelete >", value, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodIsDelete >=", value, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteLessThan(Integer value) {
            addCriterion("foodIsDelete <", value, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("foodIsDelete <=", value, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteIn(List<Integer> values) {
            addCriterion("foodIsDelete in", values, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteNotIn(List<Integer> values) {
            addCriterion("foodIsDelete not in", values, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("foodIsDelete between", value1, value2, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("foodIsDelete not between", value1, value2, "foodIsDelete");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyIsNull() {
            addCriterion("foodIsSpecialty is null");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyIsNotNull() {
            addCriterion("foodIsSpecialty is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyEqualTo(Integer value) {
            addCriterion("foodIsSpecialty =", value, "foodIsSpecialty");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyNotEqualTo(Integer value) {
            addCriterion("foodIsSpecialty <>", value, "foodIsSpecialty");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyGreaterThan(Integer value) {
            addCriterion("foodIsSpecialty >", value, "foodIsSpecialty");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodIsSpecialty >=", value, "foodIsSpecialty");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyLessThan(Integer value) {
            addCriterion("foodIsSpecialty <", value, "foodIsSpecialty");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyLessThanOrEqualTo(Integer value) {
            addCriterion("foodIsSpecialty <=", value, "foodIsSpecialty");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyIn(List<Integer> values) {
            addCriterion("foodIsSpecialty in", values, "foodIsSpecialty");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyNotIn(List<Integer> values) {
            addCriterion("foodIsSpecialty not in", values, "foodIsSpecialty");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyBetween(Integer value1, Integer value2) {
            addCriterion("foodIsSpecialty between", value1, value2, "foodIsSpecialty");
            return (Criteria) this;
        }

        public Criteria andFoodIsSpecialtyNotBetween(Integer value1, Integer value2) {
            addCriterion("foodIsSpecialty not between", value1, value2, "foodIsSpecialty");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：food
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：food
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