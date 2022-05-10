package com.ruoyi.web.service;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM36;

/**
 * 获国内外博览会奖项和申请专利获得授权评价标准Service接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface IEvaluationTypeM36Service 
{
    /**
     * 查询获国内外博览会奖项和申请专利获得授权评价标准
     * 
     * @param id 获国内外博览会奖项和申请专利获得授权评价标准主键
     * @return 获国内外博览会奖项和申请专利获得授权评价标准
     */
    public EvaluationTypeM36 selectEvaluationTypeM36ById(Long id);

    /**
     * 查询获国内外博览会奖项和申请专利获得授权评价标准列表
     * 
     * @param evaluationTypeM36 获国内外博览会奖项和申请专利获得授权评价标准
     * @return 获国内外博览会奖项和申请专利获得授权评价标准集合
     */
    public List<EvaluationTypeM36> selectEvaluationTypeM36List(EvaluationTypeM36 evaluationTypeM36);

    /**
     * 新增获国内外博览会奖项和申请专利获得授权评价标准
     * 
     * @param evaluationTypeM36 获国内外博览会奖项和申请专利获得授权评价标准
     * @return 结果
     */
    public int insertEvaluationTypeM36(EvaluationTypeM36 evaluationTypeM36);

    /**
     * 修改获国内外博览会奖项和申请专利获得授权评价标准
     * 
     * @param evaluationTypeM36 获国内外博览会奖项和申请专利获得授权评价标准
     * @return 结果
     */
    public int updateEvaluationTypeM36(EvaluationTypeM36 evaluationTypeM36);

    /**
     * 批量删除获国内外博览会奖项和申请专利获得授权评价标准
     * 
     * @param ids 需要删除的获国内外博览会奖项和申请专利获得授权评价标准主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM36ByIds(Long[] ids);

    /**
     * 删除获国内外博览会奖项和申请专利获得授权评价标准信息
     * 
     * @param id 获国内外博览会奖项和申请专利获得授权评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM36ById(Long id);

    List<String> getFirstLevel();
}
