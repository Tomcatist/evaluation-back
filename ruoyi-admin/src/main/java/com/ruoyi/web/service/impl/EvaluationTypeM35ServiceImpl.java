package com.ruoyi.web.service.impl;

import java.util.List;

import com.ruoyi.web.mapper.M35Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.mapper.EvaluationTypeM35Mapper;
import com.ruoyi.web.domain.EvaluationTypeM35;
import com.ruoyi.web.service.IEvaluationTypeM35Service;

/**
 * 申报教研课题、科研项目立项、验收和成果评价标准Service业务层处理
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Service
public class EvaluationTypeM35ServiceImpl implements IEvaluationTypeM35Service 
{
    @Autowired
    private EvaluationTypeM35Mapper evaluationTypeM35Mapper;

    @Autowired
    private M35Mapper m35Mapper;

    /**
     * 查询申报教研课题、科研项目立项、验收和成果评价标准
     * 
     * @param id 申报教研课题、科研项目立项、验收和成果评价标准主键
     * @return 申报教研课题、科研项目立项、验收和成果评价标准
     */
    @Override
    public EvaluationTypeM35 selectEvaluationTypeM35ById(Long id)
    {
        return evaluationTypeM35Mapper.selectEvaluationTypeM35ById(id);
    }

    /**
     * 查询申报教研课题、科研项目立项、验收和成果评价标准列表
     * 
     * @param evaluationTypeM35 申报教研课题、科研项目立项、验收和成果评价标准
     * @return 申报教研课题、科研项目立项、验收和成果评价标准
     */
    @Override
    public List<EvaluationTypeM35> selectEvaluationTypeM35List(EvaluationTypeM35 evaluationTypeM35)
    {
        return evaluationTypeM35Mapper.selectEvaluationTypeM35List(evaluationTypeM35);
    }

    /**
     * 新增申报教研课题、科研项目立项、验收和成果评价标准
     * 
     * @param evaluationTypeM35 申报教研课题、科研项目立项、验收和成果评价标准
     * @return 结果
     */
    @Override
    public int insertEvaluationTypeM35(EvaluationTypeM35 evaluationTypeM35)
    {
        return evaluationTypeM35Mapper.insertEvaluationTypeM35(evaluationTypeM35);
    }

    /**
     * 修改申报教研课题、科研项目立项、验收和成果评价标准
     * 
     * @param evaluationTypeM35 申报教研课题、科研项目立项、验收和成果评价标准
     * @return 结果
     */
    @Override
    public int updateEvaluationTypeM35(EvaluationTypeM35 evaluationTypeM35)
    {
        return evaluationTypeM35Mapper.updateEvaluationTypeM35(evaluationTypeM35);
    }

    /**
     * 批量删除申报教研课题、科研项目立项、验收和成果评价标准
     * 
     * @param ids 需要删除的申报教研课题、科研项目立项、验收和成果评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM35ByIds(Long[] ids)
    {
        return evaluationTypeM35Mapper.deleteEvaluationTypeM35ByIds(ids);
    }

    /**
     * 删除申报教研课题、科研项目立项、验收和成果评价标准信息
     * 
     * @param id 申报教研课题、科研项目立项、验收和成果评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM35ById(Long id)
    {
        return evaluationTypeM35Mapper.deleteEvaluationTypeM35ById(id);
    }

    @Override
    public List<String> getFirstLevel() {
        return m35Mapper.selectFirstLevel();
    }

    @Override
    public List<String> getSecondLevel(String firstLevel) {
        return m35Mapper.selectSecondLevel(firstLevel);
    }

    @Override
    public List<String> getThirdLevel(String firstLevel, String secondLevel) {
        return m35Mapper.selectThirdLevel(firstLevel,secondLevel);
    }
}
