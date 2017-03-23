package com.bestcfm.dao;

import com.bestcfm.bean.Emp;
import com.bestcfm.bean.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpDao {
    /**
     *
     * @param example
     */
    int countByExample(EmpExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(EmpExample example);

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
    int insert(Emp record);

    /**
     *
     * @param record
     */
    int insertSelective(Emp record);

    /**
     *
     * @param example
     */
    List<Emp> selectByExample(EmpExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Emp selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Emp record);
}