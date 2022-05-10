package com.ruoyi.web.service.impl;

import java.util.List;

import com.ruoyi.web.mapper.M34Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.mapper.EvaluationTypeM34Mapper;
import com.ruoyi.web.domain.EvaluationTypeM34;
import com.ruoyi.web.service.IEvaluationTypeM34Service;

/**
 * 出版论著、教材评价标准Service业务层处理
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Service
public class EvaluationTypeM34ServiceImpl implements IEvaluationTypeM34Service 
{
    @Autowired
    private EvaluationTypeM34Mapper evaluationTypeM34Mapper;

    @Autowired
    private M34Mapper m34Mapper;

    /**
     * 查询出版论著、教材评价标准
     * 
     * @param id 出版论著、教材评价标准主键
     * @return 出版论著、教材评价标准
     */
    @Override
    public EvaluationTypeM34 selectEvaluationTypeM34ById(Long id)
    {
        return evaluationTypeM34Mapper.selectEvaluationTypeM34ById(id);
    }

    /**
     * 查询出版论著、教材评价标准列表
     * 
     * @param evaluationTypeM34 出版论著、教材评价标准
     * @return 出版论著、教材评价标准
     */
    @Override
    public List<EvaluationTypeM34> selectEvaluationTypeM34List(EvaluationTypeM34 evaluationTypeM34)
    {
        return evaluationTypeM34Mapper.selectEvaluationTypeM34List(evaluationTypeM34);
    }

    /**
     * 新增出版论著、教材评价标准
     * 
     * @param evaluationTypeM34 出版论著、教材评价标准
     * @return 结果
     */
    @Override
    public int insertEvaluationTypeM34(EvaluationTypeM34 evaluationTypeM34)
    {
        return evaluationTypeM34Mapper.insertEvaluationTypeM34(evaluationTypeM34);
    }

    /**
     * 修改出版论著、教材评价标准
     * 
     * @param evaluationTypeM34 出版论著、教材评价标准
     * @return 结果
     */
    @Override
    public int updateEvaluationTypeM34(EvaluationTypeM34 evaluationTypeM34)
    {
        return evaluationTypeM34Mapper.updateEvaluationTypeM34(evaluationTypeM34);
    }

    /**
     * 批量删除出版论著、教材评价标准
     * 
     * @param ids 需要删除的出版论著、教材评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM34ByIds(Long[] ids)
    {
        return evaluationTypeM34Mapper.deleteEvaluationTypeM34ByIds(ids);
    }

    /**
     * 删除出版论著、教材评价标准信息
     * 
     * @param id 出版论著、教材评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM34ById(Long id)
    {
        return evaluationTypeM34Mapper.deleteEvaluationTypeM34ById(id);
    }

    @Override
    public List<String> getFirstLevel() {
        return m34Mapper.selectFirstLevel();
    }

    @Override
    public List<String> getSecondLevel(String firstLevel) {
        return m34Mapper.selectSecondLevel(firstLevel);
    }

    @Override
    public List<String> getThirdLevel(String firstLevel, String secondLevel) {
        return m34Mapper.selectThirdLevel(firstLevel,secondLevel);
    }
}
