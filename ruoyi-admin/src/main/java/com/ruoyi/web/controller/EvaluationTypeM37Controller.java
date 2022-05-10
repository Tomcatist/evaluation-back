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
import com.ruoyi.web.domain.EvaluationTypeM37;
import com.ruoyi.web.service.IEvaluationTypeM37Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 社会服务和科技成果转化评价标准Controller
 * 
 * @author yyss
 * @date 2022-05-01
 */
@RestController
@RequestMapping("/evaluation/M37")
public class EvaluationTypeM37Controller extends BaseController
{
    @Autowired
    private IEvaluationTypeM37Service evaluationTypeM37Service;

    /**
     * 查询社会服务和科技成果转化评价标准列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationTypeM37 evaluationTypeM37)
    {
        startPage();
        List<EvaluationTypeM37> list = evaluationTypeM37Service.selectEvaluationTypeM37List(evaluationTypeM37);
        return getDataTable(list);
    }

    /**
     * 导出社会服务和科技成果转化评价标准列表
     */
    @Log(title = "社会服务和科技成果转化评价标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationTypeM37 evaluationTypeM37)
    {
        List<EvaluationTypeM37> list = evaluationTypeM37Service.selectEvaluationTypeM37List(evaluationTypeM37);
        ExcelUtil<EvaluationTypeM37> util = new ExcelUtil<EvaluationTypeM37>(EvaluationTypeM37.class);
        util.exportExcel(response, list, "社会服务和科技成果转化评价标准数据");
    }

    /**
     * 获取社会服务和科技成果转化评价标准详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeM37Service.selectEvaluationTypeM37ById(id));
    }

    /**
     * 新增社会服务和科技成果转化评价标准
     */
    @Log(title = "社会服务和科技成果转化评价标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationTypeM37 evaluationTypeM37)
    {
        return toAjax(evaluationTypeM37Service.insertEvaluationTypeM37(evaluationTypeM37));
    }

    /**
     * 修改社会服务和科技成果转化评价标准
     */
    @Log(title = "社会服务和科技成果转化评价标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationTypeM37 evaluationTypeM37)
    {
        return toAjax(evaluationTypeM37Service.updateEvaluationTypeM37(evaluationTypeM37));
    }

    /**
     * 删除社会服务和科技成果转化评价标准
     */
    @Log(title = "社会服务和科技成果转化评价标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeM37Service.deleteEvaluationTypeM37ByIds(ids));
    }

    /**
     * 获取一级分类
     */
    @GetMapping("/firstLevel")
    public List<String> firstLevel() {
        return evaluationTypeM37Service.getFirstLevel();
    }


    /**
     * 获取二级分类（根据一级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/secondLevel/{firstLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel) {
        return evaluationTypeM37Service.getSecondLevel(firstLevel);
    }

    /**
     * 获取三级分类（根据一级和二级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/thirdLevel/{firstLevel}/{secondLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel,@PathVariable String secondLevel) {
        return evaluationTypeM37Service.getThirdLevel(firstLevel,secondLevel);
    }

}
