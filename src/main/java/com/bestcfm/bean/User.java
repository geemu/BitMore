package com.bestcfm.bean;

import java.util.Date;

public class User {
    /**
     * 用户账户,兼手机号
     * 表字段 : user.userAccount
     */
    private String userAccount;

    /**
     * 用户密码
     * 表字段 : user.userPassword
     */
    private String userPassword;

    /**
     * 用户姓名
     * 表字段 : user.userName
     */
    private String userName;

    /**
     * 用户性别 1 男 2 女
     * 表字段 : user.userSex
     */
    private Integer userSex;

    /**
     * 用户权限；0为会员，1为厨师，2为服务员，3为管理员
     * 表字段 : user.userRoot
     */
    private Integer userRoot;

    /**
     * 出生日期
     * 表字段 : user.userBirthday
     */
    private Date userBirthday;

    /**
     * 用户头像
     * 表字段 : user.userHeadImage
     */
    private String userHeadImage;

    /**
     * 用户是否删除  0删除，1未删除
     * 表字段 : user.userIsDelete
     */
    private Integer userIsDelete;

    /**
     * openId
     * 表字段 : user.openId
     */
    private String openId;

    /**
     * unionId
     * 表字段 : user.unionId
     */
    private String unionId;

    /**
     * 获取：用户账户,兼手机号
     * 表字段：user.userAccount
     *
     * @return user.userAccount：用户账户,兼手机号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置：用户账户,兼手机号
     * 表字段：user.userAccount
     *
     * @param userAccount
     *            user.userAccount：用户账户,兼手机号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取：用户密码
     * 表字段：user.userPassword
     *
     * @return user.userPassword：用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置：用户密码
     * 表字段：user.userPassword
     *
     * @param userPassword
     *            user.userPassword：用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取：用户姓名
     * 表字段：user.userName
     *
     * @return user.userName：用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置：用户姓名
     * 表字段：user.userName
     *
     * @param userName
     *            user.userName：用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取：用户性别 1 男 2 女
     * 表字段：user.userSex
     *
     * @return user.userSex：用户性别 1 男 2 女
     */
    public Integer getUserSex() {
        return userSex;
    }

    /**
     * 设置：用户性别 1 男 2 女
     * 表字段：user.userSex
     *
     * @param userSex
     *            user.userSex：用户性别 1 男 2 女
     */
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取：用户权限；0为会员，1为厨师，2为服务员，3为管理员
     * 表字段：user.userRoot
     *
     * @return user.userRoot：用户权限；0为会员，1为厨师，2为服务员，3为管理员
     */
    public Integer getUserRoot() {
        return userRoot;
    }

    /**
     * 设置：用户权限；0为会员，1为厨师，2为服务员，3为管理员
     * 表字段：user.userRoot
     *
     * @param userRoot
     *            user.userRoot：用户权限；0为会员，1为厨师，2为服务员，3为管理员
     */
    public void setUserRoot(Integer userRoot) {
        this.userRoot = userRoot;
    }

    /**
     * 获取：出生日期
     * 表字段：user.userBirthday
     *
     * @return user.userBirthday：出生日期
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     * 设置：出生日期
     * 表字段：user.userBirthday
     *
     * @param userBirthday
     *            user.userBirthday：出生日期
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * 获取：用户头像
     * 表字段：user.userHeadImage
     *
     * @return user.userHeadImage：用户头像
     */
    public String getUserHeadImage() {
        return userHeadImage;
    }

    /**
     * 设置：用户头像
     * 表字段：user.userHeadImage
     *
     * @param userHeadImage
     *            user.userHeadImage：用户头像
     */
    public void setUserHeadImage(String userHeadImage) {
        this.userHeadImage = userHeadImage;
    }

    /**
     * 获取：用户是否删除  0删除，1未删除
     * 表字段：user.userIsDelete
     *
     * @return user.userIsDelete：用户是否删除  0删除，1未删除
     */
    public Integer getUserIsDelete() {
        return userIsDelete;
    }

    /**
     * 设置：用户是否删除  0删除，1未删除
     * 表字段：user.userIsDelete
     *
     * @param userIsDelete
     *            user.userIsDelete：用户是否删除  0删除，1未删除
     */
    public void setUserIsDelete(Integer userIsDelete) {
        this.userIsDelete = userIsDelete;
    }

    /**
     * 获取：openId
     * 表字段：user.openId
     *
     * @return user.openId：openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置：openId
     * 表字段：user.openId
     *
     * @param openId
     *            user.openId：openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取：unionId
     * 表字段：user.unionId
     *
     * @return user.unionId：unionId
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置：unionId
     * 表字段：user.unionId
     *
     * @param unionId
     *            user.unionId：unionId
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }
}