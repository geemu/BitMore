package com.bestcfm.dao.custom;

import com.bestcfm.bean.Food;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodDaoCustom {
   /**
    * 根据关键字查询
    * @param key
    * @return
    */
    List<Food> selectByKey(@Param("key")String key);

}