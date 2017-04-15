package com.bestcfm.bean;

public class FoodOrderRecords {
    /**
     * 主键 主表
     * 表字段 : foodorderrecords.id
     */
    private Integer id;

    /**
     * 用户编号
     * 表字段 : foodorderrecords.userId
     */
    private Integer userId;

    /**
     * 总的订单号 唯一键
     * 表字段 : foodorderrecords.recordsNo
     */
    private String recordsNo;

    /**
     * 桌号
     * 表字段 : foodorderrecords.deskNo
     */
    private Integer deskNo;

    /**
     * 创建时间
     * 表字段 : foodorderrecords.createTime
     */
    private String createTime;

    /**
     * 是否有效 0有效 1无效
     * 表字段 : foodorderrecords.dataFlag
     */
    private Integer dataFlag;

    /**
     * 获取：主键 主表
     * 表字段：foodorderrecords.id
     *
     * @return foodorderrecords.id：主键 主表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：主键 主表
     * 表字段：foodorderrecords.id
     *
     * @param id
     *            foodorderrecords.id：主键 主表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：用户编号
     * 表字段：foodorderrecords.userId
     *
     * @return foodorderrecords.userId：用户编号
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置：用户编号
     * 表字段：foodorderrecords.userId
     *
     * @param userId
     *            foodorderrecords.userId：用户编号
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取：总的订单号 唯一键
     * 表字段：foodorderrecords.recordsNo
     *
     * @return foodorderrecords.recordsNo：总的订单号 唯一键
     */
    public String getRecordsNo() {
        return recordsNo;
    }

    /**
     * 设置：总的订单号 唯一键
     * 表字段：foodorderrecords.recordsNo
     *
     * @param recordsNo
     *            foodorderrecords.recordsNo：总的订单号 唯一键
     */
    public void setRecordsNo(String recordsNo) {
        this.recordsNo = recordsNo;
    }

    /**
     * 获取：桌号
     * 表字段：foodorderrecords.deskNo
     *
     * @return foodorderrecords.deskNo：桌号
     */
    public Integer getDeskNo() {
        return deskNo;
    }

    /**
     * 设置：桌号
     * 表字段：foodorderrecords.deskNo
     *
     * @param deskNo
     *            foodorderrecords.deskNo：桌号
     */
    public void setDeskNo(Integer deskNo) {
        this.deskNo = deskNo;
    }

    /**
     * 获取：创建时间
     * 表字段：foodorderrecords.createTime
     *
     * @return foodorderrecords.createTime：创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     * 表字段：foodorderrecords.createTime
     *
     * @param createTime
     *            foodorderrecords.createTime：创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：是否有效 0有效 1无效
     * 表字段：foodorderrecords.dataFlag
     *
     * @return foodorderrecords.dataFlag：是否有效 0有效 1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：是否有效 0有效 1无效
     * 表字段：foodorderrecords.dataFlag
     *
     * @param dataFlag
     *            foodorderrecords.dataFlag：是否有效 0有效 1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}