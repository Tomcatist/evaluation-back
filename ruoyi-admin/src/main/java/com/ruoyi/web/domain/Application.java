package com.ruoyi.web.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.springframework.data.annotation.Transient;

/**
 * 申请对象 application
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /**
     * 用户姓名
     */
    @TableField(exist = false)
    private String userName;

    /**
     * 申报结果名称
     */
    @TableField(exist = false)
    private String applyResultName;


    /** 一级分类（国家级，省级） */
    @TableField(exist = false)
    private String firstLevelType;

    /** 二级分类(个人，团体) */
    @TableField(exist = false)
    private String secondLevelType;

    /** 三级分类(一等奖，二等奖，三等奖,优秀奖) */
    @TableField(exist = false)
    private String thirdLevelType;

    /** 分数 */
    @TableField(exist = false)
    private Long scores;

    /** 部门 */
    private String deptName;

    /** 申报题目 */
    @Excel(name = "申报题目")
    private String applyName;

    /** 申报类型 */
    @Excel(name = "申报类型")
    private String applyType;

    /** 申报类型id */
    @Excel(name = "申报类型id")
    private Long applyTypeId;

    /** 申报内容 */
    @Excel(name = "申报内容")
    private String applyContent;

    /** 证明材料 */
    @Excel(name = "证明材料")
    private String applyLink;

    /** 备注 */
    @Excel(name = "备注")
    private String applyMark;

    /** 申报结果（0：待审核，1：申报成功，2：申报被驳回） */
    @Excel(name = "申报结果", readConverterExp = "0=：待审核，1：申报成功，2：申报被驳回")
    private Long applyResult;


}
