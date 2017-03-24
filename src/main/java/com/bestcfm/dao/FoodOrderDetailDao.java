package com.bestcfm.dao;

import com.bestcfm.bean.FoodOrderDetail;
import com.bestcfm.bean.FoodOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodOrderDetailDao {
    /**
     *
     * @param example
     */
    int countByExample(FoodOrderDetailExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(FoodOrderDetailExample example);

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
    int insert(FoodOrderDetail record);

    /**
     *
     * @param record
     */
    int insertSelective(FoodOrderDetail record);

    /**
     *
     * @param example
     */
    List<FoodOrderDetail> selectByExample(FoodOrderDetailExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FoodOrderDetail selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") FoodOrderDetail record, @Param("example") FoodOrderDetailExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") FoodOrderDetail record, @Param("example") FoodOrderDetailExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FoodOrderDetail record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FoodOrderDetail record);
}