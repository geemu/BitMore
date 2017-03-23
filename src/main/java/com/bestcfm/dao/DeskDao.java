package com.bestcfm.dao;

import com.bestcfm.bean.Desk;
import com.bestcfm.bean.DeskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeskDao {
    /**
     *
     * @param example
     */
    int countByExample(DeskExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(DeskExample example);

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
    int insert(Desk record);

    /**
     *
     * @param record
     */
    int insertSelective(Desk record);

    /**
     *
     * @param example
     */
    List<Desk> selectByExample(DeskExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Desk selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Desk record, @Param("example") DeskExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Desk record, @Param("example") DeskExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Desk record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Desk record);
}