package com.bestcfm.dao;

import com.bestcfm.bean.FoodEvaluation;
import com.bestcfm.bean.FoodEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodEvaluationDao {
    /**
     *
     * @param example
     */
    int countByExample(FoodEvaluationExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(FoodEvaluationExample example);

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
    int insert(FoodEvaluation record);

    /**
     *
     * @param record
     */
    int insertSelective(FoodEvaluation record);

    /**
     *
     * @param example
     */
    List<FoodEvaluation> selectByExample(FoodEvaluationExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FoodEvaluation selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") FoodEvaluation record, @Param("example") FoodEvaluationExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") FoodEvaluation record, @Param("example") FoodEvaluationExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FoodEvaluation record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FoodEvaluation record);
}