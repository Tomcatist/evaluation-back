package com.ruoyi.web.service.impl;

import java.util.List;

import com.ruoyi.web.mapper.M38Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.mapper.EvaluationTypeM38Mapper;
import com.ruoyi.web.domain.EvaluationTypeM38;
import com.ruoyi.web.service.IEvaluationTypeM38Service;

/**
 * 艺术类作品的及其评价标准Service业务层处理
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Service
public class EvaluationTypeM38ServiceImpl implements IEvaluationTypeM38Service 
{
    @Autowired
    private EvaluationTypeM38Mapper evaluationTypeM38Mapper;

    @Autowired
    private M38Mapper m38Mapper;

    /**
     * 查询艺术类作品的及其评价标准
     * 
     * @param id 艺术类作品的及其评价标准主键
     * @return 艺术类作品的及其评价标准
     */
    @Override
    public EvaluationTypeM38 selectEvaluationTypeM38ById(Long id)
    {
        return evaluationTypeM38Mapper.selectEvaluationTypeM38ById(id);
    }

    /**
     * 查询艺术类作品的及其评价标准列表
     * 
     * @param evaluationTypeM38 艺术类作品的及其评价标准
     * @return 艺术类作品的及其评价标准
     */
    @Override
    public List<EvaluationTypeM38> selectEvaluationTypeM38List(EvaluationTypeM38 evaluationTypeM38)
    {
        return evaluationTypeM38Mapper.selectEvaluationTypeM38List(evaluationTypeM38);
    }

    /**
     * 新增艺术类作品的及其评价标准
     * 
     * @param evaluationTypeM38 艺术类作品的及其评价标准
     * @return 结果
     */
    @Override
    public int insertEvaluationTypeM38(EvaluationTypeM38 evaluationTypeM38)
    {
        return evaluationTypeM38Mapper.insertEvaluationTypeM38(evaluationTypeM38);
    }

    /**
     * 修改艺术类作品的及其评价标准
     * 
     * @param evaluationTypeM38 艺术类作品的及其评价标准
     * @return 结果
     */
    @Override
    public int updateEvaluationTypeM38(EvaluationTypeM38 evaluationTypeM38)
    {
        return evaluationTypeM38Mapper.updateEvaluationTypeM38(evaluationTypeM38);
    }

    /**
     * 批量删除艺术类作品的及其评价标准
     * 
     * @param ids 需要删除的艺术类作品的及其评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM38ByIds(Long[] ids)
    {
        return evaluationTypeM38Mapper.deleteEvaluationTypeM38ByIds(ids);
    }

    /**
     * 删除艺术类作品的及其评价标准信息
     * 
     * @param id 艺术类作品的及其评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM38ById(Long id)
    {
        return evaluationTypeM38Mapper.deleteEvaluationTypeM38ById(id);
    }

    @Override
    public List<String> getFirstLevel() {
        return m38Mapper.selectFirstLevel();
    }

    @Override
    public List<String> getSecondLevel(String firstLevel) {
        return m38Mapper.selectSecondLevel(firstLevel);
    }

    @Override
    public List<String> getThirdLevel(String firstLevel, String secondLevel) {
        return m38Mapper.selectThirdLevel(firstLevel,secondLevel);
    }
}
