package com.ruoyi.web.service;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM32;

/**
 * 指导学生竞赛活动评价标准Service接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface IEvaluationTypeM32Service 
{
    /**
     * 查询指导学生竞赛活动评价标准
     * 
     * @param id 指导学生竞赛活动评价标准主键
     * @return 指导学生竞赛活动评价标准
     */
    public EvaluationTypeM32 selectEvaluationTypeM32ById(Long id);

    /**
     * 查询指导学生竞赛活动评价标准列表
     * 
     * @param evaluationTypeM32 指导学生竞赛活动评价标准
     * @return 指导学生竞赛活动评价标准集合
     */
    public List<EvaluationTypeM32> selectEvaluationTypeM32List(EvaluationTypeM32 evaluationTypeM32);

    /**
     * 新增指导学生竞赛活动评价标准
     * 
     * @param evaluationTypeM32 指导学生竞赛活动评价标准
     * @return 结果
     */
    public int insertEvaluationTypeM32(EvaluationTypeM32 evaluationTypeM32);

    /**
     * 修改指导学生竞赛活动评价标准
     * 
     * @param evaluationTypeM32 指导学生竞赛活动评价标准
     * @return 结果
     */
    public int updateEvaluationTypeM32(EvaluationTypeM32 evaluationTypeM32);

    /**
     * 批量删除指导学生竞赛活动评价标准
     * 
     * @param ids 需要删除的指导学生竞赛活动评价标准主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM32ByIds(Long[] ids);

    /**
     * 删除指导学生竞赛活动评价标准信息
     * 
     * @param id 指导学生竞赛活动评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM32ById(Long id);

    List<String> getFirstLevel();

    List<String> getSecondLevel(String firstLevel);

    List<String> getThirdLevel(String firstLevel, String secondLevel);
}
