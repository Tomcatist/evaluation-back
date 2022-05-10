package com.ruoyi.web.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.web.domain.EvaluationType;
import com.ruoyi.web.service.IEvaluationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 评价类型Controller
 * 
 * @author yyss
 * @date 2022-04-30
 */
@RestController
@RequestMapping("/evaluation/type")
public class EvaluationTypeController extends BaseController
{
    @Autowired
    private IEvaluationTypeService evaluationTypeService;

    /**
     * 查询评价类型列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationType evaluationType)
    {
        startPage();
        List<EvaluationType> list = evaluationTypeService.selectEvaluationTypeList(evaluationType);
        return getDataTable(list);
    }

    /**
     * 导出评价类型列表
     */
    @Log(title = "评价类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationType evaluationType)
    {
        List<EvaluationType> list = evaluationTypeService.selectEvaluationTypeList(evaluationType);
        ExcelUtil<EvaluationType> util = new ExcelUtil<EvaluationType>(EvaluationType.class);
        util.exportExcel(response, list, "评价类型数据");
    }

    /**
     * 获取评价类型详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeService.selectEvaluationTypeById(id));
    }

    /**
     * 新增评价类型
     */
    @Log(title = "评价类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationType evaluationType)
    {
        return toAjax(evaluationTypeService.insertEvaluationType(evaluationType));
    }

    /**
     * 修改评价类型
     */
    @Log(title = "评价类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationType evaluationType)
    {
        return toAjax(evaluationTypeService.updateEvaluationType(evaluationType));
    }

    /**
     * 删除评价类型
     */
    @Log(title = "评价类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeService.deleteEvaluationTypeByIds(ids));
    }
}
