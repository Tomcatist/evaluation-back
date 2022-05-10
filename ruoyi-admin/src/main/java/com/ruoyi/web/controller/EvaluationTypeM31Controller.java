package com.ruoyi.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import com.alibaba.fastjson.JSONObject;
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
import com.ruoyi.web.domain.EvaluationTypeM31;
import com.ruoyi.web.service.IEvaluationTypeM31Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教学竞赛评价标准Controller
 * 
 * @author yyss
 * @date 2022-04-30
 */
@RestController
@RequestMapping("/evaluation/M31")
public class EvaluationTypeM31Controller extends BaseController
{
    @Autowired
    private IEvaluationTypeM31Service evaluationTypeM31Service;

    /**
     * 查询教学竞赛评价标准列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationTypeM31 evaluationTypeM31)
    {
        startPage();
        List<EvaluationTypeM31> list = evaluationTypeM31Service.selectEvaluationTypeM31List(evaluationTypeM31);
        return getDataTable(list);
    }

    /**
     * 导出教学竞赛评价标准列表
     */
    @Log(title = "教学竞赛评价标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationTypeM31 evaluationTypeM31)
    {
        List<EvaluationTypeM31> list = evaluationTypeM31Service.selectEvaluationTypeM31List(evaluationTypeM31);
        ExcelUtil<EvaluationTypeM31> util = new ExcelUtil<EvaluationTypeM31>(EvaluationTypeM31.class);
        util.exportExcel(response, list, "教学竞赛评价标准数据");
    }

    /**
     * 获取教学竞赛评价标准详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeM31Service.selectEvaluationTypeM31ById(id));
    }

    /**
     * 新增教学竞赛评价标准
     */
    @Log(title = "教学竞赛评价标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationTypeM31 evaluationTypeM31)
    {
        return toAjax(evaluationTypeM31Service.insertEvaluationTypeM31(evaluationTypeM31));
    }

    /**
     * 修改教学竞赛评价标准
     */
    @Log(title = "教学竞赛评价标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationTypeM31 evaluationTypeM31)
    {
        return toAjax(evaluationTypeM31Service.updateEvaluationTypeM31(evaluationTypeM31));
    }

    /**
     * 删除教学竞赛评价标准
     */
    @Log(title = "教学竞赛评价标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeM31Service.deleteEvaluationTypeM31ByIds(ids));
    }


    /**
     * 获取一级分类
     */
    @GetMapping("/firstLevel")
    public List<String> firstLevel() {
        return evaluationTypeM31Service.getFirstLevel();
    }


    /**
     * 获取二级分类（根据一级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/secondLevel/{firstLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel) {
        return evaluationTypeM31Service.getSecondLevel(firstLevel);
    }

}
