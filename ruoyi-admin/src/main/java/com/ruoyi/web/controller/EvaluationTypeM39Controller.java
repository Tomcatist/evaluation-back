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
import com.ruoyi.web.domain.EvaluationTypeM39;
import com.ruoyi.web.service.IEvaluationTypeM39Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教学和科研获得荣誉评价标准Controller
 * 
 * @author yyss
 * @date 2022-05-01
 */
@RestController
@RequestMapping("/evaluation/M39")
public class EvaluationTypeM39Controller extends BaseController
{
    @Autowired
    private IEvaluationTypeM39Service evaluationTypeM39Service;

    /**
     * 查询教学和科研获得荣誉评价标准列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationTypeM39 evaluationTypeM39)
    {
        startPage();
        List<EvaluationTypeM39> list = evaluationTypeM39Service.selectEvaluationTypeM39List(evaluationTypeM39);
        return getDataTable(list);
    }

    /**
     * 导出教学和科研获得荣誉评价标准列表
     */
    @Log(title = "教学和科研获得荣誉评价标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationTypeM39 evaluationTypeM39)
    {
        List<EvaluationTypeM39> list = evaluationTypeM39Service.selectEvaluationTypeM39List(evaluationTypeM39);
        ExcelUtil<EvaluationTypeM39> util = new ExcelUtil<EvaluationTypeM39>(EvaluationTypeM39.class);
        util.exportExcel(response, list, "教学和科研获得荣誉评价标准数据");
    }

    /**
     * 获取教学和科研获得荣誉评价标准详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeM39Service.selectEvaluationTypeM39ById(id));
    }

    /**
     * 新增教学和科研获得荣誉评价标准
     */
    @Log(title = "教学和科研获得荣誉评价标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationTypeM39 evaluationTypeM39)
    {
        return toAjax(evaluationTypeM39Service.insertEvaluationTypeM39(evaluationTypeM39));
    }

    /**
     * 修改教学和科研获得荣誉评价标准
     */
    @Log(title = "教学和科研获得荣誉评价标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationTypeM39 evaluationTypeM39)
    {
        return toAjax(evaluationTypeM39Service.updateEvaluationTypeM39(evaluationTypeM39));
    }

    /**
     * 删除教学和科研获得荣誉评价标准
     */
    @Log(title = "教学和科研获得荣誉评价标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeM39Service.deleteEvaluationTypeM39ByIds(ids));
    }

    /**
     * 获取一级分类
     */
    @GetMapping("/firstLevel")
    public List<String> firstLevel() {
        return evaluationTypeM39Service.getFirstLevel();
    }


    /**
     * 获取二级分类（根据一级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/secondLevel/{firstLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel) {
        return evaluationTypeM39Service.getSecondLevel(firstLevel);
    }

}
