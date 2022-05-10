package com.ruoyi.web.service.impl;

import java.util.List;

import com.ruoyi.web.mapper.M35Mapper;
import com.ruoyi.web.mapper.M36Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.web.mapper.EvaluationTypeM36Mapper;
import com.ruoyi.web.domain.EvaluationTypeM36;
import com.ruoyi.web.service.IEvaluationTypeM36Service;

/**
 * 获国内外博览会奖项和申请专利获得授权评价标准Service业务层处理
 * 
 * @author yyss
 * @date 2022-05-01
 */
@Service
public class EvaluationTypeM36ServiceImpl implements IEvaluationTypeM36Service 
{
    @Autowired
    private EvaluationTypeM36Mapper evaluationTypeM36Mapper;

    @Autowired
    private M36Mapper m36Mapper;

    /**
     * 查询获国内外博览会奖项和申请专利获得授权评价标准
     * 
     * @param id 获国内外博览会奖项和申请专利获得授权评价标准主键
     * @return 获国内外博览会奖项和申请专利获得授权评价标准
     */
    @Override
    public EvaluationTypeM36 selectEvaluationTypeM36ById(Long id)
    {
        return evaluationTypeM36Mapper.selectEvaluationTypeM36ById(id);
    }

    /**
     * 查询获国内外博览会奖项和申请专利获得授权评价标准列表
     * 
     * @param evaluationTypeM36 获国内外博览会奖项和申请专利获得授权评价标准
     * @return 获国内外博览会奖项和申请专利获得授权评价标准
     */
    @Override
    public List<EvaluationTypeM36> selectEvaluationTypeM36List(EvaluationTypeM36 evaluationTypeM36)
    {
        return evaluationTypeM36Mapper.selectEvaluationTypeM36List(evaluationTypeM36);
    }

    /**
     * 新增获国内外博览会奖项和申请专利获得授权评价标准
     * 
     * @param evaluationTypeM36 获国内外博览会奖项和申请专利获得授权评价标准
     * @return 结果
     */
    @Override
    public int insertEvaluationTypeM36(EvaluationTypeM36 evaluationTypeM36)
    {
        return evaluationTypeM36Mapper.insertEvaluationTypeM36(evaluationTypeM36);
    }

    /**
     * 修改获国内外博览会奖项和申请专利获得授权评价标准
     * 
     * @param evaluationTypeM36 获国内外博览会奖项和申请专利获得授权评价标准
     * @return 结果
     */
    @Override
    public int updateEvaluationTypeM36(EvaluationTypeM36 evaluationTypeM36)
    {
        return evaluationTypeM36Mapper.updateEvaluationTypeM36(evaluationTypeM36);
    }

    /**
     * 批量删除获国内外博览会奖项和申请专利获得授权评价标准
     * 
     * @param ids 需要删除的获国内外博览会奖项和申请专利获得授权评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM36ByIds(Long[] ids)
    {
        return evaluationTypeM36Mapper.deleteEvaluationTypeM36ByIds(ids);
    }

    /**
     * 删除获国内外博览会奖项和申请专利获得授权评价标准信息
     * 
     * @param id 获国内外博览会奖项和申请专利获得授权评价标准主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationTypeM36ById(Long id)
    {
        return evaluationTypeM36Mapper.deleteEvaluationTypeM36ById(id);
    }

    @Override
    public List<String> getFirstLevel() {
        return m36Mapper.selectFirstLevel();
    }
}
