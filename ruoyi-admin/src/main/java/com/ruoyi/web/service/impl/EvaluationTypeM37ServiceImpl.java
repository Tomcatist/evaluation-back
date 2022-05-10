package com.ruoyi.web.service.impl;

import java.util.List;

import com.ruoyi.web.mapper.M37Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.mapper.EvaluationTypeM37Mapper;
import com.ruoyi.web.domain.EvaluationTypeM37;
import com.ruoyi.web.service.IEvaluationTypeM37Service;

/**
 * 社会服务和科技成果转化评价标准Service业务层处理
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Service
public class EvaluationTypeM37ServiceImpl implements IEvaluationTypeM37Service 
{
    @Autowired
    private EvaluationTypeM37Mapper evaluationTypeM37Mapper;

    @Autowired
    private M37Mapper m37Mapper;

    /**
     * 查询社会服务和科技成果转化评价标准
     * 
     * @param id 社会服务和科技成果转化评价标准主键
     * @return 社会服务和科技成果转化评价标准
     */
    @Override
    public EvaluationTypeM37 selectEvaluationTypeM37ById(Long id)
    {
        return evaluationTypeM37Mapper.selectEvaluationTypeM37ById(id);
    }

    /**
     * 查询社会服务和科技成果转化评价标准列表
     * 
     * @param evaluationTypeM37 社会服务和科技成果转化评价标准
     * @return 社会服务和科技成果转化评价标准
     */
    @Override
    public List<EvaluationTypeM37> selectEvaluationTypeM37List(EvaluationTypeM37 evaluationTypeM37)
    {
        return evaluationTypeM37Mapper.selectEvaluationTypeM37List(evaluationTypeM37);
    }

    /**
     * 新增社会服务和科技成果转化评价标准
     * 
     * @param evaluationTypeM37 社会服务和科技成果转化评价标准
     * @return 结果
     */
    @Override
    public int insertEvaluationTypeM37(EvaluationTypeM37 evaluationTypeM37)
    {
        return evaluationTypeM37Mapper.insertEvaluationTypeM37(evaluationTypeM37);
    }

    /**
     * 修改社会服务和科技成果转化评价标准
     * 
     * @param evaluationTypeM37 社会服务和科技成果转化评价标准
     * @return 结果
     */
    @Override
    public int updateEvaluationTypeM37(EvaluationTypeM37 evaluationTypeM37)
    {
        return evaluationTypeM37Mapper.updateEvaluationTypeM37(evaluationTypeM37);
    }

    /**
     * 批量删除社会服务和科技成果转化评价标准
     * 
     * @param ids 需要删除的社会服务和科技成果转化评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM37ByIds(Long[] ids)
    {
        return evaluationTypeM37Mapper.deleteEvaluationTypeM37ByIds(ids);
    }

    /**
     * 删除社会服务和科技成果转化评价标准信息
     * 
     * @param id 社会服务和科技成果转化评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM37ById(Long id)
    {
        return evaluationTypeM37Mapper.deleteEvaluationTypeM37ById(id);
    }

    @Override
    public List<String> getFirstLevel() {
        return m37Mapper.selectFirstLevel();
    }

    @Override
    public List<String> getSecondLevel(String firstLevel) {
        return m37Mapper.selectSecondLevel(firstLevel);
    }

    @Override
    public List<String> getThirdLevel(String firstLevel, String secondLevel) {
        return m37Mapper.selectThirdLevel(firstLevel,secondLevel);
    }
}
