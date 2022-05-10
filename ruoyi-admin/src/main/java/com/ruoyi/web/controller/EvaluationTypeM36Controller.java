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
import com.ruoyi.web.domain.EvaluationTypeM36;
import com.ruoyi.web.service.IEvaluationTypeM36Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 获国内外博览会奖项和申请专利获得授权评价标准Controller
 * 
 * @author yyss
 * @date 2022-05-01
 */
@RestController
@RequestMapping("/evaluation/M36")
public class EvaluationTypeM36Controller extends BaseController
{
    @Autowired
    private IEvaluationTypeM36Service evaluationTypeM36Service;

    /**
     * 查询获国内外博览会奖项和申请专利获得授权评价标准列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationTypeM36 evaluationTypeM36)
    {
        startPage();
        List<EvaluationTypeM36> list = evaluationTypeM36Service.selectEvaluationTypeM36List(evaluationTypeM36);
        return getDataTable(list);
    }

    /**
     * 导出获国内外博览会奖项和申请专利获得授权评价标准列表
     */
    @Log(title = "获国内外博览会奖项和申请专利获得授权评价标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationTypeM36 evaluationTypeM36)
    {
        List<EvaluationTypeM36> list = evaluationTypeM36Service.selectEvaluationTypeM36List(evaluationTypeM36);
        ExcelUtil<EvaluationTypeM36> util = new ExcelUtil<EvaluationTypeM36>(EvaluationTypeM36.class);
        util.exportExcel(response, list, "获国内外博览会奖项和申请专利获得授权评价标准数据");
    }

    /**
     * 获取获国内外博览会奖项和申请专利获得授权评价标准详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeM36Service.selectEvaluationTypeM36ById(id));
    }

    /**
     * 新增获国内外博览会奖项和申请专利获得授权评价标准
     */
    @Log(title = "获国内外博览会奖项和申请专利获得授权评价标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationTypeM36 evaluationTypeM36)
    {
        return toAjax(evaluationTypeM36Service.insertEvaluationTypeM36(evaluationTypeM36));
    }

    /**
     * 修改获国内外博览会奖项和申请专利获得授权评价标准
     */
    @Log(title = "获国内外博览会奖项和申请专利获得授权评价标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationTypeM36 evaluationTypeM36)
    {
        return toAjax(evaluationTypeM36Service.updateEvaluationTypeM36(evaluationTypeM36));
    }

    /**
     * 删除获国内外博览会奖项和申请专利获得授权评价标准
     */
    @Log(title = "获国内外博览会奖项和申请专利获得授权评价标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeM36Service.deleteEvaluationTypeM36ByIds(ids));
    }

    /**
     * 获取一级分类
     */
    @GetMapping("/firstLevel")
    public List<String> firstLevel() {
        return evaluationTypeM36Service.getFirstLevel();
    }

}
