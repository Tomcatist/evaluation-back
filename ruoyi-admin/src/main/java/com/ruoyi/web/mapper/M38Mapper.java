package com.ruoyi.web.mapper;

import com.ruoyi.web.domain.EvaluationTypeM37;
import com.ruoyi.web.domain.EvaluationTypeM38;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface M38Mapper {


    @Select("select distinct first_level_type from evaluation_type_M38")
    List<String> selectFirstLevel();

    @Select("select distinct second_level_type from evaluation_type_M38 where first_level_type = #{firstLevel} ")
    List<String> selectSecondLevel(@Param("firstLevel") String firstLevel);

    @Select("select third_level_type from evaluation_type_M38 where first_level_type = #{firstLevel} and second_level_type = #{secondLevel} ")
    List<String> selectThirdLevel(@Param("firstLevel") String firstLevel, @Param("secondLevel") String secondLevel);

    @Select("select * from evaluation_type_M38 where first_level_type = #{firstLevelType} and second_level_type = #{secondLevelType} and third_level_type = #{thirdLevelType}")
    EvaluationTypeM38 selectIdByType(@Param("firstLevelType") String firstLevelType, @Param("secondLevelType") String secondLevelType, @Param("thirdLevelType") String thirdLevelType);


    @Select("select * from evaluation_type_M38 where id = #{id}")
    @Results({
            @Result(id=true, column = "id", property = "id"),
            @Result(column = "first_level_type", property = "firstLevelType"),
            @Result(column = "second_level_type", property = "secondLevelType"),
            @Result(column = "third_level_type", property = "thirdLevelType"),
            @Result(column = "scores", property = "scores")
    })
    EvaluationTypeM38 selectById(@Param("id") Long id);
}
