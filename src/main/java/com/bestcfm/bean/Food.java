package com.bestcfm.bean;

public class Food {
    /**
     * 菜品编号
     * 表字段 : food.foodId
     */
    private Integer foodId;

    /**
     * 菜品名称
     * 表字段 : food.foodName
     */
    private String foodName;

    /**
     * 菜品价格
     * 表字段 : food.foodPrice
     */
    private Float foodPrice;

    /**
     * 菜品库存
     * 表字段 : food.foodStore
     */
    private Integer foodStore;

    /**
     * 菜品销量
     * 表字段 : food.foodSales
     */
    private Integer foodSales;

    /**
     * 菜品介绍
     * 表字段 : food.foodIntroduce
     */
    private String foodIntroduce;

    /**
     * 菜品类别编号
     * 表字段 : food.foodTypeId
     */
    private Integer foodTypeId;

    /**
     * 菜品类别名称
     * 表字段 : food.foodTypeName
     */
    private String foodTypeName;

    /**
     * 菜品是否删除 0 删除  1 未删除
     * 表字段 : food.foodIsDelete
     */
    private Integer foodIsDelete;

    /**
     * 是否为招牌菜 0不是1是
     * 表字段 : food.foodIsSpecialty
     */
    private Integer foodIsSpecialty;

    /**
     * 获取：菜品编号
     * 表字段：food.foodId
     *
     * @return food.foodId：菜品编号
     */
    public Integer getFoodId() {
        return foodId;
    }

    /**
     * 设置：菜品编号
     * 表字段：food.foodId
     *
     * @param foodId
     *            food.foodId：菜品编号
     */
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    /**
     * 获取：菜品名称
     * 表字段：food.foodName
     *
     * @return food.foodName：菜品名称
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * 设置：菜品名称
     * 表字段：food.foodName
     *
     * @param foodName
     *            food.foodName：菜品名称
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * 获取：菜品价格
     * 表字段：food.foodPrice
     *
     * @return food.foodPrice：菜品价格
     */
    public Float getFoodPrice() {
        return foodPrice;
    }

    /**
     * 设置：菜品价格
     * 表字段：food.foodPrice
     *
     * @param foodPrice
     *            food.foodPrice：菜品价格
     */
    public void setFoodPrice(Float foodPrice) {
        this.foodPrice = foodPrice;
    }

    /**
     * 获取：菜品库存
     * 表字段：food.foodStore
     *
     * @return food.foodStore：菜品库存
     */
    public Integer getFoodStore() {
        return foodStore;
    }

    /**
     * 设置：菜品库存
     * 表字段：food.foodStore
     *
     * @param foodStore
     *            food.foodStore：菜品库存
     */
    public void setFoodStore(Integer foodStore) {
        this.foodStore = foodStore;
    }

    /**
     * 获取：菜品销量
     * 表字段：food.foodSales
     *
     * @return food.foodSales：菜品销量
     */
    public Integer getFoodSales() {
        return foodSales;
    }

    /**
     * 设置：菜品销量
     * 表字段：food.foodSales
     *
     * @param foodSales
     *            food.foodSales：菜品销量
     */
    public void setFoodSales(Integer foodSales) {
        this.foodSales = foodSales;
    }

    /**
     * 获取：菜品介绍
     * 表字段：food.foodIntroduce
     *
     * @return food.foodIntroduce：菜品介绍
     */
    public String getFoodIntroduce() {
        return foodIntroduce;
    }

    /**
     * 设置：菜品介绍
     * 表字段：food.foodIntroduce
     *
     * @param foodIntroduce
     *            food.foodIntroduce：菜品介绍
     */
    public void setFoodIntroduce(String foodIntroduce) {
        this.foodIntroduce = foodIntroduce;
    }

    /**
     * 获取：菜品类别编号
     * 表字段：food.foodTypeId
     *
     * @return food.foodTypeId：菜品类别编号
     */
    public Integer getFoodTypeId() {
        return foodTypeId;
    }

    /**
     * 设置：菜品类别编号
     * 表字段：food.foodTypeId
     *
     * @param foodTypeId
     *            food.foodTypeId：菜品类别编号
     */
    public void setFoodTypeId(Integer foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    /**
     * 获取：菜品类别名称
     * 表字段：food.foodTypeName
     *
     * @return food.foodTypeName：菜品类别名称
     */
    public String getFoodTypeName() {
        return foodTypeName;
    }

    /**
     * 设置：菜品类别名称
     * 表字段：food.foodTypeName
     *
     * @param foodTypeName
     *            food.foodTypeName：菜品类别名称
     */
    public void setFoodTypeName(String foodTypeName) {
        this.foodTypeName = foodTypeName;
    }

    /**
     * 获取：菜品是否删除 0 删除  1 未删除
     * 表字段：food.foodIsDelete
     *
     * @return food.foodIsDelete：菜品是否删除 0 删除  1 未删除
     */
    public Integer getFoodIsDelete() {
        return foodIsDelete;
    }

    /**
     * 设置：菜品是否删除 0 删除  1 未删除
     * 表字段：food.foodIsDelete
     *
     * @param foodIsDelete
     *            food.foodIsDelete：菜品是否删除 0 删除  1 未删除
     */
    public void setFoodIsDelete(Integer foodIsDelete) {
        this.foodIsDelete = foodIsDelete;
    }

    /**
     * 获取：是否为招牌菜 0不是1是
     * 表字段：food.foodIsSpecialty
     *
     * @return food.foodIsSpecialty：是否为招牌菜 0不是1是
     */
    public Integer getFoodIsSpecialty() {
        return foodIsSpecialty;
    }

    /**
     * 设置：是否为招牌菜 0不是1是
     * 表字段：food.foodIsSpecialty
     *
     * @param foodIsSpecialty
     *            food.foodIsSpecialty：是否为招牌菜 0不是1是
     */
    public void setFoodIsSpecialty(Integer foodIsSpecialty) {
        this.foodIsSpecialty = foodIsSpecialty;
    }
}