package com.bestcfm.dao;

import com.bestcfm.bean.FoodOrder;
import com.bestcfm.bean.FoodOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodOrderDao {
    /**
     *
     * @param example
     */
    int countByExample(FoodOrderExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(FoodOrderExample example);

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
    int insert(FoodOrder record);

    /**
     *
     * @param record
     */
    int insertSelective(FoodOrder record);

    /**
     *
     * @param example
     */
    List<FoodOrder> selectByExample(FoodOrderExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FoodOrder selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") FoodOrder record, @Param("example") FoodOrderExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") FoodOrder record, @Param("example") FoodOrderExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FoodOrder record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FoodOrder record);
}