package com.bestcfm.bean;

import java.util.Date;

public class FoodOrder {
    /**
     * 主键
     * 表字段 : foodorder.id
     */
    private Integer id;

    /**
     * 用户标识
     * 表字段 : foodorder.userMark
     */
    private Integer userMark;

    /**
     * 桌号
     * 表字段 : foodorder.deskNo
     */
    private Integer deskNo;

    /**
     * 订单编号
     * 表字段 : foodorder.orderNo
     */
    private String orderNo;

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
     * 数量
     * 表字段 : foodorder.orderCount
     */
    private Integer orderCount;

    /**
     * 菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送 6已评价
     * 表字段 : foodorder.orderState
     */
    private Integer orderState;

    /**
     * 备注
     * 表字段 : foodorder.remark
     */
    private String remark;

    /**
     * 创建时间
     * 表字段 : foodorder.createTime
     */
    private Date createTime;

    /**
     * 0有效 1无效
     * 表字段 : foodorder.dataFlag
     */
    private Integer dataFlag;

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
     * 获取：用户标识
     * 表字段：foodorder.userMark
     *
     * @return foodorder.userMark：用户标识
     */
    public Integer getUserMark() {
        return userMark;
    }

    /**
     * 设置：用户标识
     * 表字段：foodorder.userMark
     *
     * @param userMark
     *            foodorder.userMark：用户标识
     */
    public void setUserMark(Integer userMark) {
        this.userMark = userMark;
    }

    /**
     * 获取：桌号
     * 表字段：foodorder.deskNo
     *
     * @return foodorder.deskNo：桌号
     */
    public Integer getDeskNo() {
        return deskNo;
    }

    /**
     * 设置：桌号
     * 表字段：foodorder.deskNo
     *
     * @param deskNo
     *            foodorder.deskNo：桌号
     */
    public void setDeskNo(Integer deskNo) {
        this.deskNo = deskNo;
    }

    /**
     * 获取：订单编号
     * 表字段：foodorder.orderNo
     *
     * @return foodorder.orderNo：订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置：订单编号
     * 表字段：foodorder.orderNo
     *
     * @param orderNo
     *            foodorder.orderNo：订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
     * 获取：数量
     * 表字段：foodorder.orderCount
     *
     * @return foodorder.orderCount：数量
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * 设置：数量
     * 表字段：foodorder.orderCount
     *
     * @param orderCount
     *            foodorder.orderCount：数量
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * 获取：菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送 6已评价
     * 表字段：foodorder.orderState
     *
     * @return foodorder.orderState：菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送 6已评价
     */
    public Integer getOrderState() {
        return orderState;
    }

    /**
     * 设置：菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送 6已评价
     * 表字段：foodorder.orderState
     *
     * @param orderState
     *            foodorder.orderState：菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送 6已评价
     */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取：备注
     * 表字段：foodorder.remark
     *
     * @return foodorder.remark：备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：备注
     * 表字段：foodorder.remark
     *
     * @param remark
     *            foodorder.remark：备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：创建时间
     * 表字段：foodorder.createTime
     *
     * @return foodorder.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     * 表字段：foodorder.createTime
     *
     * @param createTime
     *            foodorder.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：0有效 1无效
     * 表字段：foodorder.dataFlag
     *
     * @return foodorder.dataFlag：0有效 1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：0有效 1无效
     * 表字段：foodorder.dataFlag
     *
     * @param dataFlag
     *            foodorder.dataFlag：0有效 1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}