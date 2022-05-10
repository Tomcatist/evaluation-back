package com.ruoyi.web.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 发教研科研论文评价标准对象 evaluation_type_M33
 * 
 * @author yyss
 * @date 2022-05-01
 */
public class EvaluationTypeM33 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 一级分类(超级期刊，顶级期刊，一级期刊，二级期刊，三级期刊，四级期刊) */
    @Excel(name = "一级分类(超级期刊，顶级期刊，一级期刊，二级期刊，三级期刊，四级期刊)")
    private String firstLevelType;

    /** 二级分类（理工类，人文社科类） */
    @Excel(name = "二级分类", readConverterExp = "理=工类，人文社科类")
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
