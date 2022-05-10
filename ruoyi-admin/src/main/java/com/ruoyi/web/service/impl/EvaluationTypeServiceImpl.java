package com.ruoyi.web.service.impl;

import com.ruoyi.web.domain.EvaluationType;
import com.ruoyi.web.mapper.EvaluationTypeMapper;
import com.ruoyi.web.service.IEvaluationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评价类型Service业务层处理
 * 
 * @author yyss
 * @date 2022-04-30
 */
@Service
public class EvaluationTypeServiceImpl implements IEvaluationTypeService 
{
    @Autowired
    private EvaluationTypeMapper evaluationTypeMapper;

    /**
     * 查询评价类型
     * 
     * @param id 评价类型主键
     * @return 评价类型
     */
    @Override
    public EvaluationType selectEvaluationTypeById(Long id)
    {
        return evaluationTypeMapper.selectEvaluationTypeById(id);
    }

    /**
     * 查询评价类型列表
     * 
     * @param evaluationType 评价类型
     * @return 评价类型
     */
    @Override
    public List<EvaluationType> selectEvaluationTypeList(EvaluationType evaluationType)
    {
        return evaluationTypeMapper.selectEvaluationTypeList(evaluationType);
    }

    /**
     * 新增评价类型
     * 
     * @param evaluationType 评价类型
     * @return 结果
     */
    @Override
    public int insertEvaluationType(EvaluationType evaluationType)
    {
        return evaluationTypeMapper.insertEvaluationType(evaluationType);
    }

    /**
     * 修改评价类型
     * 
     * @param evaluationType 评价类型
     * @return 结果
     */
    @Override
    public int updateEvaluationType(EvaluationType evaluationType)
    {
        return evaluationTypeMapper.updateEvaluationType(evaluationType);
    }

    /**
     * 批量删除评价类型
     * 
     * @param ids 需要删除的评价类型主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeByIds(Long[] ids)
    {
        return evaluationTypeMapper.deleteEvaluationTypeByIds(ids);
    }

    /**
     * 删除评价类型信息
     * 
     * @param id 评价类型主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeById(Long id)
    {
        return evaluationTypeMapper.deleteEvaluationTypeById(id);
    }
}
