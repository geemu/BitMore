package com.bestcfm.bean;

import java.util.Date;

public class FoodOrder {
    /**
     * 主键
     * 表字段 : foodorder.id
     */
    private Integer id;

    /**
     * 订单编号
     * 表字段 : foodorder.foodOrderNo
     */
    private String foodOrderNo;

    /**
     * 订单时间
     * 表字段 : foodorder.foodOrderTime
     */
    private Date foodOrderTime;

    /**
     * 菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送
     * 表字段 : foodorder.foodOrderState
     */
    private Integer foodOrderState;

    /**
     * 菜品数量
     * 表字段 : foodorder.foodOrderCount
     */
    private Integer foodOrderCount;

    /**
     * 菜品编号
     * 表字段 : foodorder.foodId
     */
    private Integer foodId;

    /**
     * 菜品名称
     * 表字段 : foodorder.foodName
     */
    private String foodName;

    /**
     * 评价状态  0 未评价  1评价
     * 表字段 : foodorder.foodOrderEvaState
     */
    private Integer foodOrderEvaState;

    /**
     * 是否删除 0 删除  1未删除
     * 表字段 : foodorder.foodOrderIsDelete
     */
    private Integer foodOrderIsDelete;

    /**
     * 获取：主键
     * 表字段：foodorder.id
     *
     * @return foodorder.id：主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：主键
     * 表字段：foodorder.id
     *
     * @param id
     *            foodorder.id：主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：订单编号
     * 表字段：foodorder.foodOrderNo
     *
     * @return foodorder.foodOrderNo：订单编号
     */
    public String getFoodOrderNo() {
        return foodOrderNo;
    }

    /**
     * 设置：订单编号
     * 表字段：foodorder.foodOrderNo
     *
     * @param foodOrderNo
     *            foodorder.foodOrderNo：订单编号
     */
    public void setFoodOrderNo(String foodOrderNo) {
        this.foodOrderNo = foodOrderNo;
    }

    /**
     * 获取：订单时间
     * 表字段：foodorder.foodOrderTime
     *
     * @return foodorder.foodOrderTime：订单时间
     */
    public Date getFoodOrderTime() {
        return foodOrderTime;
    }

    /**
     * 设置：订单时间
     * 表字段：foodorder.foodOrderTime
     *
     * @param foodOrderTime
     *            foodorder.foodOrderTime：订单时间
     */
    public void setFoodOrderTime(Date foodOrderTime) {
        this.foodOrderTime = foodOrderTime;
    }

    /**
     * 获取：菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送
     * 表字段：foodorder.foodOrderState
     *
     * @return foodorder.foodOrderState：菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送
     */
    public Integer getFoodOrderState() {
        return foodOrderState;
    }

    /**
     * 设置：菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送
     * 表字段：foodorder.foodOrderState
     *
     * @param foodOrderState
     *            foodorder.foodOrderState：菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送
     */
    public void setFoodOrderState(Integer foodOrderState) {
        this.foodOrderState = foodOrderState;
    }

    /**
     * 获取：菜品数量
     * 表字段：foodorder.foodOrderCount
     *
     * @return foodorder.foodOrderCount：菜品数量
     */
    public Integer getFoodOrderCount() {
        return foodOrderCount;
    }

    /**
     * 设置：菜品数量
     * 表字段：foodorder.foodOrderCount
     *
     * @param foodOrderCount
     *            foodorder.foodOrderCount：菜品数量
     */
    public void setFoodOrderCount(Integer foodOrderCount) {
        this.foodOrderCount = foodOrderCount;
    }

    /**
     * 获取：菜品编号
     * 表字段：foodorder.foodId
     *
     * @return foodorder.foodId：菜品编号
     */
    public Integer getFoodId() {
        return foodId;
    }

    /**
     * 设置：菜品编号
     * 表字段：foodorder.foodId
     *
     * @param foodId
     *            foodorder.foodId：菜品编号
     */
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    /**
     * 获取：菜品名称
     * 表字段：foodorder.foodName
     *
     * @return foodorder.foodName：菜品名称
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * 设置：菜品名称
     * 表字段：foodorder.foodName
     *
     * @param foodName
     *            foodorder.foodName：菜品名称
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * 获取：评价状态  0 未评价  1评价
     * 表字段：foodorder.foodOrderEvaState
     *
     * @return foodorder.foodOrderEvaState：评价状态  0 未评价  1评价
     */
    public Integer getFoodOrderEvaState() {
        return foodOrderEvaState;
    }

    /**
     * 设置：评价状态  0 未评价  1评价
     * 表字段：foodorder.foodOrderEvaState
     *
     * @param foodOrderEvaState
     *            foodorder.foodOrderEvaState：评价状态  0 未评价  1评价
     */
    public void setFoodOrderEvaState(Integer foodOrderEvaState) {
        this.foodOrderEvaState = foodOrderEvaState;
    }

    /**
     * 获取：是否删除 0 删除  1未删除
     * 表字段：foodorder.foodOrderIsDelete
     *
     * @return foodorder.foodOrderIsDelete：是否删除 0 删除  1未删除
     */
    public Integer getFoodOrderIsDelete() {
        return foodOrderIsDelete;
    }

    /**
     * 设置：是否删除 0 删除  1未删除
     * 表字段：foodorder.foodOrderIsDelete
     *
     * @param foodOrderIsDelete
     *            foodorder.foodOrderIsDelete：是否删除 0 删除  1未删除
     */
    public void setFoodOrderIsDelete(Integer foodOrderIsDelete) {
        this.foodOrderIsDelete = foodOrderIsDelete;
    }
}