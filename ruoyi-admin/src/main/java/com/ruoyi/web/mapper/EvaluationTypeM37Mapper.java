package com.ruoyi.web.mapper;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM37;

/**
 * 社会服务和科技成果转化评价标准Mapper接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface EvaluationTypeM37Mapper 
{
    /**
     * 查询社会服务和科技成果转化评价标准
     * 
     * @param id 社会服务和科技成果转化评价标准主键
     * @return 社会服务和科技成果转化评价标准
     */
    public EvaluationTypeM37 selectEvaluationTypeM37ById(Long id);

    /**
     * 查询社会服务和科技成果转化评价标准列表
     * 
     * @param evaluationTypeM37 社会服务和科技成果转化评价标准
     * @return 社会服务和科技成果转化评价标准集合
     */
    public List<EvaluationTypeM37> selectEvaluationTypeM37List(EvaluationTypeM37 evaluationTypeM37);

    /**
     * 新增社会服务和科技成果转化评价标准
     * 
     * @param evaluationTypeM37 社会服务和科技成果转化评价标准
     * @return 结果
     */
    public int insertEvaluationTypeM37(EvaluationTypeM37 evaluationTypeM37);

    /**
     * 修改社会服务和科技成果转化评价标准
     * 
     * @param evaluationTypeM37 社会服务和科技成果转化评价标准
     * @return 结果
     */
    public int updateEvaluationTypeM37(EvaluationTypeM37 evaluationTypeM37);

    /**
     * 删除社会服务和科技成果转化评价标准
     * 
     * @param id 社会服务和科技成果转化评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM37ById(Long id);

    /**
     * 批量删除社会服务和科技成果转化评价标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM37ByIds(Long[] ids);
}
