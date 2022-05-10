package com.ruoyi.web.mapper;

import com.ruoyi.web.domain.EvaluationTypeM38;
import com.ruoyi.web.domain.EvaluationTypeM39;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface M39Mapper {


    @Select("select distinct first_level_type from evaluation_type_M39")
    List<String> selectFirstLevel();

    @Select("select distinct second_level_type from evaluation_type_M39 where first_level_type = #{firstLevel} ")
    List<String> selectSecondLevel(@Param("firstLevel") String firstLevel);

    @Select("select * from evaluation_type_M39 where first_level_type = #{firstLevelType} and second_level_type = #{secondLevelType}")
    EvaluationTypeM39 selectIdByType(@Param("firstLevelType") String firstLevelType, @Param("secondLevelType") String secondLevelType);


    @Select("select * from evaluation_type_M39 where id = #{id}")
    @Results({
            @Result(id=true, column = "id", property = "id"),
            @Result(column = "first_level_type", property = "firstLevelType"),
            @Result(column = "second_level_type", property = "secondLevelType"),
            @Result(column = "scores", property = "scores")
    })
    EvaluationTypeM39 selectById(@Param("id") Long id);
}
