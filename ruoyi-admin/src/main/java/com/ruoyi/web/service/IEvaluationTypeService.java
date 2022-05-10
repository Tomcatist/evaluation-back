package com.ruoyi.web.service;

import com.ruoyi.web.domain.EvaluationType;

import java.util.List;

/**
 * 评价类型Service接口
 * 
 * @author yyss
 * @date 2022-04-30
 */
public interface IEvaluationTypeService 
{
    /**
     * 查询评价类型
     * 
     * @param id 评价类型主键
     * @return 评价类型
     */
    public EvaluationType selectEvaluationTypeById(Long id);

    /**
     * 查询评价类型列表
     * 
     * @param evaluationType 评价类型
     * @return 评价类型集合
     */
    public List<EvaluationType> selectEvaluationTypeList(EvaluationType evaluationType);

    /**
     * 新增评价类型
     * 
     * @param evaluationType 评价类型
     * @return 结果
     */
    public int insertEvaluationType(EvaluationType evaluationType);

    /**
     * 修改评价类型
     * 
     * @param evaluationType 评价类型
     * @return 结果
     */
    public int updateEvaluationType(EvaluationType evaluationType);

    /**
     * 批量删除评价类型
     * 
     * @param ids 需要删除的评价类型主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeByIds(Long[] ids);

    /**
     * 删除评价类型信息
     * 
     * @param id 评价类型主键
     * @return 结果
     */
    public int deleteEvaluationTypeById(Long id);
}
