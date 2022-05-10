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
import com.ruoyi.web.domain.EvaluationTypeM33;
import com.ruoyi.web.service.IEvaluationTypeM33Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 发教研科研论文评价标准Controller
 * 
 * @author yyss
 * @date 2022-05-01
 */
@RestController
@RequestMapping("/evaluation/M33")
public class EvaluationTypeM33Controller extends BaseController
{
    @Autowired
    private IEvaluationTypeM33Service evaluationTypeM33Service;

    /**
     * 查询发教研科研论文评价标准列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationTypeM33 evaluationTypeM33)
    {
        startPage();
        List<EvaluationTypeM33> list = evaluationTypeM33Service.selectEvaluationTypeM33List(evaluationTypeM33);
        return getDataTable(list);
    }

    /**
     * 导出发教研科研论文评价标准列表
     */
    @Log(title = "发教研科研论文评价标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationTypeM33 evaluationTypeM33)
    {
        List<EvaluationTypeM33> list = evaluationTypeM33Service.selectEvaluationTypeM33List(evaluationTypeM33);
        ExcelUtil<EvaluationTypeM33> util = new ExcelUtil<EvaluationTypeM33>(EvaluationTypeM33.class);
        util.exportExcel(response, list, "发教研科研论文评价标准数据");
    }

    /**
     * 获取发教研科研论文评价标准详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeM33Service.selectEvaluationTypeM33ById(id));
    }

    /**
     * 新增发教研科研论文评价标准
     */
    @Log(title = "发教研科研论文评价标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationTypeM33 evaluationTypeM33)
    {
        return toAjax(evaluationTypeM33Service.insertEvaluationTypeM33(evaluationTypeM33));
    }

    /**
     * 修改发教研科研论文评价标准
     */
    @Log(title = "发教研科研论文评价标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationTypeM33 evaluationTypeM33)
    {
        return toAjax(evaluationTypeM33Service.updateEvaluationTypeM33(evaluationTypeM33));
    }

    /**
     * 删除发教研科研论文评价标准
     */
    @Log(title = "发教研科研论文评价标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeM33Service.deleteEvaluationTypeM33ByIds(ids));
    }


    /**
     * 获取一级分类
     */
    @GetMapping("/firstLevel")
    public List<String> firstLevel() {
        return evaluationTypeM33Service.getFirstLevel();
    }


    /**
     * 获取二级分类（根据一级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/secondLevel/{firstLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel) {
        return evaluationTypeM33Service.getSecondLevel(firstLevel);
    }

}
