package com.ruoyi.web.mapper;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM33;

/**
 * 发教研科研论文评价标准Mapper接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface EvaluationTypeM33Mapper 
{
    /**
     * 查询发教研科研论文评价标准
     * 
     * @param id 发教研科研论文评价标准主键
     * @return 发教研科研论文评价标准
     */
    public EvaluationTypeM33 selectEvaluationTypeM33ById(Long id);

    /**
     * 查询发教研科研论文评价标准列表
     * 
     * @param evaluationTypeM33 发教研科研论文评价标准
     * @return 发教研科研论文评价标准集合
     */
    public List<EvaluationTypeM33> selectEvaluationTypeM33List(EvaluationTypeM33 evaluationTypeM33);

    /**
     * 新增发教研科研论文评价标准
     * 
     * @param evaluationTypeM33 发教研科研论文评价标准
     * @return 结果
     */
    public int insertEvaluationTypeM33(EvaluationTypeM33 evaluationTypeM33);

    /**
     * 修改发教研科研论文评价标准
     * 
     * @param evaluationTypeM33 发教研科研论文评价标准
     * @return 结果
     */
    public int updateEvaluationTypeM33(EvaluationTypeM33 evaluationTypeM33);

    /**
     * 删除发教研科研论文评价标准
     * 
     * @param id 发教研科研论文评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM33ById(Long id);

    /**
     * 批量删除发教研科研论文评价标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM33ByIds(Long[] ids);
}
