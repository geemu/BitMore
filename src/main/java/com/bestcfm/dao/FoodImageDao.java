package com.bestcfm.dao;

import com.bestcfm.bean.FoodImage;
import com.bestcfm.bean.FoodImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodImageDao {
    /**
     *
     * @param example
     */
    int countByExample(FoodImageExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(FoodImageExample example);

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
    int insert(FoodImage record);

    /**
     *
     * @param record
     */
    int insertSelective(FoodImage record);

    /**
     *
     * @param example
     */
    List<FoodImage> selectByExample(FoodImageExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FoodImage selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") FoodImage record, @Param("example") FoodImageExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") FoodImage record, @Param("example") FoodImageExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FoodImage record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FoodImage record);
}