package com.ruoyi.web.mapper;

import java.util.List;
import com.ruoyi.web.domain.EvaluationTypeM35;

/**
 * 申报教研课题、科研项目立项、验收和成果评价标准Mapper接口
 * 
 * @author yyss
 * @date 2022-05-01
 */
public interface EvaluationTypeM35Mapper 
{
    /**
     * 查询申报教研课题、科研项目立项、验收和成果评价标准
     * 
     * @param id 申报教研课题、科研项目立项、验收和成果评价标准主键
     * @return 申报教研课题、科研项目立项、验收和成果评价标准
     */
    public EvaluationTypeM35 selectEvaluationTypeM35ById(Long id);

    /**
     * 查询申报教研课题、科研项目立项、验收和成果评价标准列表
     * 
     * @param evaluationTypeM35 申报教研课题、科研项目立项、验收和成果评价标准
     * @return 申报教研课题、科研项目立项、验收和成果评价标准集合
     */
    public List<EvaluationTypeM35> selectEvaluationTypeM35List(EvaluationTypeM35 evaluationTypeM35);

    /**
     * 新增申报教研课题、科研项目立项、验收和成果评价标准
     * 
     * @param evaluationTypeM35 申报教研课题、科研项目立项、验收和成果评价标准
     * @return 结果
     */
    public int insertEvaluationTypeM35(EvaluationTypeM35 evaluationTypeM35);

    /**
     * 修改申报教研课题、科研项目立项、验收和成果评价标准
     * 
     * @param evaluationTypeM35 申报教研课题、科研项目立项、验收和成果评价标准
     * @return 结果
     */
    public int updateEvaluationTypeM35(EvaluationTypeM35 evaluationTypeM35);

    /**
     * 删除申报教研课题、科研项目立项、验收和成果评价标准
     * 
     * @param id 申报教研课题、科研项目立项、验收和成果评价标准主键
     * @return 结果
     */
    public int deleteEvaluationTypeM35ById(Long id);

    /**
     * 批量删除申报教研课题、科研项目立项、验收和成果评价标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEvaluationTypeM35ByIds(Long[] ids);
}
