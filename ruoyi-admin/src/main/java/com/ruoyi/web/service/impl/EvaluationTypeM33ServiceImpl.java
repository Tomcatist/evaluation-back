package com.ruoyi.web.service.impl;

import java.util.List;

import com.ruoyi.web.mapper.M33Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.mapper.EvaluationTypeM33Mapper;
import com.ruoyi.web.domain.EvaluationTypeM33;
import com.ruoyi.web.service.IEvaluationTypeM33Service;

/**
 * 发教研科研论文评价标准Service业务层处理
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Service
public class EvaluationTypeM33ServiceImpl implements IEvaluationTypeM33Service 
{
    @Autowired
    private EvaluationTypeM33Mapper evaluationTypeM33Mapper;

    @Autowired
    private M33Mapper m33Mapper;

    /**
     * 查询发教研科研论文评价标准
     * 
     * @param id 发教研科研论文评价标准主键
     * @return 发教研科研论文评价标准
     */
    @Override
    public EvaluationTypeM33 selectEvaluationTypeM33ById(Long id)
    {
        return evaluationTypeM33Mapper.selectEvaluationTypeM33ById(id);
    }

    /**
     * 查询发教研科研论文评价标准列表
     * 
     * @param evaluationTypeM33 发教研科研论文评价标准
     * @return 发教研科研论文评价标准
     */
    @Override
    public List<EvaluationTypeM33> selectEvaluationTypeM33List(EvaluationTypeM33 evaluationTypeM33)
    {
        return evaluationTypeM33Mapper.selectEvaluationTypeM33List(evaluationTypeM33);
    }

    /**
     * 新增发教研科研论文评价标准
     * 
     * @param evaluationTypeM33 发教研科研论文评价标准
     * @return 结果
     */
    @Override
    public int insertEvaluationTypeM33(EvaluationTypeM33 evaluationTypeM33)
    {
        return evaluationTypeM33Mapper.insertEvaluationTypeM33(evaluationTypeM33);
    }

    /**
     * 修改发教研科研论文评价标准
     * 
     * @param evaluationTypeM33 发教研科研论文评价标准
     * @return 结果
     */
    @Override
    public int updateEvaluationTypeM33(EvaluationTypeM33 evaluationTypeM33)
    {
        return evaluationTypeM33Mapper.updateEvaluationTypeM33(evaluationTypeM33);
    }

    /**
     * 批量删除发教研科研论文评价标准
     * 
     * @param ids 需要删除的发教研科研论文评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM33ByIds(Long[] ids)
    {
        return evaluationTypeM33Mapper.deleteEvaluationTypeM33ByIds(ids);
    }

    /**
     * 删除发教研科研论文评价标准信息
     * 
     * @param id 发教研科研论文评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM33ById(Long id)
    {
        return evaluationTypeM33Mapper.deleteEvaluationTypeM33ById(id);
    }

    @Override
    public List<String> getFirstLevel() {
        return m33Mapper.selectFirstLevel();
    }

    @Override
    public List<String> getSecondLevel(String firstLevel) {
        return m33Mapper.selectSecondLevel(firstLevel);
    }
}
