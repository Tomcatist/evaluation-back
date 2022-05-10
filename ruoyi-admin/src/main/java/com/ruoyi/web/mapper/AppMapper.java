package com.ruoyi.web.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 申请Mapper接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface AppMapper {


    @Select("select distinct dept_name from sys_dept where parent_id != 0")
    List<String> getDeptName();

    @Select("select distinct type from evaluation_type")
    List<String> getType();
}
