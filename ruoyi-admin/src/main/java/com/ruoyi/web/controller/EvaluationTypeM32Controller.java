package com.ruoyi.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.web.domain.EvaluationTypeM32;
import com.ruoyi.web.service.IEvaluationTypeM32Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 指导学生竞赛活动评价标准Controller
 * 
 * @author yyss
 * @date 2022-05-01
 */
@RestController
@RequestMapping("/evaluation/M32")
public class EvaluationTypeM32Controller extends BaseController
{
    @Autowired
    private IEvaluationTypeM32Service evaluationTypeM32Service;

    /**
     * 查询指导学生竞赛活动评价标准列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationTypeM32 evaluationTypeM32)
    {
        startPage();
        List<EvaluationTypeM32> list = evaluationTypeM32Service.selectEvaluationTypeM32List(evaluationTypeM32);
        return getDataTable(list);
    }

    /**
     * 导出指导学生竞赛活动评价标准列表
     */
    @Log(title = "指导学生竞赛活动评价标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationTypeM32 evaluationTypeM32)
    {
        List<EvaluationTypeM32> list = evaluationTypeM32Service.selectEvaluationTypeM32List(evaluationTypeM32);
        ExcelUtil<EvaluationTypeM32> util = new ExcelUtil<EvaluationTypeM32>(EvaluationTypeM32.class);
        util.exportExcel(response, list, "指导学生竞赛活动评价标准数据");
    }

    /**
     * 获取指导学生竞赛活动评价标准详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeM32Service.selectEvaluationTypeM32ById(id));
    }

    /**
     * 新增指导学生竞赛活动评价标准
     */
    @Log(title = "指导学生竞赛活动评价标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationTypeM32 evaluationTypeM32)
    {
        return toAjax(evaluationTypeM32Service.insertEvaluationTypeM32(evaluationTypeM32));
    }

    /**
     * 修改指导学生竞赛活动评价标准
     */
    @Log(title = "指导学生竞赛活动评价标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationTypeM32 evaluationTypeM32)
    {
        return toAjax(evaluationTypeM32Service.updateEvaluationTypeM32(evaluationTypeM32));
    }

    /**
     * 删除指导学生竞赛活动评价标准
     */
    @Log(title = "指导学生竞赛活动评价标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeM32Service.deleteEvaluationTypeM32ByIds(ids));
    }


    /**
     * 获取一级分类
     */
    @GetMapping("/firstLevel")
    public List<String> firstLevel() {
        return evaluationTypeM32Service.getFirstLevel();
    }


    /**
     * 获取二级分类（根据一级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/secondLevel/{firstLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel) {
        return evaluationTypeM32Service.getSecondLevel(firstLevel);
    }

    /**
     * 获取三级分类（根据一级和二级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/thirdLevel/{firstLevel}/{secondLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel,@PathVariable String secondLevel) {
        return evaluationTypeM32Service.getThirdLevel(firstLevel,secondLevel);
    }

}
