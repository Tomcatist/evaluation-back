package com.ruoyi.web.service.impl;

import java.util.List;

import com.ruoyi.web.mapper.M32Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.mapper.EvaluationTypeM32Mapper;
import com.ruoyi.web.domain.EvaluationTypeM32;
import com.ruoyi.web.service.IEvaluationTypeM32Service;

/**
 * 指导学生竞赛活动评价标准Service业务层处理
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Service
public class EvaluationTypeM32ServiceImpl implements IEvaluationTypeM32Service 
{
    @Autowired
    private EvaluationTypeM32Mapper evaluationTypeM32Mapper;

    @Autowired
    private M32Mapper m32Mapper;

    /**
     * 查询指导学生竞赛活动评价标准
     * 
     * @param id 指导学生竞赛活动评价标准主键
     * @return 指导学生竞赛活动评价标准
     */
    @Override
    public EvaluationTypeM32 selectEvaluationTypeM32ById(Long id)
    {
        return evaluationTypeM32Mapper.selectEvaluationTypeM32ById(id);
    }

    /**
     * 查询指导学生竞赛活动评价标准列表
     * 
     * @param evaluationTypeM32 指导学生竞赛活动评价标准
     * @return 指导学生竞赛活动评价标准
     */
    @Override
    public List<EvaluationTypeM32> selectEvaluationTypeM32List(EvaluationTypeM32 evaluationTypeM32)
    {
        return evaluationTypeM32Mapper.selectEvaluationTypeM32List(evaluationTypeM32);
    }

    /**
     * 新增指导学生竞赛活动评价标准
     * 
     * @param evaluationTypeM32 指导学生竞赛活动评价标准
     * @return 结果
     */
    @Override
    public int insertEvaluationTypeM32(EvaluationTypeM32 evaluationTypeM32)
    {
        return evaluationTypeM32Mapper.insertEvaluationTypeM32(evaluationTypeM32);
    }

    /**
     * 修改指导学生竞赛活动评价标准
     * 
     * @param evaluationTypeM32 指导学生竞赛活动评价标准
     * @return 结果
     */
    @Override
    public int updateEvaluationTypeM32(EvaluationTypeM32 evaluationTypeM32)
    {
        return evaluationTypeM32Mapper.updateEvaluationTypeM32(evaluationTypeM32);
    }

    /**
     * 批量删除指导学生竞赛活动评价标准
     * 
     * @param ids 需要删除的指导学生竞赛活动评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM32ByIds(Long[] ids)
    {
        return evaluationTypeM32Mapper.deleteEvaluationTypeM32ByIds(ids);
    }

    /**
     * 删除指导学生竞赛活动评价标准信息
     * 
     * @param id 指导学生竞赛活动评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM32ById(Long id)
    {
        return evaluationTypeM32Mapper.deleteEvaluationTypeM32ById(id);
    }

    @Override
    public List<String> getFirstLevel() {
        return m32Mapper.selectFirstLevel();
    }

    @Override
    public List<String> getSecondLevel(String firstLevel) {
        return m32Mapper.selectSecondLevel(firstLevel);
    }

    @Override
    public List<String> getThirdLevel(String firstLevel, String secondLevel) {
        return m32Mapper.selectThirdLevel(firstLevel,secondLevel);
    }
}
