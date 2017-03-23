package com.bestcfm.bean;

import java.util.Date;

public class Appointment {
    /**
     * 主键 预约id
     * 表字段 : appointment.id
     */
    private Integer id;

    /**
     * 手机号
     * 表字段 : appointment.phoneNum
     */
    private String phoneNum;

    /**
     * 人数
     * 表字段 : appointment.peopleCount
     */
    private Integer peopleCount;

    /**
     * 最早到达时间
     * 表字段 : appointment.earliestTime
     */
    private Date earliestTime;

    /**
     * 最晚到达时间
     * 表字段 : appointment.latestTime
     */
    private Date latestTime;

    /**
     * 0有效  1无效
     * 表字段 : appointment.dataFlag
     */
    private Integer dataFlag;

    /**
     * 获取：主键 预约id
     * 表字段：appointment.id
     *
     * @return appointment.id：主键 预约id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：主键 预约id
     * 表字段：appointment.id
     *
     * @param id
     *            appointment.id：主键 预约id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：手机号
     * 表字段：appointment.phoneNum
     *
     * @return appointment.phoneNum：手机号
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置：手机号
     * 表字段：appointment.phoneNum
     *
     * @param phoneNum
     *            appointment.phoneNum：手机号
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取：人数
     * 表字段：appointment.peopleCount
     *
     * @return appointment.peopleCount：人数
     */
    public Integer getPeopleCount() {
        return peopleCount;
    }

    /**
     * 设置：人数
     * 表字段：appointment.peopleCount
     *
     * @param peopleCount
     *            appointment.peopleCount：人数
     */
    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    /**
     * 获取：最早到达时间
     * 表字段：appointment.earliestTime
     *
     * @return appointment.earliestTime：最早到达时间
     */
    public Date getEarliestTime() {
        return earliestTime;
    }

    /**
     * 设置：最早到达时间
     * 表字段：appointment.earliestTime
     *
     * @param earliestTime
     *            appointment.earliestTime：最早到达时间
     */
    public void setEarliestTime(Date earliestTime) {
        this.earliestTime = earliestTime;
    }

    /**
     * 获取：最晚到达时间
     * 表字段：appointment.latestTime
     *
     * @return appointment.latestTime：最晚到达时间
     */
    public Date getLatestTime() {
        return latestTime;
    }

    /**
     * 设置：最晚到达时间
     * 表字段：appointment.latestTime
     *
     * @param latestTime
     *            appointment.latestTime：最晚到达时间
     */
    public void setLatestTime(Date latestTime) {
        this.latestTime = latestTime;
    }

    /**
     * 获取：0有效  1无效
     * 表字段：appointment.dataFlag
     *
     * @return appointment.dataFlag：0有效  1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：0有效  1无效
     * 表字段：appointment.dataFlag
     *
     * @param dataFlag
     *            appointment.dataFlag：0有效  1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}