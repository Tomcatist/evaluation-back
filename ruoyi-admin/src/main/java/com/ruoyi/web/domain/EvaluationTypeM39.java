package com.ruoyi.web.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教学和科研获得荣誉评价标准对象 evaluation_type_M39
 * 
 * @author yyss
 * @date 2022-05-01
 */
public class EvaluationTypeM39 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 一级分类 */
    @Excel(name = "一级分类")
    private String firstLevelType;

    /** 二级分类 */
    @Excel(name = "二级分类")
    private String secondLevelType;

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
            .append("scores", getScores())
            .toString();
    }
}
