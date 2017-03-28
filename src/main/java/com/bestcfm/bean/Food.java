package com.bestcfm.bean;

import java.util.Date;

public class Food {
    /**
     * 菜品编号
     * 表字段 : food.id
     */
    private Integer id;

    /**
     * 菜品名称
     * 表字段 : food.foodName
     */
    private String foodName;

    /**
     * 菜品价格
     * 表字段 : food.price
     */
    private Float price;

    /**
     * 库存
     * 表字段 : food.store
     */
    private Integer store;

    /**
     * 销量
     * 表字段 : food.sales
     */
    private Integer sales;

    /**
     * 菜品介绍
     * 表字段 : food.introduce
     */
    private String introduce;

    /**
     * 类别编号
     * 表字段 : food.typeId
     */
    private Integer typeId;

    /**
     * 招牌菜 0不是 1是
     * 表字段 : food.signiture
     */
    private Integer signiture;

    /**
     * 图片
     * 表字段 : food.foodImage
     */
    private String foodImage;

    /**
     * 创建时间
     * 表字段 : food.createTime
     */
    private Date createTime;

    /**
     * 是0有效  1无效
     * 表字段 : food.dataFlag
     */
    private Integer dataFlag;

    /**
     * 获取：菜品编号
     * 表字段：food.id
     *
     * @return food.id：菜品编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：菜品编号
     * 表字段：food.id
     *
     * @param id
     *            food.id：菜品编号
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 表字段：food.price
     *
     * @return food.price：菜品价格
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置：菜品价格
     * 表字段：food.price
     *
     * @param price
     *            food.price：菜品价格
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取：库存
     * 表字段：food.store
     *
     * @return food.store：库存
     */
    public Integer getStore() {
        return store;
    }

    /**
     * 设置：库存
     * 表字段：food.store
     *
     * @param store
     *            food.store：库存
     */
    public void setStore(Integer store) {
        this.store = store;
    }

    /**
     * 获取：销量
     * 表字段：food.sales
     *
     * @return food.sales：销量
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * 设置：销量
     * 表字段：food.sales
     *
     * @param sales
     *            food.sales：销量
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * 获取：菜品介绍
     * 表字段：food.introduce
     *
     * @return food.introduce：菜品介绍
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 设置：菜品介绍
     * 表字段：food.introduce
     *
     * @param introduce
     *            food.introduce：菜品介绍
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /**
     * 获取：类别编号
     * 表字段：food.typeId
     *
     * @return food.typeId：类别编号
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置：类别编号
     * 表字段：food.typeId
     *
     * @param typeId
     *            food.typeId：类别编号
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取：招牌菜 0不是 1是
     * 表字段：food.signiture
     *
     * @return food.signiture：招牌菜 0不是 1是
     */
    public Integer getSigniture() {
        return signiture;
    }

    /**
     * 设置：招牌菜 0不是 1是
     * 表字段：food.signiture
     *
     * @param signiture
     *            food.signiture：招牌菜 0不是 1是
     */
    public void setSigniture(Integer signiture) {
        this.signiture = signiture;
    }

    /**
     * 获取：图片
     * 表字段：food.foodImage
     *
     * @return food.foodImage：图片
     */
    public String getFoodImage() {
        return foodImage;
    }

    /**
     * 设置：图片
     * 表字段：food.foodImage
     *
     * @param foodImage
     *            food.foodImage：图片
     */
    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    /**
     * 获取：创建时间
     * 表字段：food.createTime
     *
     * @return food.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     * 表字段：food.createTime
     *
     * @param createTime
     *            food.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：是0有效  1无效
     * 表字段：food.dataFlag
     *
     * @return food.dataFlag：是0有效  1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：是0有效  1无效
     * 表字段：food.dataFlag
     *
     * @param dataFlag
     *            food.dataFlag：是0有效  1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}