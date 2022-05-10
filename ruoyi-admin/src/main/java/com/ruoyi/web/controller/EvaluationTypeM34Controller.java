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
import com.ruoyi.web.domain.EvaluationTypeM34;
import com.ruoyi.web.service.IEvaluationTypeM34Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出版论著、教材评价标准Controller
 * 
 * @author yyss
 * @date 2022-05-01
 */
@RestController
@RequestMapping("/evaluation/M34")
public class EvaluationTypeM34Controller extends BaseController
{
    @Autowired
    private IEvaluationTypeM34Service evaluationTypeM34Service;

    /**
     * 查询出版论著、教材评价标准列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EvaluationTypeM34 evaluationTypeM34)
    {
        startPage();
        List<EvaluationTypeM34> list = evaluationTypeM34Service.selectEvaluationTypeM34List(evaluationTypeM34);
        return getDataTable(list);
    }

    /**
     * 导出出版论著、教材评价标准列表
     */
    @Log(title = "出版论著、教材评价标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationTypeM34 evaluationTypeM34)
    {
        List<EvaluationTypeM34> list = evaluationTypeM34Service.selectEvaluationTypeM34List(evaluationTypeM34);
        ExcelUtil<EvaluationTypeM34> util = new ExcelUtil<EvaluationTypeM34>(EvaluationTypeM34.class);
        util.exportExcel(response, list, "出版论著、教材评价标准数据");
    }

    /**
     * 获取出版论著、教材评价标准详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(evaluationTypeM34Service.selectEvaluationTypeM34ById(id));
    }

    /**
     * 新增出版论著、教材评价标准
     */
    @Log(title = "出版论著、教材评价标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationTypeM34 evaluationTypeM34)
    {
        return toAjax(evaluationTypeM34Service.insertEvaluationTypeM34(evaluationTypeM34));
    }

    /**
     * 修改出版论著、教材评价标准
     */
    @Log(title = "出版论著、教材评价标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationTypeM34 evaluationTypeM34)
    {
        return toAjax(evaluationTypeM34Service.updateEvaluationTypeM34(evaluationTypeM34));
    }

    /**
     * 删除出版论著、教材评价标准
     */
    @Log(title = "出版论著、教材评价标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationTypeM34Service.deleteEvaluationTypeM34ByIds(ids));
    }

    /**
     * 获取一级分类
     */
    @GetMapping("/firstLevel")
    public List<String> firstLevel() {
        return evaluationTypeM34Service.getFirstLevel();
    }


    /**
     * 获取二级分类（根据一级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/secondLevel/{firstLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel) {
        return evaluationTypeM34Service.getSecondLevel(firstLevel);
    }

    /**
     * 获取三级分类（根据一级和二级分类）
     * @param firstLevel 一级分类
     */
    @GetMapping("/thirdLevel/{firstLevel}/{secondLevel}")
    public List<String> secondLevel(@PathVariable String firstLevel,@PathVariable String secondLevel) {
        return evaluationTypeM34Service.getThirdLevel(firstLevel,secondLevel);
    }

}
