package com.bestcfm.bean;

public class FoodImage {
    /**
     * 主键
     * 表字段 : foodimage.id
     */
    private Integer id;

    /**
     * 菜品编号
     * 表字段 : foodimage.foodId
     */
    private Integer foodId;

    /**
     * 菜品图片
     * 表字段 : foodimage.foodImage
     */
    private String foodImage;

    /**
     * 是否删除 0 删除 1 未删除
     * 表字段 : foodimage.foodImageIsDelete
     */
    private Integer foodImageIsDelete;

    /**
     * 获取：主键
     * 表字段：foodimage.id
     *
     * @return foodimage.id：主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：主键
     * 表字段：foodimage.id
     *
     * @param id
     *            foodimage.id：主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：菜品编号
     * 表字段：foodimage.foodId
     *
     * @return foodimage.foodId：菜品编号
     */
    public Integer getFoodId() {
        return foodId;
    }

    /**
     * 设置：菜品编号
     * 表字段：foodimage.foodId
     *
     * @param foodId
     *            foodimage.foodId：菜品编号
     */
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    /**
     * 获取：菜品图片
     * 表字段：foodimage.foodImage
     *
     * @return foodimage.foodImage：菜品图片
     */
    public String getFoodImage() {
        return foodImage;
    }

    /**
     * 设置：菜品图片
     * 表字段：foodimage.foodImage
     *
     * @param foodImage
     *            foodimage.foodImage：菜品图片
     */
    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    /**
     * 获取：是否删除 0 删除 1 未删除
     * 表字段：foodimage.foodImageIsDelete
     *
     * @return foodimage.foodImageIsDelete：是否删除 0 删除 1 未删除
     */
    public Integer getFoodImageIsDelete() {
        return foodImageIsDelete;
    }

    /**
     * 设置：是否删除 0 删除 1 未删除
     * 表字段：foodimage.foodImageIsDelete
     *
     * @param foodImageIsDelete
     *            foodimage.foodImageIsDelete：是否删除 0 删除 1 未删除
     */
    public void setFoodImageIsDelete(Integer foodImageIsDelete) {
        this.foodImageIsDelete = foodImageIsDelete;
    }
}