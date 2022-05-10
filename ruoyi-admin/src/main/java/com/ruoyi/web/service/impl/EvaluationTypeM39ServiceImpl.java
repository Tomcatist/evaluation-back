package com.ruoyi.web.service.impl;

import java.util.List;

import com.ruoyi.web.mapper.M39Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.mapper.EvaluationTypeM39Mapper;
import com.ruoyi.web.domain.EvaluationTypeM39;
import com.ruoyi.web.service.IEvaluationTypeM39Service;

/**
 * 教学和科研获得荣誉评价标准Service业务层处理
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Service
public class EvaluationTypeM39ServiceImpl implements IEvaluationTypeM39Service 
{
    @Autowired
    private EvaluationTypeM39Mapper evaluationTypeM39Mapper;

    @Autowired
    private M39Mapper m39Mapper;

    /**
     * 查询教学和科研获得荣誉评价标准
     * 
     * @param id 教学和科研获得荣誉评价标准主键
     * @return 教学和科研获得荣誉评价标准
     */
    @Override
    public EvaluationTypeM39 selectEvaluationTypeM39ById(Long id)
    {
        return evaluationTypeM39Mapper.selectEvaluationTypeM39ById(id);
    }

    /**
     * 查询教学和科研获得荣誉评价标准列表
     * 
     * @param evaluationTypeM39 教学和科研获得荣誉评价标准
     * @return 教学和科研获得荣誉评价标准
     */
    @Override
    public List<EvaluationTypeM39> selectEvaluationTypeM39List(EvaluationTypeM39 evaluationTypeM39)
    {
        return evaluationTypeM39Mapper.selectEvaluationTypeM39List(evaluationTypeM39);
    }

    /**
     * 新增教学和科研获得荣誉评价标准
     * 
     * @param evaluationTypeM39 教学和科研获得荣誉评价标准
     * @return 结果
     */
    @Override
    public int insertEvaluationTypeM39(EvaluationTypeM39 evaluationTypeM39)
    {
        return evaluationTypeM39Mapper.insertEvaluationTypeM39(evaluationTypeM39);
    }

    /**
     * 修改教学和科研获得荣誉评价标准
     * 
     * @param evaluationTypeM39 教学和科研获得荣誉评价标准
     * @return 结果
     */
    @Override
    public int updateEvaluationTypeM39(EvaluationTypeM39 evaluationTypeM39)
    {
        return evaluationTypeM39Mapper.updateEvaluationTypeM39(evaluationTypeM39);
    }

    /**
     * 批量删除教学和科研获得荣誉评价标准
     * 
     * @param ids 需要删除的教学和科研获得荣誉评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM39ByIds(Long[] ids)
    {
        return evaluationTypeM39Mapper.deleteEvaluationTypeM39ByIds(ids);
    }

    /**
     * 删除教学和科研获得荣誉评价标准信息
     * 
     * @param id 教学和科研获得荣誉评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM39ById(Long id)
    {
        return evaluationTypeM39Mapper.deleteEvaluationTypeM39ById(id);
    }

    @Override
    public List<String> getFirstLevel() {
        return m39Mapper.selectFirstLevel();
    }

    @Override
    public List<String> getSecondLevel(String firstLevel) {
        return m39Mapper.selectSecondLevel(firstLevel);
    }
}
