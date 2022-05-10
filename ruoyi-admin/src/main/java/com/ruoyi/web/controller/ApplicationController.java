package com.ruoyi.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.web.domain.vo.ApplyVo;
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
import com.ruoyi.web.domain.Application;
import com.ruoyi.web.service.IApplicationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 申请Controller
 * 
 * @author yyss
 * @date 2022-05-01
 */
@RestController
@RequestMapping("/application/application")
public class ApplicationController extends BaseController
{
    @Autowired
    private IApplicationService applicationService;

    /**
     * 查询申请列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Application application)
    {
        startPage();
        List<Application> list = applicationService.selectApplicationList(application);
        return getDataTable(list);
    }

    /**
     * 查询申请列表（用户）
     */
    @GetMapping("/listforuser")
    public TableDataInfo listforuser(Application application)
    {
        startPage();
        List<Application> list = applicationService.selectApplicationListForUser(application);
        return getDataTable(list);
    }

    /**
     * 查询申请列表（统计）
     */
    @GetMapping("/list/sta")
    public TableDataInfo listSta(Application application)
    {
        startPage();
        List<Application> list = applicationService.selectApplicationListSta(application);
        return getDataTable(list);
    }


    /**
     * 导出申请列表
     */
    @Log(title = "申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Application application)
    {
        List<Application> list = applicationService.selectApplicationList(application);
        ExcelUtil<Application> util = new ExcelUtil<Application>(Application.class);
        util.exportExcel(response, list, "申请数据");
    }

    /**
     * 获取申请详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(applicationService.selectApplicationById(id));
    }

    /**
     * 新增申请
     */
    @Log(title = "申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Application application)
    {
        return toAjax(applicationService.insertApplication(application));
    }

    /**
     * 修改申请
     */
    @Log(title = "申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Application application)
    {
        return toAjax(applicationService.updateApplication(application));
    }

    /**
     * 删除申请
     */
    @Log(title = "申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(applicationService.deleteApplicationByIds(ids));
    }

    /**
     * 提交申请
     */
    @Log(title = "提交申请", businessType = BusinessType.INSERT)
    @PostMapping("/apply")
    public AjaxResult apply(@RequestBody ApplyVo apply)
    {
        return toAjax(applicationService.insertApplyApplication(apply));
    }

    @GetMapping("/dept")
    public List<String> getDeptName() {
        return applicationService.getDeptName();
    }

    @GetMapping("/type")
    public List<String> getType() {
        return applicationService.getType();
    }
}
