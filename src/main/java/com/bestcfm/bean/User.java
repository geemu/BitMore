package com.bestcfm.bean;

import java.util.Date;

public class User {
    /**
     * 用户编号
     * 表字段 : user.id
     */
    private Integer id;

    /**
     * 手机号
     * 表字段 : user.phone
     */
    private String phone;

    /**
     * 密码
     * 表字段 : user.userPassword
     */
    private String userPassword;

    /**
     * 头像
     * 表字段 : user.headImage
     */
    private String headImage;

    /**
     * 创建时间
     * 表字段 : user.createTime
     */
    private Date createTime;

    /**
     * 是否有效 0有效1无效
     * 表字段 : user.dataFlag
     */
    private Integer dataFlag;

    /**
     * 获取：用户编号
     * 表字段：user.id
     *
     * @return user.id：用户编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：用户编号
     * 表字段：user.id
     *
     * @param id
     *            user.id：用户编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：手机号
     * 表字段：user.phone
     *
     * @return user.phone：手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置：手机号
     * 表字段：user.phone
     *
     * @param phone
     *            user.phone：手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：密码
     * 表字段：user.userPassword
     *
     * @return user.userPassword：密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置：密码
     * 表字段：user.userPassword
     *
     * @param userPassword
     *            user.userPassword：密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取：头像
     * 表字段：user.headImage
     *
     * @return user.headImage：头像
     */
    public String getHeadImage() {
        return headImage;
    }

    /**
     * 设置：头像
     * 表字段：user.headImage
     *
     * @param headImage
     *            user.headImage：头像
     */
    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    /**
     * 获取：创建时间
     * 表字段：user.createTime
     *
     * @return user.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     * 表字段：user.createTime
     *
     * @param createTime
     *            user.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：是否有效 0有效1无效
     * 表字段：user.dataFlag
     *
     * @return user.dataFlag：是否有效 0有效1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：是否有效 0有效1无效
     * 表字段：user.dataFlag
     *
     * @param dataFlag
     *            user.dataFlag：是否有效 0有效1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}