package com.sky.mapper;


import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 向口味表批量插入数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据dishId删除口味
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id = #{id}")

    void deleteByDishId(Long dishId);

    /**
     * 根据菜品ID批量集合删除口味表中的数据
     * @param dishIds
     */
    void deleteByDishIds(List<Long> dishIds);
}
