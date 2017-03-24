package com.bestcfm.bean;

import java.util.Date;

public class Emp {
    /**
     * 主键 工号
     * 表字段 : emp.id
     */
    private Integer id;

    /**
     * 手机号
     * 表字段 : emp.phone
     */
    private String phone;

    /**
     * 密码
     * 表字段 : emp.empPassword
     */
    private String empPassword;

    /**
     * 姓名
     * 表字段 : emp.empName
     */
    private String empName;

    /**
     * 员工权限；0为厨师，1为服务员，2为管理员
     * 表字段 : emp.empRoot
     */
    private Integer empRoot;

    /**
     * 员工头像
     * 表字段 : emp.headImage
     */
    private String headImage;

    /**
     * 创建时间
     * 表字段 : emp.createTime
     */
    private Date createTime;

    /**
     * 0有效，1无效
     * 表字段 : emp.dataFlag
     */
    private Integer dataFlag;

    /**
     * 获取：主键 工号
     * 表字段：emp.id
     *
     * @return emp.id：主键 工号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：主键 工号
     * 表字段：emp.id
     *
     * @param id
     *            emp.id：主键 工号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：手机号
     * 表字段：emp.phone
     *
     * @return emp.phone：手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置：手机号
     * 表字段：emp.phone
     *
     * @param phone
     *            emp.phone：手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：密码
     * 表字段：emp.empPassword
     *
     * @return emp.empPassword：密码
     */
    public String getEmpPassword() {
        return empPassword;
    }

    /**
     * 设置：密码
     * 表字段：emp.empPassword
     *
     * @param empPassword
     *            emp.empPassword：密码
     */
    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    /**
     * 获取：姓名
     * 表字段：emp.empName
     *
     * @return emp.empName：姓名
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 设置：姓名
     * 表字段：emp.empName
     *
     * @param empName
     *            emp.empName：姓名
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * 获取：员工权限；0为厨师，1为服务员，2为管理员
     * 表字段：emp.empRoot
     *
     * @return emp.empRoot：员工权限；0为厨师，1为服务员，2为管理员
     */
    public Integer getEmpRoot() {
        return empRoot;
    }

    /**
     * 设置：员工权限；0为厨师，1为服务员，2为管理员
     * 表字段：emp.empRoot
     *
     * @param empRoot
     *            emp.empRoot：员工权限；0为厨师，1为服务员，2为管理员
     */
    public void setEmpRoot(Integer empRoot) {
        this.empRoot = empRoot;
    }

    /**
     * 获取：员工头像
     * 表字段：emp.headImage
     *
     * @return emp.headImage：员工头像
     */
    public String getHeadImage() {
        return headImage;
    }

    /**
     * 设置：员工头像
     * 表字段：emp.headImage
     *
     * @param headImage
     *            emp.headImage：员工头像
     */
    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    /**
     * 获取：创建时间
     * 表字段：emp.createTime
     *
     * @return emp.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     * 表字段：emp.createTime
     *
     * @param createTime
     *            emp.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：0有效，1无效
     * 表字段：emp.dataFlag
     *
     * @return emp.dataFlag：0有效，1无效
     */
    public Integer getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置：0有效，1无效
     * 表字段：emp.dataFlag
     *
     * @param dataFlag
     *            emp.dataFlag：0有效，1无效
     */
    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }
}