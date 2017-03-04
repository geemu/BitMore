package com.bestcfm.bean;

public class Desk {
    /**
     * 桌位编号
     * 表字段 : desk.deskId
     */
    private Integer deskId;

    /**
     * 桌位人数
     * 表字段 : desk.deskPeopleCount
     */
    private Integer deskPeopleCount;

    /**
     * 是否正在被使用 0未使用  1 使用
     * 表字段 : desk.deskIsInUse
     */
    private Integer deskIsInUse;

    /**
     * 桌位是否被删除 0删除 1未删除
     * 表字段 : desk.deskIsDelete
     */
    private Integer deskIsDelete;

    /**
     * 当前客户
     * 表字段 : desk.userAccount
     */
    private String userAccount;

    /**
     * 获取：桌位编号
     * 表字段：desk.deskId
     *
     * @return desk.deskId：桌位编号
     */
    public Integer getDeskId() {
        return deskId;
    }

    /**
     * 设置：桌位编号
     * 表字段：desk.deskId
     *
     * @param deskId
     *            desk.deskId：桌位编号
     */
    public void setDeskId(Integer deskId) {
        this.deskId = deskId;
    }

    /**
     * 获取：桌位人数
     * 表字段：desk.deskPeopleCount
     *
     * @return desk.deskPeopleCount：桌位人数
     */
    public Integer getDeskPeopleCount() {
        return deskPeopleCount;
    }

    /**
     * 设置：桌位人数
     * 表字段：desk.deskPeopleCount
     *
     * @param deskPeopleCount
     *            desk.deskPeopleCount：桌位人数
     */
    public void setDeskPeopleCount(Integer deskPeopleCount) {
        this.deskPeopleCount = deskPeopleCount;
    }

    /**
     * 获取：是否正在被使用 0未使用  1 使用
     * 表字段：desk.deskIsInUse
     *
     * @return desk.deskIsInUse：是否正在被使用 0未使用  1 使用
     */
    public Integer getDeskIsInUse() {
        return deskIsInUse;
    }

    /**
     * 设置：是否正在被使用 0未使用  1 使用
     * 表字段：desk.deskIsInUse
     *
     * @param deskIsInUse
     *            desk.deskIsInUse：是否正在被使用 0未使用  1 使用
     */
    public void setDeskIsInUse(Integer deskIsInUse) {
        this.deskIsInUse = deskIsInUse;
    }

    /**
     * 获取：桌位是否被删除 0删除 1未删除
     * 表字段：desk.deskIsDelete
     *
     * @return desk.deskIsDelete：桌位是否被删除 0删除 1未删除
     */
    public Integer getDeskIsDelete() {
        return deskIsDelete;
    }

    /**
     * 设置：桌位是否被删除 0删除 1未删除
     * 表字段：desk.deskIsDelete
     *
     * @param deskIsDelete
     *            desk.deskIsDelete：桌位是否被删除 0删除 1未删除
     */
    public void setDeskIsDelete(Integer deskIsDelete) {
        this.deskIsDelete = deskIsDelete;
    }

    /**
     * 获取：当前客户
     * 表字段：desk.userAccount
     *
     * @return desk.userAccount：当前客户
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置：当前客户
     * 表字段：desk.userAccount
     *
     * @param userAccount
     *            desk.userAccount：当前客户
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
}