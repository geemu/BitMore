package com.bestcfm.bean;

import java.util.Date;

public class FoodEvaluation {
    /**
     * 主键
     * 表字段 : foodevaluation.id
     */
    private Integer id;

    /**
     * 用户标识
     * 表字段 : foodevaluation.userMark
     */
    private Integer userMark;

    /**
     * 菜品编号
     * 表字段 : foodevaluation.foodId
     */
    private Integer foodId;

    /**
     * 评价内容
     * 表字段 : foodevaluation.content
     */
    private String content;

    /**
     * 评价星级 1~5
     * 表字段 : foodevaluation.evaScore
     */
    private Integer evaScore;

    /**
     * 创建时间
     * 表字段 : foodevaluation.createTime
     */
    private Date createTime;

    /**
     * 0有效 1无效
     * 表字段 : foodevaluation.dataFlag
     */
    private Integer dataFlag;

    /**
     * 获取：主键
     * 表字段：foodevaluation.id
     *
     * @return foodevaluation.id：主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：主键
     * 表字段：foodevaluation.id
     *
     * @param id
     *            foodevaluation.id：主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：用户标识
     * 表字段：foodevaluation.userMark
     *
     * @return foodevaluation.userMark：用户标识
     */
    public Integer getUserMark() {
        return userMark;
    }

    /**
     * 设置：用户标识
     * 表字段：foodevaluation.userMark
     *
     * @param userMark
     *            foodevaluation.userMark：用户标识
     */
    public void setUserMark(Integer userMark) {
        this.userMark = userMark;
    }

    /**
     * 获取：菜品编号
     * 表字段：foodevaluation.foodId
     *
     * @return foodevaluation.foodId：菜品编号
     */
    public Integer getFoodId() {
        return foodId;
    }

    /**
     * 设置：菜品编号
     * 表字段：foodevaluation.foodId
     *
     * @param foodId
     *            foodevaluation.foodId：菜品编号
     */
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    /**
     * 获取：评价内容
     * 表字段：foodevaluation.content
     *
     * @return foodevaluation.content：评价内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置：评价内容
     * 表字段：foodevaluation.content
     *
     * @param content
     *            foodevaluation.content：评价内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取：评价星级 1~5
     * 表字段：foodevaluation.evaScore
     *
     * @return foodevaluation.evaScore：评价星级 1~5
     */
    public Integer getEvaScore() {
        return evaScore;
    }

    /**
     * 设置：评价星级 1~5
     * 表字段：foodevaluation.evaScore
     *
     * @param evaScore
     *            foodevaluation.evaScore：评价星级 1~5
     */
    public void setEvaScore(Integer evaScore) {
        this.evaScore = evaScore;
    }

    /**
     * 获取：创建时间
     * 表字段：foodevaluation.createTime
     *
     * @return foodevaluation.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     * 表字段：foodevaluation.createTime
     *
     * @param createTime
     *            foodevaluation.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：0有效 1无效
     * 表字段：foodevaluation.dataFlag
     *
     * @return foodevaluation.dataFlag：0有效 1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：0有效 1无效
     * 表字段：foodevaluation.dataFlag
     *
     * @param dataFlag
     *            foodevaluation.dataFlag：0有效 1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}