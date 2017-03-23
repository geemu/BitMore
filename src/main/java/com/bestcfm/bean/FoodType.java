package com.bestcfm.bean;

import java.util.Date;

public class FoodType {
    /**
     * 类别编号
     * 表字段 : foodtype.id
     */
    private Integer id;

    /**
     * 类别名称
     * 表字段 : foodtype.typeName
     */
    private String typeName;

    /**
     * 创建时间
     * 表字段 : foodtype.createTime
     */
    private Date createTime;

    /**
     * 0有效  1无效
     * 表字段 : foodtype.dataFlag
     */
    private Integer dataFlag;

    /**
     * 获取：类别编号
     * 表字段：foodtype.id
     *
     * @return foodtype.id：类别编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：类别编号
     * 表字段：foodtype.id
     *
     * @param id
     *            foodtype.id：类别编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：类别名称
     * 表字段：foodtype.typeName
     *
     * @return foodtype.typeName：类别名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置：类别名称
     * 表字段：foodtype.typeName
     *
     * @param typeName
     *            foodtype.typeName：类别名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取：创建时间
     * 表字段：foodtype.createTime
     *
     * @return foodtype.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     * 表字段：foodtype.createTime
     *
     * @param createTime
     *            foodtype.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：0有效  1无效
     * 表字段：foodtype.dataFlag
     *
     * @return foodtype.dataFlag：0有效  1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：0有效  1无效
     * 表字段：foodtype.dataFlag
     *
     * @param dataFlag
     *            foodtype.dataFlag：0有效  1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}