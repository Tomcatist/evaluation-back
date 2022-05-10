package com.ruoyi.web.mapper;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM38;

/**
 * 艺术类作品的及其评价标准Mapper接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface EvaluationTypeM38Mapper 
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
     * 删除艺术类作品的及其评价标准
     * 
     * @param id 艺术类作品的及其评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM38ById(Long id);

    /**
     * 批量删除艺术类作品的及其评价标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM38ByIds(Long[] ids);
}
