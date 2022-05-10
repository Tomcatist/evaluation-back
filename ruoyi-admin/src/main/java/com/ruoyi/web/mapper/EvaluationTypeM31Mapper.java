package com.ruoyi.web.mapper;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM31;

/**
 * 教学竞赛评价标准Mapper接口
 * 
 * @author yyss
 * @date 2022-04-30
 */
public interface EvaluationTypeM31Mapper 
{
    /**
     * 查询教学竞赛评价标准
     * 
     * @param id 教学竞赛评价标准主键
     * @return 教学竞赛评价标准
     */
    public EvaluationTypeM31 selectEvaluationTypeM31ById(Long id);

    /**
     * 查询教学竞赛评价标准列表
     * 
     * @param evaluationTypeM31 教学竞赛评价标准
     * @return 教学竞赛评价标准集合
     */
    public List<EvaluationTypeM31> selectEvaluationTypeM31List(EvaluationTypeM31 evaluationTypeM31);

    /**
     * 新增教学竞赛评价标准
     * 
     * @param evaluationTypeM31 教学竞赛评价标准
     * @return 结果
     */
    public int insertEvaluationTypeM31(EvaluationTypeM31 evaluationTypeM31);

    /**
     * 修改教学竞赛评价标准
     * 
     * @param evaluationTypeM31 教学竞赛评价标准
     * @return 结果
     */
    public int updateEvaluationTypeM31(EvaluationTypeM31 evaluationTypeM31);

    /**
     * 删除教学竞赛评价标准
     * 
     * @param id 教学竞赛评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM31ById(Long id);

    /**
     * 批量删除教学竞赛评价标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM31ByIds(Long[] ids);
}
