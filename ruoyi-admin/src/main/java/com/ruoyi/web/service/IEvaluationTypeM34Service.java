package com.ruoyi.web.service;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM34;

/**
 * 出版论著、教材评价标准Service接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface IEvaluationTypeM34Service 
{
    /**
     * 查询出版论著、教材评价标准
     * 
     * @param id 出版论著、教材评价标准主键
     * @return 出版论著、教材评价标准
     */
    public EvaluationTypeM34 selectEvaluationTypeM34ById(Long id);

    /**
     * 查询出版论著、教材评价标准列表
     * 
     * @param evaluationTypeM34 出版论著、教材评价标准
     * @return 出版论著、教材评价标准集合
     */
    public List<EvaluationTypeM34> selectEvaluationTypeM34List(EvaluationTypeM34 evaluationTypeM34);

    /**
     * 新增出版论著、教材评价标准
     * 
     * @param evaluationTypeM34 出版论著、教材评价标准
     * @return 结果
     */
    public int insertEvaluationTypeM34(EvaluationTypeM34 evaluationTypeM34);

    /**
     * 修改出版论著、教材评价标准
     * 
     * @param evaluationTypeM34 出版论著、教材评价标准
     * @return 结果
     */
    public int updateEvaluationTypeM34(EvaluationTypeM34 evaluationTypeM34);

    /**
     * 批量删除出版论著、教材评价标准
     * 
     * @param ids 需要删除的出版论著、教材评价标准主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM34ByIds(Long[] ids);

    /**
     * 删除出版论著、教材评价标准信息
     * 
     * @param id 出版论著、教材评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM34ById(Long id);

    List<String> getFirstLevel();

    List<String> getSecondLevel(String firstLevel);

    List<String> getThirdLevel(String firstLevel, String secondLevel);
}
