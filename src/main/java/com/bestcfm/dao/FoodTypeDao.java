package com.bestcfm.dao;

import com.bestcfm.bean.FoodType;
import com.bestcfm.bean.FoodTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodTypeDao {
    /**
     *
     * @param example
     */
    int countByExample(FoodTypeExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(FoodTypeExample example);

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
    int insert(FoodType record);

    /**
     *
     * @param record
     */
    int insertSelective(FoodType record);

    /**
     *
     * @param example
     */
    List<FoodType> selectByExample(FoodTypeExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FoodType selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") FoodType record, @Param("example") FoodTypeExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") FoodType record, @Param("example") FoodTypeExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FoodType record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FoodType record);
}