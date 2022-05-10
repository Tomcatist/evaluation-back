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
import com.ruoyi.web.domain.EvaluationTypeM35;
import com.ruoyi.web.service.IEvaluationTypeM35Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 申报教研课题、科研项目立项、验收和成果评价标准Controller
 * 
 * @author yyss
 * @date 2022-05-01
 */
@RestController
@RequestMapping("/evaluation/M35")
public class EvaluationTypeM35Controller extends BaseController
{
    @Autowired
    private IEvaluationTypeM35Service evaluationTypeM35Service;

    /**
     * 查询申报教研课题、科研项目立项、验收和成果评价标准列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationTypeM35 evaluationTypeM35)
    {
        startPage();
        List<EvaluationTypeM35> list = evaluationTypeM35Service.selectEvaluationTypeM35List(evaluationTypeM35);
        return getDataTable(list);
    }

    /**
     * 导出申报教研课题、科研项目立项、验收和成果评价标准列表
     */
    @Log(title = "申报教研课题、科研项目立项、验收和成果评价标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationTypeM35 evaluationTypeM35)
    {
        List<EvaluationTypeM35> list = evaluationTypeM35Service.selectEvaluationTypeM35List(evaluationTypeM35);
        ExcelUtil<EvaluationTypeM35> util = new ExcelUtil<EvaluationTypeM35>(EvaluationTypeM35.class);
        util.exportExcel(response, list, "申报教研课题、科研项目立项、验收和成果评价标准数据");
    }

    /**
     * 获取申报教研课题、科研项目立项、验收和成果评价标准详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeM35Service.selectEvaluationTypeM35ById(id));
    }

    /**
     * 新增申报教研课题、科研项目立项、验收和成果评价标准
     */
    @Log(title = "申报教研课题、科研项目立项、验收和成果评价标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationTypeM35 evaluationTypeM35)
    {
        return toAjax(evaluationTypeM35Service.insertEvaluationTypeM35(evaluationTypeM35));
    }

    /**
     * 修改申报教研课题、科研项目立项、验收和成果评价标准
     */
    @Log(title = "申报教研课题、科研项目立项、验收和成果评价标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationTypeM35 evaluationTypeM35)
    {
        return toAjax(evaluationTypeM35Service.updateEvaluationTypeM35(evaluationTypeM35));
    }

    /**
     * 删除申报教研课题、科研项目立项、验收和成果评价标准
     */
    @Log(title = "申报教研课题、科研项目立项、验收和成果评价标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeM35Service.deleteEvaluationTypeM35ByIds(ids));
    }

    /**
     * 获取一级分类
     */
    @GetMapping("/firstLevel")
    public List<String> firstLevel() {
        return evaluationTypeM35Service.getFirstLevel();
    }


    /**
     * 获取二级分类（根据一级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/secondLevel/{firstLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel) {
        return evaluationTypeM35Service.getSecondLevel(firstLevel);
    }

    /**
     * 获取三级分类（根据一级和二级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/thirdLevel/{firstLevel}/{secondLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel,@PathVariable String secondLevel) {
        return evaluationTypeM35Service.getThirdLevel(firstLevel,secondLevel);
    }

}
