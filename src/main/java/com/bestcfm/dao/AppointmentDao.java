package com.bestcfm.dao;

import com.bestcfm.bean.Appointment;
import com.bestcfm.bean.AppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointmentDao {
    /**
     *
     * @param example
     */
    int countByExample(AppointmentExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(AppointmentExample example);

    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Appointment record);

    /**
     *
     * @param record
     */
    int insertSelective(Appointment record);

    /**
     *
     * @param example
     */
    List<Appointment> selectByExample(AppointmentExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Appointment selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Appointment record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Appointment record);
}