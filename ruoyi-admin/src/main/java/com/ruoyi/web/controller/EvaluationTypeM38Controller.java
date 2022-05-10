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
import com.ruoyi.web.domain.EvaluationTypeM38;
import com.ruoyi.web.service.IEvaluationTypeM38Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 艺术类作品的及其评价标准Controller
 * 
 * @author yyss
 * @date 2022-05-01
 */
@RestController
@RequestMapping("/evaluation/M38")
public class EvaluationTypeM38Controller extends BaseController
{
    @Autowired
    private IEvaluationTypeM38Service evaluationTypeM38Service;

    /**
     * 查询艺术类作品的及其评价标准列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationTypeM38 evaluationTypeM38)
    {
        startPage();
        List<EvaluationTypeM38> list = evaluationTypeM38Service.selectEvaluationTypeM38List(evaluationTypeM38);
        return getDataTable(list);
    }

    /**
     * 导出艺术类作品的及其评价标准列表
     */
    @Log(title = "艺术类作品的及其评价标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationTypeM38 evaluationTypeM38)
    {
        List<EvaluationTypeM38> list = evaluationTypeM38Service.selectEvaluationTypeM38List(evaluationTypeM38);
        ExcelUtil<EvaluationTypeM38> util = new ExcelUtil<EvaluationTypeM38>(EvaluationTypeM38.class);
        util.exportExcel(response, list, "艺术类作品的及其评价标准数据");
    }

    /**
     * 获取艺术类作品的及其评价标准详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeM38Service.selectEvaluationTypeM38ById(id));
    }

    /**
     * 新增艺术类作品的及其评价标准
     */
    @Log(title = "艺术类作品的及其评价标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationTypeM38 evaluationTypeM38)
    {
        return toAjax(evaluationTypeM38Service.insertEvaluationTypeM38(evaluationTypeM38));
    }

    /**
     * 修改艺术类作品的及其评价标准
     */
    @Log(title = "艺术类作品的及其评价标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationTypeM38 evaluationTypeM38)
    {
        return toAjax(evaluationTypeM38Service.updateEvaluationTypeM38(evaluationTypeM38));
    }

    /**
     * 删除艺术类作品的及其评价标准
     */
    @Log(title = "艺术类作品的及其评价标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeM38Service.deleteEvaluationTypeM38ByIds(ids));
    }

    /**
     * 获取一级分类
     */
    @GetMapping("/firstLevel")
    public List<String> firstLevel() {
        return evaluationTypeM38Service.getFirstLevel();
    }


    /**
     * 获取二级分类（根据一级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/secondLevel/{firstLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel) {
        return evaluationTypeM38Service.getSecondLevel(firstLevel);
    }

    /**
     * 获取三级分类（根据一级和二级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/thirdLevel/{firstLevel}/{secondLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel,@PathVariable String secondLevel) {
        return evaluationTypeM38Service.getThirdLevel(firstLevel,secondLevel);
    }

}
