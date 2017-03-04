package com.bestcfm.bean;

import java.util.Date;

public class FoodEvaluation {
    /**
     * 主键
     * 表字段 : foodevaluation.id
     */
    private Integer id;

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
     * 评价时间
     * 表字段 : foodevaluation.evaTime
     */
    private Date evaTime;

    /**
     * 用户账号
     * 表字段 : foodevaluation.userAccount
     */
    private Integer userAccount;

    /**
     * 是否删除 0 删除 1 未删除
     * 表字段 : foodevaluation.evaIsDelete
     */
    private Integer evaIsDelete;

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
     * 获取：评价时间
     * 表字段：foodevaluation.evaTime
     *
     * @return foodevaluation.evaTime：评价时间
     */
    public Date getEvaTime() {
        return evaTime;
    }

    /**
     * 设置：评价时间
     * 表字段：foodevaluation.evaTime
     *
     * @param evaTime
     *            foodevaluation.evaTime：评价时间
     */
    public void setEvaTime(Date evaTime) {
        this.evaTime = evaTime;
    }

    /**
     * 获取：用户账号
     * 表字段：foodevaluation.userAccount
     *
     * @return foodevaluation.userAccount：用户账号
     */
    public Integer getUserAccount() {
        return userAccount;
    }

    /**
     * 设置：用户账号
     * 表字段：foodevaluation.userAccount
     *
     * @param userAccount
     *            foodevaluation.userAccount：用户账号
     */
    public void setUserAccount(Integer userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取：是否删除 0 删除 1 未删除
     * 表字段：foodevaluation.evaIsDelete
     *
     * @return foodevaluation.evaIsDelete：是否删除 0 删除 1 未删除
     */
    public Integer getEvaIsDelete() {
        return evaIsDelete;
    }

    /**
     * 设置：是否删除 0 删除 1 未删除
     * 表字段：foodevaluation.evaIsDelete
     *
     * @param evaIsDelete
     *            foodevaluation.evaIsDelete：是否删除 0 删除 1 未删除
     */
    public void setEvaIsDelete(Integer evaIsDelete) {
        this.evaIsDelete = evaIsDelete;
    }
}