package com.bestcfm.bean;
/**
 * dasd
 */
import java.util.Date;

public class Appointment {
    /**
     * 主键
     * 表字段 : appointment.appointId
     */
    private Integer appointId;

    /**
     * 预约人手机号
     * 表字段 : appointment.userAccount
     */
    private String userAccount;

    /**
     * 预约人姓名
     * 表字段 : appointment.appointUserName
     */
    private String appointUserName;

    /**
     * 预约时间
     * 表字段 : appointment.appointTime
     */
    private Date appointTime;

    /**
     * 预约座位人数
     * 表字段 : appointment.appointPeopleCount
     */
    private Integer appointPeopleCount;

    /**
     * 预约是否删除 0删除  1 未删除
     * 表字段 : appointment.appointIsDelete
     */
    private Integer appointIsDelete;

    /**
     * 获取：主键
     * 表字段：appointment.appointId
     *
     * @return appointment.appointId：主键
     */
    public Integer getAppointId() {
        return appointId;
    }

    /**
     * 设置：主键
     * 表字段：appointment.appointId
     *
     * @param appointId
     *            appointment.appointId：主键
     */
    public void setAppointId(Integer appointId) {
        this.appointId = appointId;
    }

    /**
     * 获取：预约人手机号
     * 表字段：appointment.userAccount
     *
     * @return appointment.userAccount：预约人手机号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置：预约人手机号
     * 表字段：appointment.userAccount
     *
     * @param userAccount
     *            appointment.userAccount：预约人手机号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取：预约人姓名
     * 表字段：appointment.appointUserName
     *
     * @return appointment.appointUserName：预约人姓名
     */
    public String getAppointUserName() {
        return appointUserName;
    }

    /**
     * 设置：预约人姓名
     * 表字段：appointment.appointUserName
     *
     * @param appointUserName
     *            appointment.appointUserName：预约人姓名
     */
    public void setAppointUserName(String appointUserName) {
        this.appointUserName = appointUserName;
    }

    /**
     * 获取：预约时间
     * 表字段：appointment.appointTime
     *
     * @return appointment.appointTime：预约时间
     */
    public Date getAppointTime() {
        return appointTime;
    }

    /**
     * 设置：预约时间
     * 表字段：appointment.appointTime
     *
     * @param appointTime
     *            appointment.appointTime：预约时间
     */
    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    /**
     * 获取：预约座位人数
     * 表字段：appointment.appointPeopleCount
     *
     * @return appointment.appointPeopleCount：预约座位人数
     */
    public Integer getAppointPeopleCount() {
        return appointPeopleCount;
    }

    /**
     * 设置：预约座位人数
     * 表字段：appointment.appointPeopleCount
     *
     * @param appointPeopleCount
     *            appointment.appointPeopleCount：预约座位人数
     */
    public void setAppointPeopleCount(Integer appointPeopleCount) {
        this.appointPeopleCount = appointPeopleCount;
    }

    /**
     * 获取：预约是否删除 0删除  1 未删除
     * 表字段：appointment.appointIsDelete
     *
     * @return appointment.appointIsDelete：预约是否删除 0删除  1 未删除
     */
    public Integer getAppointIsDelete() {
        return appointIsDelete;
    }

    /**
     * 设置：预约是否删除 0删除  1 未删除
     * 表字段：appointment.appointIsDelete
     *
     * @param appointIsDelete
     *            appointment.appointIsDelete：预约是否删除 0删除  1 未删除
     */
    public void setAppointIsDelete(Integer appointIsDelete) {
        this.appointIsDelete = appointIsDelete;
    }
}