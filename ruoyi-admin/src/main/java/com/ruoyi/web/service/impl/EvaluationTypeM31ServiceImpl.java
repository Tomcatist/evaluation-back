package com.ruoyi.web.service.impl;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.web.mapper.M31Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.mapper.EvaluationTypeM31Mapper;
import com.ruoyi.web.domain.EvaluationTypeM31;
import com.ruoyi.web.service.IEvaluationTypeM31Service;

/**
 * 教学竞赛评价标准Service业务层处理
 * 
 * @author yyss
 * @date 2022-04-30
 */
@Service
public class EvaluationTypeM31ServiceImpl implements IEvaluationTypeM31Service 
{
    @Autowired
    private EvaluationTypeM31Mapper evaluationTypeM31Mapper;

    @Autowired
    private M31Mapper m31Mapper;

    /**
     * 查询教学竞赛评价标准
     * 
     * @param id 教学竞赛评价标准主键
     * @return 教学竞赛评价标准
     */
    @Override
    public EvaluationTypeM31 selectEvaluationTypeM31ById(Long id)
    {
        return evaluationTypeM31Mapper.selectEvaluationTypeM31ById(id);
    }

    /**
     * 查询教学竞赛评价标准列表
     * 
     * @param evaluationTypeM31 教学竞赛评价标准
     * @return 教学竞赛评价标准
     */
    @Override
    public List<EvaluationTypeM31> selectEvaluationTypeM31List(EvaluationTypeM31 evaluationTypeM31)
    {
        return evaluationTypeM31Mapper.selectEvaluationTypeM31List(evaluationTypeM31);
    }

    /**
     * 新增教学竞赛评价标准
     * 
     * @param evaluationTypeM31 教学竞赛评价标准
     * @return 结果
     */
    @Override
    public int insertEvaluationTypeM31(EvaluationTypeM31 evaluationTypeM31)
    {
        return evaluationTypeM31Mapper.insertEvaluationTypeM31(evaluationTypeM31);
    }

    /**
     * 修改教学竞赛评价标准
     * 
     * @param evaluationTypeM31 教学竞赛评价标准
     * @return 结果
     */
    @Override
    public int updateEvaluationTypeM31(EvaluationTypeM31 evaluationTypeM31)
    {
        return evaluationTypeM31Mapper.updateEvaluationTypeM31(evaluationTypeM31);
    }

    /**
     * 批量删除教学竞赛评价标准
     * 
     * @param ids 需要删除的教学竞赛评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM31ByIds(Long[] ids)
    {
        return evaluationTypeM31Mapper.deleteEvaluationTypeM31ByIds(ids);
    }

    /**
     * 删除教学竞赛评价标准信息
     * 
     * @param id 教学竞赛评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM31ById(Long id)
    {
        return evaluationTypeM31Mapper.deleteEvaluationTypeM31ById(id);
    }

    @Override
    public List<String> getFirstLevel() {

        return m31Mapper.getFirstLevel();
    }

    @Override
    public List<String> getSecondLevel(String firstLevel) {
//        JSONObject json = new JSONObject();
//        json.put(firstLevel,m31Mapper.getSecondLevel(firstLevel));
//        return json;
        return m31Mapper.getSecondLevel(firstLevel);
    }

}
