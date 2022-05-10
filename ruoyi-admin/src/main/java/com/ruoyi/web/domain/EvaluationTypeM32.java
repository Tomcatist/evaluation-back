package com.ruoyi.web.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 指导学生竞赛活动评价标准对象 evaluation_type_M32
 * 
 * @author yyss
 * @date 2022-05-01
 */
public class EvaluationTypeM32 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 一级分类（国家级，省级） */
    @Excel(name = "一级分类", readConverterExp = "国=家级，省级")
    private String firstLevelType;

    /** 二级分类(个人，团体) */
    @Excel(name = "二级分类(个人，团体)")
    private String secondLevelType;

    /** 三级分类(一等奖，二等奖，三等奖,优秀奖) */
    @Excel(name = "三级分类(一等奖，二等奖，三等奖,优秀奖)")
    private String thirdLevelType;

    /** 分数 */
    @Excel(name = "分数")
    private Long scores;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFirstLevelType(String firstLevelType) 
    {
        this.firstLevelType = firstLevelType;
    }

    public String getFirstLevelType() 
    {
        return firstLevelType;
    }
    public void setSecondLevelType(String secondLevelType) 
    {
        this.secondLevelType = secondLevelType;
    }

    public String getSecondLevelType() 
    {
        return secondLevelType;
    }
    public void setThirdLevelType(String thirdLevelType) 
    {
        this.thirdLevelType = thirdLevelType;
    }

    public String getThirdLevelType() 
    {
        return thirdLevelType;
    }
    public void setScores(Long scores) 
    {
        this.scores = scores;
    }

    public Long getScores() 
    {
        return scores;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("firstLevelType", getFirstLevelType())
            .append("secondLevelType", getSecondLevelType())
            .append("thirdLevelType", getThirdLevelType())
            .append("scores", getScores())
            .toString();
    }
}
