package com.bestcfm.dao;

import com.bestcfm.bean.FoodOrderRecords;
import com.bestcfm.bean.FoodOrderRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodOrderRecordsDao {
    /**
     *
     * @param example
     */
    int countByExample(FoodOrderRecordsExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(FoodOrderRecordsExample example);

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
    int insert(FoodOrderRecords record);

    /**
     *
     * @param record
     */
    int insertSelective(FoodOrderRecords record);

    /**
     *
     * @param example
     */
    List<FoodOrderRecords> selectByExample(FoodOrderRecordsExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FoodOrderRecords selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") FoodOrderRecords record, @Param("example") FoodOrderRecordsExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") FoodOrderRecords record, @Param("example") FoodOrderRecordsExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FoodOrderRecords record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FoodOrderRecords record);
}