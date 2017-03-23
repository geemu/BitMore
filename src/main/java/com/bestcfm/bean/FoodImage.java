package com.bestcfm.bean;

import java.util.Date;

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
     * 创建时间
     * 表字段 : foodimage.createTime
     */
    private Date createTime;

    /**
     * 0有效 1无效
     * 表字段 : foodimage.dataFlag
     */
    private Integer dataFlag;

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
     * 获取：创建时间
     * 表字段：foodimage.createTime
     *
     * @return foodimage.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     * 表字段：foodimage.createTime
     *
     * @param createTime
     *            foodimage.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：0有效 1无效
     * 表字段：foodimage.dataFlag
     *
     * @return foodimage.dataFlag：0有效 1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：0有效 1无效
     * 表字段：foodimage.dataFlag
     *
     * @param dataFlag
     *            foodimage.dataFlag：0有效 1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}