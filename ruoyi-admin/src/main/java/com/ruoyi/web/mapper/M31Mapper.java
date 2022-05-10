package com.ruoyi.web.mapper;

import com.ruoyi.web.domain.EvaluationTypeM31;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface M31Mapper {


    /**
     * 获取一级分类
     */
    @Select("select distinct first_level_type from evaluation_type_M31")
    List<String> getFirstLevel();

    /**
     * 根据一级分类获取二级分类
     * @param firstLevel 一级分类
     */
    @Select("select second_level_type from evaluation_type_M31 where first_level_type = #{firstLevel}")
    List<String> getSecondLevel(String firstLevel);

    @Select("select * from evaluation_type_M31 where first_level_type = #{firstLevelType} and second_level_type = #{secondLevelType}")
    EvaluationTypeM31 selectIdByType(@Param("firstLevelType") String firstLevelType, @Param("secondLevelType") String secondLevelType);

    @Select("select * from evaluation_type_M31 where id = #{id}")
    @Results({
            @Result(id=true, column = "id", property = "id"),
            @Result(column = "first_level_type", property = "firstLevelType"),
            @Result(column = "second_level_type", property = "secondLevelType"),
            @Result(column = "scores", property = "scores")
    })
    EvaluationTypeM31 selectById(@Param("id") Long id);
}
