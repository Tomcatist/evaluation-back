package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户表 数据层
 * 
 * @author ruoyi
 */
public interface UserMapper
{

    @Select("select * from sys_user where dept_id = #{deptId} ")
    List<SysUser> selectUserByDeptId(@Param("deptId") Long deptId);
}
