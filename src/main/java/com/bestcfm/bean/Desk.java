package com.bestcfm.bean;

public class Desk {
    /**
     * 桌位编号
     * 表字段 : desk.id
     */
    private Integer id;

    /**
     * 人数
     * 表字段 : desk.deskPeopleCount
     */
    private Integer deskPeopleCount;

    /**
     * 0有效 1无效
     * 表字段 : desk.dataFlag
     */
    private Integer dataFlag;

    /**
     * 获取：桌位编号
     * 表字段：desk.id
     *
     * @return desk.id：桌位编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：桌位编号
     * 表字段：desk.id
     *
     * @param id
     *            desk.id：桌位编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：人数
     * 表字段：desk.deskPeopleCount
     *
     * @return desk.deskPeopleCount：人数
     */
    public Integer getDeskPeopleCount() {
        return deskPeopleCount;
    }

    /**
     * 设置：人数
     * 表字段：desk.deskPeopleCount
     *
     * @param deskPeopleCount
     *            desk.deskPeopleCount：人数
     */
    public void setDeskPeopleCount(Integer deskPeopleCount) {
        this.deskPeopleCount = deskPeopleCount;
    }

    /**
     * 获取：0有效 1无效
     * 表字段：desk.dataFlag
     *
     * @return desk.dataFlag：0有效 1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：0有效 1无效
     * 表字段：desk.dataFlag
     *
     * @param dataFlag
     *            desk.dataFlag：0有效 1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}