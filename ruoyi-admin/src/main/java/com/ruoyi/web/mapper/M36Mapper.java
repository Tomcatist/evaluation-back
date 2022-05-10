package com.ruoyi.web.mapper;

import com.ruoyi.web.domain.EvaluationTypeM35;
import com.ruoyi.web.domain.EvaluationTypeM36;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface M36Mapper {


    @Select("select distinct first_level_type from evaluation_type_M36")
    List<String> selectFirstLevel();

    @Select("select * from evaluation_type_M36 where first_level_type = #{firstLevelType}")
    EvaluationTypeM36 selectIdByType(@Param("firstLevelType") String firstLevelType);

    @Select("select * from evaluation_type_M36 where id = #{id}")
    @Results({
            @Result(id=true, column = "id", property = "id"),
            @Result(column = "first_level_type", property = "firstLevelType"),
            @Result(column = "scores", property = "scores")
    })
    EvaluationTypeM36 selectById(@Param("id") Long id);
}
