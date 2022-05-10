package com.ruoyi.web.mapper;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM39;

/**
 * 教学和科研获得荣誉评价标准Mapper接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface EvaluationTypeM39Mapper 
{
    /**
     * 查询教学和科研获得荣誉评价标准
     * 
     * @param id 教学和科研获得荣誉评价标准主键
     * @return 教学和科研获得荣誉评价标准
     */
    public EvaluationTypeM39 selectEvaluationTypeM39ById(Long id);

    /**
     * 查询教学和科研获得荣誉评价标准列表
     * 
     * @param evaluationTypeM39 教学和科研获得荣誉评价标准
     * @return 教学和科研获得荣誉评价标准集合
     */
    public List<EvaluationTypeM39> selectEvaluationTypeM39List(EvaluationTypeM39 evaluationTypeM39);

    /**
     * 新增教学和科研获得荣誉评价标准
     * 
     * @param evaluationTypeM39 教学和科研获得荣誉评价标准
     * @return 结果
     */
    public int insertEvaluationTypeM39(EvaluationTypeM39 evaluationTypeM39);

    /**
     * 修改教学和科研获得荣誉评价标准
     * 
     * @param evaluationTypeM39 教学和科研获得荣誉评价标准
     * @return 结果
     */
    public int updateEvaluationTypeM39(EvaluationTypeM39 evaluationTypeM39);

    /**
     * 删除教学和科研获得荣誉评价标准
     * 
     * @param id 教学和科研获得荣誉评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM39ById(Long id);

    /**
     * 批量删除教学和科研获得荣誉评价标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM39ByIds(Long[] ids);
}
