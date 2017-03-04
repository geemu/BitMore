package com.bestcfm.bean;

public class FoodType {
    /**
     * 菜品类别编号
     * 表字段 : foodtype.foodTypeId
     */
    private Integer foodTypeId;

    /**
     * 菜品类别名称
     * 表字段 : foodtype.foodTypeName
     */
    private String foodTypeName;

    /**
     * 0删除  1未删除
     * 表字段 : foodtype.foodTypeIsDelete
     */
    private Integer foodTypeIsDelete;

    /**
     * 获取：菜品类别编号
     * 表字段：foodtype.foodTypeId
     *
     * @return foodtype.foodTypeId：菜品类别编号
     */
    public Integer getFoodTypeId() {
        return foodTypeId;
    }

    /**
     * 设置：菜品类别编号
     * 表字段：foodtype.foodTypeId
     *
     * @param foodTypeId
     *            foodtype.foodTypeId：菜品类别编号
     */
    public void setFoodTypeId(Integer foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    /**
     * 获取：菜品类别名称
     * 表字段：foodtype.foodTypeName
     *
     * @return foodtype.foodTypeName：菜品类别名称
     */
    public String getFoodTypeName() {
        return foodTypeName;
    }

    /**
     * 设置：菜品类别名称
     * 表字段：foodtype.foodTypeName
     *
     * @param foodTypeName
     *            foodtype.foodTypeName：菜品类别名称
     */
    public void setFoodTypeName(String foodTypeName) {
        this.foodTypeName = foodTypeName;
    }

    /**
     * 获取：0删除  1未删除
     * 表字段：foodtype.foodTypeIsDelete
     *
     * @return foodtype.foodTypeIsDelete：0删除  1未删除
     */
    public Integer getFoodTypeIsDelete() {
        return foodTypeIsDelete;
    }

    /**
     * 设置：0删除  1未删除
     * 表字段：foodtype.foodTypeIsDelete
     *
     * @param foodTypeIsDelete
     *            foodtype.foodTypeIsDelete：0删除  1未删除
     */
    public void setFoodTypeIsDelete(Integer foodTypeIsDelete) {
        this.foodTypeIsDelete = foodTypeIsDelete;
    }
}