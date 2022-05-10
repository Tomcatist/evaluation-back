package com.ruoyi.web.service;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM38;

/**
 * 艺术类作品的及其评价标准Service接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface IEvaluationTypeM38Service 
{
    /**
     * 查询艺术类作品的及其评价标准
     * 
     * @param id 艺术类作品的及其评价标准主键
     * @return 艺术类作品的及其评价标准
     */
    public EvaluationTypeM38 selectEvaluationTypeM38ById(Long id);

    /**
     * 查询艺术类作品的及其评价标准列表
     * 
     * @param evaluationTypeM38 艺术类作品的及其评价标准
     * @return 艺术类作品的及其评价标准集合
     */
    public List<EvaluationTypeM38> selectEvaluationTypeM38List(EvaluationTypeM38 evaluationTypeM38);

    /**
     * 新增艺术类作品的及其评价标准
     * 
     * @param evaluationTypeM38 艺术类作品的及其评价标准
     * @return 结果
     */
    public int insertEvaluationTypeM38(EvaluationTypeM38 evaluationTypeM38);

    /**
     * 修改艺术类作品的及其评价标准
     * 
     * @param evaluationTypeM38 艺术类作品的及其评价标准
     * @return 结果
     */
    public int updateEvaluationTypeM38(EvaluationTypeM38 evaluationTypeM38);

    /**
     * 批量删除艺术类作品的及其评价标准
     * 
     * @param ids 需要删除的艺术类作品的及其评价标准主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM38ByIds(Long[] ids);

    /**
     * 删除艺术类作品的及其评价标准信息
     * 
     * @param id 艺术类作品的及其评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM38ById(Long id);

    List<String> getFirstLevel();

    List<String> getSecondLevel(String firstLevel);

    List<String> getThirdLevel(String firstLevel, String secondLevel);
}
