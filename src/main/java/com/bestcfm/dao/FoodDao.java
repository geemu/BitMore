package com.bestcfm.dao;

import com.bestcfm.bean.Food;
import com.bestcfm.bean.FoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodDao {
    /**
     *
     * @param example
     */
    int countByExample(FoodExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(FoodExample example);

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
    int insert(Food record);

    /**
     *
     * @param record
     */
    int insertSelective(Food record);

    /**
     *
     * @param example
     */
    List<Food> selectByExample(FoodExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Food selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Food record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Food record);
}